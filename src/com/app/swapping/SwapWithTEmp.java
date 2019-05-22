package com.app.swapping;

public class SwapWithTEmp {

	public static void main(String[] args) {
		String temp=null;
		String a="ravi";
		String b="kishore";
		System.out.println("before swap: "+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap: "+a+" "+b);
		
		int x=10;
		int y=20;
		int z;
		System.out.println("before swap: "+x+" "+y);
		
		z=x;
		x=y;
		y=z;
		System.out.println("after swap: "+x+" "+y);
		
	}

}
