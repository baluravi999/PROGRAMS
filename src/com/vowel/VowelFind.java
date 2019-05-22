package com.vowel;

import java.util.Scanner;

public class VowelFind {

	
	public static void main(String[] args) {
		
		System.out.println("enter one character");
		String s=new Scanner(System.in).next();
		if(s.equalsIgnoreCase("a")){
			System.out.println(s+" "+"is a vowel");
		}
		else if(s.equals("e")){
			System.out.println(s+" "+"is a vowel");
		}
		else if(s.equals("i")){
			System.out.println(s+" "+"is a vowel");
		}else if(s.equals("o")){
			System.out.println(s+" "+"is a vowel");
		}else if(s.equals("u")){
			System.out.println(s+" "+"is a vowel");
		}else{
			System.out.println(s+" "+"is not a vowel");
		}
		
		
	}
}
