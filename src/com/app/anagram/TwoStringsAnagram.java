package com.app.anagram;

import java.util.Arrays;

public class TwoStringsAnagram {
	
	public boolean isTwoStringsAnagram(String s1, String s2){
		boolean flag=false;
		if(s1.length()==s2.length()){
			
			
			// string to cahr[]
			char []c1=s1.toCharArray();
		  char c2[]=s2.toCharArray();
		  
		  //sort array[]
		  Arrays.sort(c1);
		  Arrays.sort(c2);
		  // compare two chars
		  for(int i=0;i<=c1.length-1;i++){
			  if(c1[i]==c2[i]){
				  flag=true;
			  }
		  else{
			  flag=false;
		  }
		  }}
		return flag;
	}
	
	public static void main(String[] args) {
		String s1="abadd";
		String s2="bdcae";
		TwoStringsAnagram  t=new TwoStringsAnagram ();
	System.out.println(	t.isTwoStringsAnagram(s1, s2));
	  
	  
		}
	
	

	

}
