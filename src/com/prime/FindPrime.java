package com.prime;

public class FindPrime {
   
	
	public static void main(String[] args) {
		int n=17;
	boolean	flag=true;
		for(int i=2;i<n;i++){ //i is checking everytime
		if(n%i==0)   
		{ 
			flag=false;
			break;
		}
	}
		if(flag==true){
			System.out.println(n+" "+"is a prime number");
		}
		else
			System.out.println(n+" "+"is not prime");
}}
