package com.kennyrozario.shopifychallenge.models;

public class Refund {

    // The date and time when the refund was created. The API returns this value in ISO 8601 format.
    public String created_at;

    // The date and time when the refund was imported, in ISO 8601 format.
    public String processed_at;

    // The unique numeric identifier for the refund.
    public int id;

    // The unique numeric identifier for the refund.
    public String note;

    // Details about one returned/refunded item.
    public RefundLineItem refund_line_item;

    // Whether or not the line items were added back to the store inventory.
    public boolean restock;

    // The unique identifier of the user who performed the refund.
    public int user_id;
}
