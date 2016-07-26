package com.cart;

import java.util.Iterator;
import java.util.List;

/**
 * This class is used to calculate the total cost of line items.
 * 
 * @author Vikas Sahu
 * 
 */
public class ShoppingCart {

	int totalCost;

	/**
	 * This method calculates the total cost of products.
	 * 
	 * @param itemList List of items
	 * @return the total cost
	 */
	public int getTotalItemCost(List<Items> itemList) {

		Iterator<Items> itr = itemList.iterator();
		while (itr.hasNext()) {
			Items item = itr.next();
			System.out.println(item);
			totalCost = totalCost + (item.getPrice() * item.getQuantity());
		}
		System.out.println("The total cost is :" + totalCost);
		return totalCost;

	}

}
