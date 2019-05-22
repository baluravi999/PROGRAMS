package com.app.vending;

public enum Item {

	COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45);
	 private String item;
	 private int price;
	
	Item(String item, int price)
	{
		this.item=item;
		this.price=price;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}

	public static void main(String[] args) {
		
		for(Item i:Item.values()){
			System.out.println(i.getPrice());
		}
		
	}
}
