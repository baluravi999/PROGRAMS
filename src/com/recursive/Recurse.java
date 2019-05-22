package com.recursive;

public class Recurse {
   
	static int n1=0,n2=1, n3=0;
	
	static void fibo(int count){
		if(count>0){
		n3=n2+n1;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
	  fibo(count-1);}
	}
	
	public static void main(String[] args) {
		
		
		int count=10;
		System.out.print(n1+" "+n2);// print 2 values
		fibo(count-2); //already 2 value printed 

	}

}
