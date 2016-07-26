package com.cart.test;

import java.util.ArrayList;
import java.util.List;

import com.cart.Items;
import com.cart.ShoppingCart;

import junit.framework.TestCase;

/**
 * Test class for shopping cart.
 * 
 * @author Vikas Sahu
 *
 */
public class ShoppingCartTest extends TestCase{
	
	/**
	 * Test method 
	 */
	public void testShoppingcart(){
		
		List<Items> items = new ArrayList<Items>();
		// Line Item 1
		Items item1 = new Items();
		item1.setItemName("Apples");
		item1.setPrice(10);
		item1.setQuantity(2);
		
		// Line Item 2
		Items item2 = new Items();
		item2.setItemName("Oranges");
		item2.setPrice(15);
		item2.setQuantity(2);

		// Line Item 3
		Items item3 = new Items();
		item3.setItemName("Lemons");
		item3.setPrice(5);
		item3.setQuantity(5);

		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		ShoppingCart cart = new ShoppingCart();
		
		// business call
		int cost = cart.getTotalItemCost(items);
		
		assertNotNull(cost);
		assertEquals(75,cost);
		
	}

}
