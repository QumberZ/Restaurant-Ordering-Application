package edu.cuny.csi.csc330.Restaurant;

import java.awt.Color;
import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<ItemOrder> itemOrders;
	private boolean discount;
	public static final Color VERY_DARK_RED = new Color(153, 0, 0);
	public static final Color DARK_YELLOW = new Color(255, 204, 0);

	public ShoppingCart() {
		this.itemOrders = new ArrayList<ItemOrder>();
	}

	public void add(ItemOrder item) {
		this.itemOrders.add(item);
	}

	public void setDiscount(boolean value) {
		this.discount = value;
	}

	public double getTotal() {
		double totalCost = 0.0;
		for (int i = 0; i < itemOrders.size(); ++i) {
			totalCost = totalCost + itemOrders.get(i).getPrice();
		}
		if (this.discount) {
			return totalCost * 0.90;
		}
		return totalCost;
	}
}
