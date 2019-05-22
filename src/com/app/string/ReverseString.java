package com.app.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="ravi";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		String st=sb.toString();// s=sb.reverse().toString();
		System.out.println(st);
		st.concat(s);
		System.out.println(s);
		
		String original="radar";
		int n=original.length();
		System.out.println(n);
		String reverse="";
		String reverse1=null; 
		//System.out.println(reverse1.length());// throws exception null pointer
		System.out.println(reverse.length()); // length 0 obj created
		
		for(int i=n-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
			
		}System.out.println(reverse.length());//5
		if(original.equals(reverse)){
			System.out.println("both are equal");
		}else
			System.out.println("both are not equal");
		byte b1=127;
		byte b2=10;
		byte b3=  (byte) (b1+b2);
		int b4=b1+b2;
		System.out.println(b3)	;//-119
		System.out.println(b4);//137
		String s2=null; 
		String s1="sjs";
		String s3=s2+s1;
	    System.out.println(s3);//nullsjs
		
		}
	
}
