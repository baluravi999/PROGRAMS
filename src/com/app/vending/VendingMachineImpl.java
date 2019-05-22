package com.app.vending;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements IVendingMachine  {

	@Override
	public long selectItemAndGetPrice(Item item) {
		
		 
		
		return item.getPrice();
	}

	@Override
	public void insertCoin(Coin coin) {
		long currentBal = 0;
		currentBal =	currentBal+coin.getCents();
		
		
		
	}

	@Override
	public List<Coin> refund() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	public List<Coin> getChange(long amount){
		
		List<Coin> list=new ArrayList<Coin>();
		if(amount>0){
		long	balance=amount;
			while(balance>0){
				if(balance>=Coin.QUARTER.getCents()){
					list.add(Coin.QUARTER);
					balance=balance-Coin.QUARTER.getCents();
					continue;
				}else if(balance>=Coin.DIME.getCents()){
						list.add(Coin.DIME);
						balance=balance-Coin.DIME.getCents();
						continue;
					}
				
					
				else if(balance>=Coin.NICKEL.getCents()){
					list.add(Coin.NICKEL);
					balance=balance-Coin.NICKEL.getCents();
					continue;
				}else if(balance>=Coin.PENNY.getCents()){
					list.add(Coin.PENNY);
					balance=balance-Coin.PENNY.getCents();
					continue;
					
				} 
			}//while
	
		}//if
		
		return list;
		
		
	}
	public static void main(String[] args) {
		VendingMachineImpl v=new VendingMachineImpl();
		System.out.println(v.getChange(7));
	} 
	
	
}
