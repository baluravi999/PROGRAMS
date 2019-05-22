package com.app;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
 int count;
 Parent(){
	 this.count=count+1;
 }
  
	 synchronized void M1() throws IOException// super
	{
		
		
	} 
public 	class Child extends Parent{
		void M1()throws FileNotFoundException// sub
		{
			
		}
	
	}
		
	public static void main(String[] args) {
		
		Parent p=new Parent();
		Parent p1=new Parent();
		System.out.println(p1.count);
	

		
	}

}
