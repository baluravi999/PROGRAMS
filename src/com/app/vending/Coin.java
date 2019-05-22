package com.app.vending;



	
public 	enum Coin{
	
	
		PENNY(1),NICKEL(5),DIME(10),QUARTER(25);
		int cents;
		Coin(int cents){
			this.cents=cents;
		}
		public int getCents() {
			return cents;
		}
		public static void main(String[] args) {
			System.out.println(Coin.PENNY);
		}
		
	
}
