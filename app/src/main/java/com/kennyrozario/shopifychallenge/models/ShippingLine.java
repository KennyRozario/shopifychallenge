package com.kennyrozario.shopifychallenge.models;

public class ShippingLine {

    // A reference to the shipping method.
    public String code;

    // The price of this shipping method.
    public double price;

    // The source of the shipping method.
    public String source;

    // The title of the shipping method.
    public String title;

    // A list of tax_line objects, each of which details the taxes applicable to this shipping_line.
    public TaxLine[] taxLines;

    // A reference to the carrier service that provided the rate.
    public String carrierIdentifier;

    // A reference to the fulfillment service that is being requested for the shipping method.
    public String requestedFulfillmentServiceId;
}
