package com.kennyrozario.shopifychallenge.models;

public class RefundLineItem {

    // The unique identifier of the refund line item.
    public int id;

    // The single line item being returned.
    public LineItem lineItem;

    // The id of the related line item.
    public int lineItemId;

    // The quantity of the associated line item that was returned.
    public int quantity;
}
