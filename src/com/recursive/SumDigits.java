package com.recursive;

public class SumDigits {
  
	public static int getSum(int n){
		int sum=0;int rem=0; 
		while(n>0)
		
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(SumDigits.getSum(16));
		//getSum(345);
	}
} 

