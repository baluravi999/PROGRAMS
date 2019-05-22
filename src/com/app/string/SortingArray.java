package com.app.string;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		String s1="ababac";
		String s2="babaca";
		char[] c=s1.toCharArray();
		Arrays.sort(c);
		System.out.println(c); //aaabbc
		/*for(int i=0;i<c.length-1;i++){
			System.out.println(c[i]);
			
		}*/
		char[]  c2=s2.toCharArray();
		Arrays.sort(c2);
		System.out.println(c2);//aaabbc
		
		if(Arrays.equals(c, c2))
		{
			System.out.println("both char arrays are equal after sorting" );
		}
	}

}
