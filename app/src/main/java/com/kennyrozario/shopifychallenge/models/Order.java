package com.kennyrozario.shopifychallenge.models;

public class Order {

    // The unique numeric identifier for the order.
    public long id;

    // The customer's email address.
    public String email;

    // The date and time when the order was closed. Null if order is not closed.
    public String closedAt;

    // This auto-generated property is the date and time when the order was created in Shopify, in ISO 8601 format.
    public String createdAt;

    // The date and time when the order was last modified. The API returns this value in ISO 8601 format.
    public String updatedAt;

    // Numerical identifier unique to the shop.
    public int number;

    // The text of an optional note that a shop owner can attach to the order.
    public String note;

    // Unique identifier for a particular order.
    public String token;

    // The payment gateway used.
    public String gateway;

    // No documentation provided.
    public boolean test;

    // The sum of all the prices of all the items in the order, taxes and discounts included (must be positive).
    public String totalPrice;

    // Price of the order before shipping and taxes
    public double subtotalPrice;

    // The sum of all the weights of the line items in the order, in grams.
    public int totalWeight;

    // The sum of all the taxes applied to the order (must be positive).
    public String totalTax;

    // States whether or not taxes are included in the order subtotal.
    public boolean taxesIncluded;

    // The three letter code (ISO 4217) for the currency used for the payment.
    public String currency;

    // Can be one of "pending", "authorized", "partially_paid", "paid", "partially_refunded", "refunded", or "voided".
    public String financialStatus;

    // No documentation provided.
    public boolean confirmed;

    // The total amount of the discounts to be applied to the price of the order.
    public String totalDiscounts;

    // The sum of all the prices of all the items in the order.
    public String totalLineItemsPrice;

    // Unique identifier for a particular cart that is attached to a particular order.
    public String cartToken;

    // Indicates whether or not the person who placed the order would like to receive email updates from the shop.
    public boolean buyerAcceptsMarketing;

    // The customer's order name as represented by a number.
    public String name;

    // The website that the customer clicked on to come to the shop.
    public String referringSite;

    // The URL for the page where the buyer landed when entering the shop.
    public String landingSite;

    // The date and time when the order was cancelled. Null if not cancelled.
    public String canceledAt;

    // The reason why the order was cancelled. Can be: "customer", "fraud", "inventory" or "other".
    public String cancelReason;

    // No documentation provided.
    public String totalPriceUsd;

    // No documentation provided.
    public String checkoutToken;

    // No documentation provided.
    public String reference;

    // The unique numerical identifier for the user logged into the terminal at the time the order was processed at.
    public int userId;

    // No documentation provided.
    public int locationId;

    // No documentation provided.
    public String sourceIdentifier;

    // No documentation provided.
    public String sourceUrl;

    // The date and time when the order was imported, in ISO 8601 format.
    public String processedAt;

    // No documentation provided.
    public String deviceId;

    // The customer's phone number.
    public String phone;

    // The two or three letter language code, optionally followed by a region modifier.
    public String customerLocale;

    // Unique identifier of the app who created the order.
    public int appId;

    // The IP address of the browser used by the customer when placing the order.
    public String browserIp;

    // No documentation provided.
    public String landingSiteRef;

    // A unique numeric identifier for the order.
    public int orderNumber;

    // Applicable discount codes that can be applied to the order. If no codes exist the value will default to blank.
    public DiscountCode[] discountCodes;

    // Extra information that is added to the order. Each array entry must contain a hash with "name" and "value" keys.
    public NoteAttribute[] noteAttributes;

    // The list of all payment gateways used for the order.
    public String[] paymentGatewayNames;

    // States the type of payment processing method.
    public String processingMethod;

    // No documentation provided.
    public String checkoutId;

    // Where the order originated.
    public String sourceName;

    // Can be one of "fulfilled", null, or "partial"
    public String fulfillmentStatus;

    // An array of tax_line objects, each of which details the total taxes applicable to the order.
    public TaxLine[] taxLines;

    // Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    public String tags;

    // No documentation provided.
    public String contactEmail;

    // The URL pointing to the order status web page. The URL will be null unless the order was created from a checkout.
    public String orderStatusUrl;

    // No documentation provided.
    public LineItem[] lineItems;

    // An array of shipping_line objects, each of which details the shipping methods used.
    public ShippingLine[] shippingLines;

    // The mailing address associated with the payment method. May not appear on all orders.
    public BillingAddress billingAddress;

    // The mailing address to where the order will be shipped. This address is optional and will not be available on orders that do not require one.
    public ShippingAddress shippingAddress;

    // No documentation provided.
    public Fulfillment[] fulfillments;

    // The list of refunds applied to the order.
    public Refund[] refunds;

    // An object containing information about the customer. This value may be null if the order was created through Shopify POS.
    public Customer customer;
}
