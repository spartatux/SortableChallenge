package org.sortable.challenge;
import java.util.ArrayList;

public class ProductMatcherImpl implements IProductMatcher{
	 
	public ArrayList<Result> matchAll(ArrayList<Product> products, ArrayList<Listing> listings)
	{
		ArrayList<Result> results = new ArrayList<Result>();
		Result aResult;
		for(Product aProduct: products){
			aResult = new Result();
			aResult.setProductName(aProduct.getProductName());
			for(Listing aListing: listings){
				if(match(aProduct, aListing)){
					aResult.addListing(aListing);
				}
			}
			results.add(aResult);
			results.removeAll(aResult.getListings());
		}
		return results;
	}
	public boolean match(Product aProduct, Listing aListing){
		String listingTitle = aListing.getTitle().toUpperCase();
		boolean manufacturerMatch =  listingTitle.contains(aProduct.getManufacturer().toUpperCase());
		boolean modelMatch =  listingTitle.contains(aProduct.getModel().toUpperCase());
		boolean familyMatch = aProduct.getFamily() == null || listingTitle.contains(aProduct.getFamily().toUpperCase());
		return manufacturerMatch && modelMatch && familyMatch;
	}
}
