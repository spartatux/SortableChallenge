package org.sortable.challenge;
import java.util.ArrayList;

public interface IProductMatcher {
	public ArrayList<Result> matchAll(ArrayList<Product> products, ArrayList<Listing> listings);
	public boolean match(Product aProduct, Listing aListing);
}
