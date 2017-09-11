package com.kennyrozario.shopifychallenge;

import com.kennyrozario.shopifychallenge.models.JsonResponse;
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

    private MainContract.View mView;

    private String mUrlString = "https://shopicruit.myshopify.com/admin/orders.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6";
    private CompositeDisposable mSubscription = new CompositeDisposable();
    private Order[] mOrders;

    public MainPresenter(MainContract.View view) {
        mView = view;
    }

    @Override
    public void start() {
        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<JsonResponse> jsonAdapter = moshi.adapter(JsonResponse.class);

        mSubscription.add(Observable.defer(this::getResponseObservable)
                .map(response -> {
                    if (response != null && response.body() !=null) {
                        return jsonAdapter.fromJson(response.body().string());
                    }
                    return null;
                })
                .filter(jsonResponse -> jsonResponse != null)
                .map(jsonResponse -> {
                    mOrders = jsonResponse.orders;
                    return jsonResponse.orders;
                })
                .subscribe());
    }

    @Override
    public void onFindTotalSpentByCustomerRequested(String firstName, String lastName) {

    }

    @Override
    public void onFindAmountOfProductSoldRequested(String lineItemTitle) {

    }

    @Override
    public void stop() {
        mSubscription = RxUtils.unsubscribe(mSubscription);
    }

    private Observable<Response> getResponseObservable() {
        OkHttpHelper helper = new OkHttpHelper(mUrlString);

        try {
            return helper.getRequestObservable()
                    .observeOn(RxUtils.getBackgroundScheduler())
                    .map(Call::execute);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
