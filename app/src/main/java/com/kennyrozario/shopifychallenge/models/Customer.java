package com.kennyrozario.shopifychallenge.models;

public class Customer {

    // A unique numeric identifier for the customer.
    public long id;

    // The customer's email address.
    public String email;

    // Indicates whether or not the customer would like to receive email updates from the shop.
    public boolean accepts_marketing;

    // The date and time when the customer record was created.
    public String created_at;

    // The date and time when the customer record was last updated.
    public String updated_at;

    // The customer's first name.
    public String first_name;

    // The customer's last name.
    public String last_name;

    // The number of orders placed by this customer to a shop.
    public int orders_count;

    // No documentation provided.
    public String state;

    // No documentation provided.
    public String total_spent;

    // No documentation provided.
    public long last_order_id;

    // Extra information about the customer.
    public String note;

    // No documentation provided.
    public boolean verified_email;

    // No documentation provided.
    public String multipass_identifier;

    // No documentation provided.
    public boolean tax_exempt;

    // The customer's phone number.
    public String phone;

    // Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    public String tags;

    // No documentation provided.
    public String last_order_name;

    public DefaultAddress default_address;
}
