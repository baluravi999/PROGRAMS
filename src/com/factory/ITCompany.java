package com.factory;

public class ITCompany {
	String pro="i am it property";
 private ITCompany(){
	 
 }
 static ITCompany getItComany(){
	   
	  return new ITCompany();
	  
 }
   Employee getEmployee(){
	   return new Employee ();
			  
   }
}
