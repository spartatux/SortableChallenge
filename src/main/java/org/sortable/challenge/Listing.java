package org.sortable.challenge;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Listing {
    private String title;
    private String manufacturer;
    private String currency;
    private float price;
    private static Parser<Listing> listingParser;

    static{
        listingParser = new GSonParser<Listing>(Configuration.getPropertie("listingFile"));
    }

    public static ArrayList<Listing> getAll()throws FileNotFoundException,IOException{
	return listingParser.getAll();
    }
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

    public static void setListingParser(Parser<Listing> aListingParser) {
        listingParser = aListingParser;
    }

    @Override
    public String toString() {
        return title;
    }
}
