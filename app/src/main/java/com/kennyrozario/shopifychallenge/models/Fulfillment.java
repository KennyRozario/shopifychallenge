package com.kennyrozario.shopifychallenge.models;

public class Fulfillment {

    // The date and time when the fulfillment was created. The API returns this value in ISO 8601 format.
    public String createdAt;

    // A unique numeric identifier for the fulfillment.
    public int id;

    // A historical record of each item in the fulfillment.
    public LineItem[] lineItems;

    // A flag indicating whether the customer should be notified.
    public boolean notifyCustomer;

    // The unique numeric identifier for the order.
    public int orderId;

    // Text field that provides information about the receipt.
    public Receipt receipt;

    // The status of the fulfillment. Can be one of "pending", "open", "success", "cancelled", "error" or "failure"
    public String status;

    // The name of the tracking company.
    public String trackingCompany;

    // A list of tracking numbers, provided by the shipping company.
    public String[] trackingNumbers;

    // The URLs to track the fulfillment.
    public String[] trackingUrls;

    // The date and time when the fulfillment was last modified. The API returns this value in ISO 8601 format.
    public String updatedAt;

    // States the name of the inventory management service.
    public String variantInventoryManagement;
}
