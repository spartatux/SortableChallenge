package org.sortable.challenge;

import com.google.gson.annotations.SerializedName;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Product
{

    @SerializedName("product_name") private String productName;
    private String manufacturer;
    private String model;
    private String family;
    @SerializedName("announced-date") private String announcedDate;
    private static Parser<Product> productParser;

    static{
        productParser = new GSonParser<Product>(Configuration.getPropertie("productFile"));
    }
    public static ArrayList<Product> getAll() throws FileNotFoundException, IOException
    {
        return productParser.getAll();
    } 
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

    public static Parser<Product> getProductParser()
    {
        return productParser;
    }

    public static void setProductParser(Parser<Product> aProductParser)
    {
        productParser = aProductParser;
    }

    @Override
    public String toString()
    {
        return announcedDate;
    }
}
