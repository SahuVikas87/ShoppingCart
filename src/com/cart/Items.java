package com.cart;

/**
 * Data object for the items.
 * 
 * @author Vikas Sahu
 * 
 */
public class Items {
	
	/* The item name e.g Apples,Oranges etc.*/
	private String itemName;
	/* The item price e.g 10.*/
	private int Price;
	/* The item quantity  e.g 3. */
	private int quantity;
	
	/**
	 * Gets the itemName
	 *
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * Sets the itemName
	 *
	 * @param itemName the itemName 
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * Gets the price
	 *
	 * @return the price
	 */
	public int getPrice() {
		return Price;
	}
	/**
	 * Sets the price
	 *
	 * @param price the price 
	 */
	public void setPrice(int price) {
		Price = price;
	}
	/**
	 * Gets the quantity
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * Sets the quantity
	 *
	 * @param quantity the quantity 
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "Items [itemName=" + itemName + ", Price=" + Price
				+ ", quantity=" + quantity + "]";
	}
	
}
