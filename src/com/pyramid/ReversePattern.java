package com.pyramid;

public class ReversePattern {
  
	public static void main(String[] args) {
		
		for(int r=1;r<=5;r++){
			
			for(int c=r;c<=4;c++){
				System.out.print(" ");
			}
			for(int i=1;i<=r;i++){
				
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
