package org.sortable.challenge;

public class Listing {
    private String title;
    private String manufacturer;
    private String currency;
    private float price;
    private Parser<Listing> listingParser;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Parser<Listing> getListingParser() {
        return listingParser;
    }

    public void setListingParser(Parser<Listing> listingParser) {
        this.listingParser = listingParser;
    }

    @Override
    public String toString() {
        return title;
    }
}
