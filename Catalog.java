package edu.cuny.csi.csc330.Restaurant;

import java.util.ArrayList;

public class Catalog {
	private String name;
	private int size;
	private ArrayList<Item> Items;

	public Catalog(String n) {
		this.name = n;
		this.size = 0;
		Items = new ArrayList<Item>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int size() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Item get(int index) {
		return this.Items.get(index);
	}

	public void add(Item item) {
		this.Items.add(item);
		this.size++;
	}

}