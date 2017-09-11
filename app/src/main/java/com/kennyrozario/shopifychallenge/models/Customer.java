package com.kennyrozario.shopifychallenge.models;

public class Customer {

    // A unique numeric identifier for the customer.
    public int id;

    // The customer's email address.
    public String email;

    // Indicates whether or not the customer would like to receive email updates from the shop.
    public boolean acceptsMarketing;

    // The date and time when the customer record was created.
    public String createdAt;

    // The date and time when the customer record was last updated.
    public String updatedAt;

    // The customer's first name.
    public String firstName;

    // The customer's last name.
    public String lastName;

    // The number of orders placed by this customer to a shop.
    public String ordersCount;

    // No documentation provided.
    public String state;

    // No documentation provided.
    public String totalSpent;

    // No documentation provided.
    public int lastOrderId;

    // Extra information about the customer.
    public String note;

    // No documentation provided.
    public boolean verifiedEmail;

    // No documentation provided.
    public String multipassIdentifier;

    // No documentation provided.
    public boolean taxExempt;

    // The customer's phone number.
    public String phone;

    // Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    public String tags;

    // No documentation provided.
    public String lastOrderName;

    public DefaultAddress defaultAddress;
}
