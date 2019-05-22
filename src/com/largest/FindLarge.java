package com.largest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLarge {

	public static void main(String[] args) {
	 Integer a[]={10,3,4,5,89,76,566,43};
	 Integer b[]={2,43,45,76,5,65,45,4,56,89};
	
	 List<Integer> list=Arrays.asList(a);
	// Collections.addAll(list, a);
	 System.out.println(list.size());
	 Collections.sort(list);// by default sorting ascending
	 System.out.println(list);
	 int n=list.size();
   System.out.println(n);//find size of collection
     System.out.println("largest value is :"+a[n-1]); //print last index value
     System.out.println("smallest value is :"+a[0]);
	}

}
