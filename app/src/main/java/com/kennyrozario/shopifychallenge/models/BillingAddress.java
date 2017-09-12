package com.kennyrozario.shopifychallenge.models;

public class BillingAddress {

    // The first name of the person associated with the payment method.
    public String first_name;

    // The street address of the billing address.
    public String address1;

    // The phone number at the billing address.
    public String phone;

    // The city of the billing address.
    public String city;

    // The zip or postal code of the billing address.
    public String zip;

    // The name of the state or province of the billing address.
    public String province;

    // The name of the country of the billing address.
    public String country;

    // The last name of the person associated with the payment method.
    public String last_name;

    // An optional additional field for the street address of the billing address.
    public String address2;

    // The company of the person associated with the billing address.
    public String company;

    // No documentation provided.
    public Float latitude;

    // No documentation provided.
    public Float longitude;

    // The full name of the person associated with the payment method.
    public String name;

    // The two-letter code (ISO 3166-1 alpha-2 two-letter country code) for the country of the billing address.
    public String country_code;

    // The two-letter abbreviation of the state or province of the billing address.
    public String province_code;
}
