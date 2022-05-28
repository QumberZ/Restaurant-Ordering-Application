package edu.cuny.csi.csc330.Restaurant;

public class ShoppingMain  {

	public static void main(String[] args) {
		Catalog list = new Catalog("Popeyes Menu");
		list.add(new Item("Classic Flounder Fish Sandwich", 3.95, 2, 6.99));
		list.add(new Item("Popcorn Shrimp Meal", 6.50, 2, 11.95));
		list.add(new Item("Surf & Turf", 9.99));
		list.add(new Item("Classic Chicken Sandwich", 5.99));
		list.add(new Item("Spicy Chicken Sandwich", 6.99));
		list.add(new Item("2Pc Chicken Meal", 3.99));
		list.add(new Item("4Pc Chicken Meal", 7.99));
		list.add(new Item("10Pc CHiekn Box", 17.99));
		list.add(new Item("12Pc Chicken Family Meal", 19.99));
		list.add(new Item("8Pc Nuggets", 6.49));
		list.add(new Item("12Pc Nuggets", 8.49));
		list.add(new Item("24Pc Nuggets", 15.99));
		list.add(new Item("36Pc Nuggets", 24.69));
		list.add(new Item("4Pc Nuggets Kids Meal", 4.39));
		list.add(new Item("Homestyle Mac & Cheese", 3.99));
		list.add(new Item("Cajun Fries", 5.29));
		list.add(new Item("A la Carte Biscuits", .79, 5, 2.99));
		list.add(new Item("Cole Slaw", 2.29));
		list.add(new Item("Mashed Potattoes with Cajun Gravy", 4.19));
		list.add(new Item("Premium Lemonade", 2.29));
		list.add(new Item("Premium Strawberry Lemonade", 2.29));
		list.add(new Item("Bottle of water", .99));
		list.add(new Item("Coca-Cola", 1.79));
		list.add(new Item("Diet Coke", 1.79));
		list.add(new Item("Dr.Pepper", 1.79));
		list.add(new Item("Fanta Strawberry", 1.79));
		list.add(new Item("Sweet Tea", 1.79));
		list.add(new Item("Unsweetened Iced Tea", 1.79));
		UserMenu frame = new UserMenu(list);
		frame.setVisible(true);
	}
}
