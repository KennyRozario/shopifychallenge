package com.kennyrozario.shopifychallenge.models;

public class Order {

    // The unique numeric identifier for the order.
    public long id;

    // The customer's email address.
    public String email;

    // The date and time when the order was closed. Null if order is not closed.
    public String closed_at;

    // This auto-generated property is the date and time when the order was created in Shopify, in ISO 8601 format.
    public String created_at;

    // The date and time when the order was last modified. The API returns this value in ISO 8601 format.
    public String updated_at;

    // Numerical identifier unique to the shop.
    public long number;

    // The text of an optional note that a shop owner can attach to the order.
    public String note;

    // Unique identifier for a particular order.
    public String token;

    // The payment gateway used.
    public String gateway;

    // No documentation provided.
    public boolean test;

    // The sum of all the prices of all the items in the order, taxes and discounts included (must be positive).
    public String total_price;

    // Price of the order before shipping and taxes
    public double subtotal_price;

    // The sum of all the weights of the line items in the order, in grams.
    public int total_weight;

    // The sum of all the taxes applied to the order (must be positive).
    public String total_tax;

    // States whether or not taxes are included in the order subtotal.
    public boolean taxes_included;

    // The three letter code (ISO 4217) for the currency used for the payment.
    public String currency;

    // Can be one of "pending", "authorized", "partially_paid", "paid", "partially_refunded", "refunded", or "voided".
    public String financial_status;

    // No documentation provided.
    public boolean confirmed;

    // The total amount of the discounts to be applied to the price of the order.
    public String total_discounts;

    // The sum of all the prices of all the items in the order.
    public String total_line_items_price;

    // Unique identifier for a particular cart that is attached to a particular order.
    public String cart_token;

    // Indicates whether or not the person who placed the order would like to receive email updates from the shop.
    public boolean buyer_accepts_marketing;

    // The customer's order name as represented by a number.
    public String name;

    // The website that the customer clicked on to come to the shop.
    public String referring_site;

    // The URL for the page where the buyer landed when entering the shop.
    public String landing_site;

    // The date and time when the order was cancelled. Null if not cancelled.
    public String canceled_at;

    // The reason why the order was cancelled. Can be: "customer", "fraud", "inventory" or "other".
    public String cancel_reason;

    // No documentation provided.
    public String tota_price_usd;

    // No documentation provided.
    public String checkout_token;

    // No documentation provided.
    public String reference;

    // The unique numerical identifier for the user logged into the terminal at the time the order was processed at.
    public Long user_id;

    // No documentation provided.
    public Long location_id;

    // No documentation provided.
    public String source_identifier;

    // No documentation provided.
    public String source_url;

    // The date and time when the order was imported, in ISO 8601 format.
    public String processed_at;

    // No documentation provided.
    public String device_id;

    // The customer's phone number.
    public String phone;

    // The two or three letter language code, optionally followed by a region modifier.
    public String customer_locale;

    // Unique identifier of the app who created the order.
    public int app_id;

    // The IP address of the browser used by the customer when placing the order.
    public String browser_ip;

    // No documentation provided.
    public String landing_site_ref;

    // A unique numeric identifier for the order.
    public int order_number;

    // Applicable discount codes that can be applied to the order. If no codes exist the value will default to blank.
    public DiscountCode[] discount_codes;

    // Extra information that is added to the order. Each array entry must contain a hash with "name" and "value" keys.
    public NoteAttribute[] note_attributes;

    // The list of all payment gateways used for the order.
    public String[] payment_gateway_names;

    // States the type of payment processing method.
    public String processing_method;

    // No documentation provided.
    public String checkout_id;

    // Where the order originated.
    public String source_name;

    // Can be one of "fulfilled", null, or "partial"
    public String fulfillment_status;

    // An array of tax_line objects, each of which details the total taxes applicable to the order.
    public TaxLine[] tax_lines;

    // Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    public String tags;

    // No documentation provided.
    public String contact_email;

    // The URL pointing to the order status web page. The URL will be null unless the order was created from a checkout.
    public String order_status_url;

    // No documentation provided.
    public LineItem[] line_items;

    // An array of shipping_line objects, each of which details the shipping methods used.
    public ShippingLine[] shipping_lines;

    // The mailing address associated with the payment method. May not appear on all orders.
    public BillingAddress billing_address;

    // The mailing address to where the order will be shipped. This address is optional and will not be available on orders that do not require one.
    public ShippingAddress shipping_address;

    // No documentation provided.
    public Fulfillment[] fulfillments;

    // The list of refunds applied to the order.
    public Refund[] refunds;

    // An object containing information about the customer. This value may be null if the order was created through Shopify POS.
    public Customer customer;
}
