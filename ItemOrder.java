package edu.cuny.csi.csc330.Restaurant;

public class ItemOrder {
	private Item item;
	private int quantity;

	public ItemOrder(Item item, int q) {
		this.item = item;
		this.quantity = q;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getPrice() {
		return this.item.priceFor(this.quantity);
	}
}
