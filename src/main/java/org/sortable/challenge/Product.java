package org.sortable.challenge;

import com.google.gson.annotations.SerializedName;

public class Product
{
    static{
        
    }
    @SerializedName("product_name") private String productName;
    private String manufacturer;
    private String model;
    private String family;
    @SerializedName("announced-date") private String announcedDate;
    private Parser<Product> productParser;

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getFamily()
    {
        return family;
    }

    public void setFamily(String family)
    {
        this.family = family;
    }

    public String getAnnouncedDate()
    {
        return announcedDate;
    }

    public void setAnnouncedDate(String announcedDate)
    {
        this.announcedDate = announcedDate;
    }

    public Parser<Product> getProductParser()
    {
        return productParser;
    }

    public void setProductParser(Parser<Product> productParser)
    {
        this.productParser = productParser;
    }

    @Override
    public String toString()
    {
        return announcedDate;
    }
}
