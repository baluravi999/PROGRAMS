package com.app.swapping;

public class SwapWithOutTemp {

	public static void main(String[] args) {
		
		String a="ravi";
		String b="kishore";
		System.out.println("Before swap: " + a + " " + b);  
		
		a=a+b;// ravikishore : 10
		
		b=a.substring(0, a.length()-b.length());//ravi :4
		a=a.substring(b.length());// kishore
		
		System.out.println("After swap : " + a + " " + b);  
		
		int m=10;
		int n=20;
		
		m=m+n;//30
		n=m-n;//10
		m=m-n;//20
		
		System.out.println("after swap :"+m+" "+n);		
}}
