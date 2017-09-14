package com.kennyrozario.shopifychallenge;

public interface MainContract {

    interface View {

        void showYourShopifyStoreTitle();

        void showTotalSpentByCustomerMessage(String totalSpent);

        void showCustomerNotFoundMessage(String firstName, String lastName);

        void showTotalAmountOfProductSoldMessage(String totalAmountOfProductSold);

        void showProductNotFoundMessage(String listItemTitle);

        void showErrorRetrievingInformationMessage();

        boolean hasNetworkConnection();
    }

    interface Presenter {

        void start();

        void stop();
    }
}
