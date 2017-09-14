package com.kennyrozario.shopifychallenge;

import android.text.TextUtils;

import com.kennyrozario.shopifychallenge.models.Customer;
import com.kennyrozario.shopifychallenge.models.JsonResponse;
import com.kennyrozario.shopifychallenge.models.LineItem;
import com.kennyrozario.shopifychallenge.models.Order;
import com.kennyrozario.shopifychallenge.util.OkHttpHelper;
import com.kennyrozario.shopifychallenge.util.RxUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import okhttp3.Call;
import okhttp3.Response;

public class MainPresenter implements MainContract.Presenter {

    private static final String URL = "https://shopicruit.myshopify.com/admin/orders.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6";
    private static final String LINE_ITEM_TITLE = "Awesome Bronze Bag";
    private static final String FIRST_NAME = "Napoleon";
    private static final String LAST_NAME = "Batz";

    private MainContract.View mView;

    private CompositeDisposable mSubscription = new CompositeDisposable();
    private Order[] mOrders;

    public MainPresenter(MainContract.View view) {
        mView = view;
    }

    @Override
    public void start() {

        mView.showYourShopifyStoreTitle();

        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<JsonResponse> jsonAdapter = moshi.adapter(JsonResponse.class);

        if (!mView.hasNetworkConnection()) {
            mView.showErrorRetrievingInformationMessage();
            return;
        }

        mSubscription.add(getResponseObservable()
                .map(response -> {
                    if (response != null && response.body() != null) {
                        return jsonAdapter.fromJson(response.body().string());
                    }
                    return null;
                })
                .filter(jsonResponse -> jsonResponse != null)
                .map(jsonResponse -> {
                    mOrders = jsonResponse.orders;
                    return jsonResponse.orders;
                })
                .observeOn(RxUtils.getMainScheduler())
                .map(orders -> {
                    showTotalSpentByCustomer(FIRST_NAME, LAST_NAME);
                    showAmountOfProductSold(LINE_ITEM_TITLE);
                    return orders;
                })
                .doOnError(err -> {
                    mView.showErrorRetrievingInformationMessage();
                })
                .subscribe());
    }

    private void showTotalSpentByCustomer(String firstName, String lastName) {
        if (mOrders != null && mOrders.length > 0 && !TextUtils.isEmpty(firstName) && !TextUtils.isEmpty(lastName)) {

            double totalSpentByCustomer = 0;
            boolean customerFound = false;
            for (Order order : mOrders) {
                Customer customer = order.customer;

                if (customer != null && firstName.equalsIgnoreCase(customer.first_name) && lastName.equalsIgnoreCase(customer.last_name)) {
                    customerFound = true;
                    totalSpentByCustomer = Double.valueOf(customer.total_spent);
                    break;
                }
            }

            if (customerFound) {
                mView.showTotalSpentByCustomerMessage(String.valueOf(totalSpentByCustomer));
            } else {
                mView.showCustomerNotFoundMessage(firstName, lastName);
            }

        } else {
            mView.showErrorRetrievingInformationMessage();
        }
    }

    private void showAmountOfProductSold(String lineItemTitle) {

        if (mOrders != null && mOrders.length > 0 && !TextUtils.isEmpty(lineItemTitle)) {

            int amountOfLineItemSold = 0;
            boolean productFound = false;
            for (Order order : mOrders) {
                LineItem[] lineItems = order.line_items;

                if (lineItems != null && lineItems.length > 0) {
                    for (LineItem lineItem : lineItems) {
                        if (lineItemTitle.equalsIgnoreCase(lineItem.title)) {
                            productFound = true;
                            amountOfLineItemSold += lineItem.quantity;
                            break;
                        }
                    }
                }
            }

            if (productFound) {
                mView.showTotalAmountOfProductSoldMessage(String.valueOf(amountOfLineItemSold));
            } else {
                mView.showProductNotFoundMessage(lineItemTitle);
            }
        } else {
            mView.showErrorRetrievingInformationMessage();
        }
    }

    @Override
    public void stop() {
        mSubscription = RxUtils.unsubscribe(mSubscription);
    }

    private Observable<Response> getResponseObservable() {
        OkHttpHelper helper = new OkHttpHelper(URL);

        try {
            return helper.getCallObservable()
                    .observeOn(RxUtils.getBackgroundScheduler())
                    .map(Call::execute);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
