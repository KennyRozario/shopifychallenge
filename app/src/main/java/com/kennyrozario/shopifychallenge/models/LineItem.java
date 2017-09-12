package com.kennyrozario.shopifychallenge.models;

public class LineItem {

    // The id of the line_item within the fulfillment.
    public long id;

    // The id of the product variant being fulfilled.
    public String variant_id;

    // The title of the product.
    public String title;

    // The number of items in the fulfillment.
    public int quantity;

    // The price of the item.
    public String price;

    // The weight of the item in grams.
    public int grams;

    // A unique identifier of the item in the fulfillment.
    public String sku;

    // The title of the product variant being fulfilled.
    public String variant_title;

    // The name of the supplier of the item.
    public String vendor;

    // Service provider who is doing the fulfillment.
    public String fulfillment_service;

    // The unique numeric identifier for the product in the fulfillment.
    public long product_id;

    // Specifies whether or not a customer needs to provide a shipping address when placing an order for this product variant.
    public boolean requires_shipping;

    // No documentation provided.
    public boolean taxable;

    // No documentation provided.
    public boolean gift_card;

    // The name of the product variant.
    public String name;

    // Returns the name of the inventory management system.
    public String variant_inventory_management;

    // Returns additional properties associated with the line item.
    public String[] properties;

    // States whether or not the product exists.
    public boolean product_exists;

    // The amount available to fulfill.
    public int fulfillable_quantity;

    // No documentation provided.
    public String total_discount;

    // Status of an order in terms of the line_items being fulfilled. Valid values are: fulfilled, null or partial.
    public String fulfillment_status;

    public TaxLine[] tax_lines;
}
