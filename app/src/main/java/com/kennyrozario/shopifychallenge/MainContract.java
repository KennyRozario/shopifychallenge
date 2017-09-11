package com.kennyrozario.shopifychallenge;

public interface MainContract {

    interface View {

    }

    interface Presenter {

        void start();

        void stop();

        void onFindTotalSpentByCustomerRequested(String firstName, String lastName);

        void onFindAmountOfProductSoldRequested(String lineItemTitle);
    }
}
