/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sortable.challenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francois
 */
public class Configuration
{

    private final static String propertieFile = "challenge.propertie";
    private static Properties properties = null;
    static
    {
        try
        {
            properties = new Properties();
            loadDefaultProperties();
            loadProperties();
        }
        catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Properties file not loaded", ex);
        }
    }

    public static String getPropertie(String name)
    {
        return properties.getProperty(name);
    }

    private static void loadDefaultProperties()
    {
        Logger.getLogger(Main.class.getName()).log(Level.INFO, "Loading default properties ...");
        properties.setProperty("listingFile", "listings.txt");
        properties.setProperty("productFile", "products.txt");
        properties.setProperty("resultFile", "results.txt");
        Logger.getLogger(Main.class.getName()).log(Level.INFO, "Default properties loaded.");
    }

    public static void loadProperties() throws IOException
    {

        Logger.getLogger(Main.class.getName()).log(Level.INFO, "Properties file loading...");
        File propertiesFile = new File(propertieFile);

        if (!propertiesFile.exists())
        {
            Logger.getLogger(Main.class.getName()).log(Level.WARNING, "Properties file not found a new properties file have been created.");
            propertiesFile.createNewFile();
            properties.store(new FileOutputStream(propertiesFile),
                             "Create default properties file");
        }
        properties.load(new FileInputStream(new File(propertieFile)));

        Logger.getLogger(Main.class.getName()).log(Level.INFO, "Properties file loaded.");
    }
}
