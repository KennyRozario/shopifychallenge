package com.kennyrozario.shopifychallenge;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainPresenter mPresenter;

    private TextView mTotalSpent;
    private TextView mProductSold;
    private TextView mCongratulations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTotalSpent = (TextView) findViewById(R.id.total_spent);
        mProductSold = (TextView) findViewById(R.id.product_sold);
        mCongratulations = (TextView) findViewById(R.id.congratulations);
        ImageView shopifyLogo = (ImageView) findViewById(R.id.shopify_logo);

        mPresenter = new MainPresenter(this);
        mPresenter.start();

        shopifyLogo.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
            shopifyLogo.startAnimation(animation);
        });
    }

    @Override
    public void showTotalSpentByCustomerMessage(String totalSpent) {
        String message = getString(R.string.napoleon_spent_money);
        String replace = "%1$s";
        int begin = message.indexOf(replace);
        int end = begin + replace.length();

        StringBuilder builder = new StringBuilder(message)
                .replace(begin, end, totalSpent);

        mCongratulations.setVisibility(View.VISIBLE);
        mTotalSpent.setText(builder);
    }

    @Override
    public void showCustomerNotFoundMessage(String firstName, String lastName) {
        String message = getString(R.string.customer_not_found_message);
        String replace = "%1$s";
        int begin = message.indexOf(replace);
        int end = begin + replace.length();

        StringBuilder builder = new StringBuilder(message)
                .replace(begin, end, firstName)
                .append(" ")
                .append(lastName);

        mTotalSpent.setText(builder);
    }

    @Override
    public void showTotalAmountOfProductSoldMessage(String totalAmountOfProductSold) {
        String message = getString(R.string.bronze_bags_sold);
        String replace = "%1$s";
        int begin = message.indexOf(replace);
        int end = begin + replace.length();

        StringBuilder builder = new StringBuilder(message)
                .replace(begin, end, totalAmountOfProductSold);

        mCongratulations.setVisibility(View.VISIBLE);
        mProductSold.setText(builder);
    }

    @Override
    public void showProductNotFoundMessage(String listItemTitle) {
        String message = getString(R.string.product_not_found_message);
        String replace = "%1$s";
        int begin = message.indexOf(replace);
        int end = begin + replace.length();

        StringBuilder builder = new StringBuilder(message)
                .replace(begin, end, listItemTitle);

        mProductSold.setText(builder);
    }

    @Override
    public void showErrorRetrievingInformationMessage() {
        mTotalSpent.setText(R.string.error_retriving_information);
    }

    @Override
    public void showYourShopifyStoreTitle() {
        setTitle(R.string.your_shopify_store);
    }

    @Override
    public boolean hasNetworkConnection() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }

    @Override
    protected void onDestroy() {
        mPresenter.stop();
        super.onDestroy();
    }
}
