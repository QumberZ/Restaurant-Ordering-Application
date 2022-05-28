package edu.cuny.csi.csc330.Restaurant;

public class Item {
	private double price;
	private String name;
	private int bulkQuantity;
	private double bulkPrice;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBulkQuantity() {
		return bulkQuantity;
	}

	public void setBulkQuantity(int bulkQuantity) {
		this.bulkQuantity = bulkQuantity;
	}

	public double getBulkPrice() {
		return bulkPrice;
	}

	public void setBulkPrice(double bulkPrice) {
		this.bulkPrice = bulkPrice;
	}

	public Item(String n, double p) {
		name = n;
		price = p;
	}

	public Item(String n, double p, int bq, double bp) {
		name = n;
		price = p;
		bulkQuantity = bq;
		bulkPrice = bp;
	}

	double priceFor(int quantity) {
		double totalPrice = 0.0;
		while (quantity > this.bulkQuantity && this.bulkQuantity > 0) {
			totalPrice += this.bulkPrice;
			quantity /= this.bulkQuantity;
		}
		totalPrice += (quantity * this.price);
		return totalPrice;
	}

	@Override
	public String toString() {
		if (bulkQuantity == 0.0) {
			return name + ", $" + price;
		}
		return name + ", $" + price + " (" + bulkQuantity + " for $" + bulkPrice + ")";
	}

}