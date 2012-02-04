/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sortable.challenge;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * @author francois
 */
public class Result
{
    
    @SerializedName("product_name") private String productName;
    private ArrayList<Listing> listings;
    private IProductMatcher productMatcher;
    public Result()
    {
        listings = new ArrayList<Listing>();
    }

    /**
     * @return the productName
     */
    public String getProductName()
    {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    /**
     * @return the listings
     */
    public ArrayList<Listing> getListings()
    {
        return listings;
    }

    /**
     * add a listing
     */
    public void addListing(Listing listing)
    {
        this.listings.add(listing);
    }
}
