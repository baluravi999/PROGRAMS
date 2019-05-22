package com.app.add;

public class SumOfTwo {
	
	public static boolean sumOfTwo(int a,int b,int c){
		if((a+b==c)||(b+c==a)||(c+a==b)){
			return true;
		}else 
			return false;
		 
	}

	public static void main(String[] args) {
		
		System.out.println(sumOfTwo(1,1,2));
	}

}
