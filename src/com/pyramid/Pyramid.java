package com.pyramid;

public class Pyramid {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int j=i; j<=4;j++){
				System.out.print(" ");
			}
			for(int n=i;n<2*i-1;n++){
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
}}
