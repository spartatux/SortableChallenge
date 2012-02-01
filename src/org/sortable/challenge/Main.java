package org.sortable.challenge;

import com.google.gson.Gson;

public class Main
{


    public static void main(String args[])
    {
        test();
    }

    public static void test()
    {
        String testListing =
                "{\"title\":\"Fujifilm Finepix Z20fd 10MP Digital Camera with 3x Optical Zoom (Wasabi Green)\",\"manufacturer\":\"FUJIFILM\",\"currency\":\"USD\",\"price\":\"249.95\"}";
        String testProduct =
                "{\"product_name\":\"Canon-IXUS-310HS\",\"manufacturer\":\"Canon\",\"model\":\"310 HS\",\"family\":\"IXUS\",\"announced-date\":\"2011-02-06T19:00:00.000-05:00\"}";

        //gsonB.registerTypeAdapter(GregorianCalendar.class, new ListingTypeAdapter());
        Gson gsonParser = new Gson();
        System.out.println(gsonParser.fromJson(testListing, Listing.class));
        System.out.println(gsonParser.fromJson(testProduct, Product.class));
        
        System.out.println(Configuration.getPropertie("listingFile"));
     
        
    }

//    private static class ListingTypeAdapter implements JsonDeserializer<GregorianCalendar>
//     {
//    
//
//        @Override
//        public GregorianCalendar deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException
//        {
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            
//            return null;
//        }
//    }
}
