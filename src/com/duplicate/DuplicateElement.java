package com.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
  public static void main(String[] args) {
	 //1.find dupicate elements in array normal approch
	  String names[]={"java","c","c++","c","java","spring","java"};
	  int i=0,j=0, count=0; String duplicate="";
	  for( i=0;i<names.length;i++){
		  for( j=i+1;j<names.length;j++){
			  if(names[i].equals(names[j])){
				  count=count+1;
				  duplicate=duplicate+names[i]+",";
				 
			  }
				  
			  }
		 } 
	  System.out.println("duplicate elements are :"+duplicate+" count :"+count);
	  
	  System.out.println("...........");
	 //2 using hash set object
	  Set<String> set=new LinkedHashSet<String>();
	 
	  for(String name:names){
		 
		 if(set.add(name)==false) {
			 System.out.println("dupicate elements "+name);
		 }
		 
	  }/*//3. array tp list than add to set
	 List<String> listArray= Arrays.asList(names);
	 Set<String> setArray=new HashSet<String>(listArray);
	 
	  
	  //find dupicate elements in arraylist 
	  
	  List<String> list=new ArrayList<String>();
	  list.add("a");
	  list.add("b");
	  list.add("c");
	  list.add("a");
	  
	  for(String s:list){
		  System.out.print(s);
	  }
	   System.out.println();
	  Set<String> set1 =new HashSet<String>();
	  set1.add("d");
	  set1.addAll(list);
	  System.out.println(set1);
	  for(String s:set1){
		  System.out.print(s);
	  }
	  
	 for(String s1:list){
		 if(set.add(s1)==false){
			 System.out.println(" duplicate elements are "+s1);
		 }
	 }
	 */
	 
	 
	
	  
}}
	  
  
