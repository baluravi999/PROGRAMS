package com.app.string;

public class Comapare {
   public void getSatring(String s){
	   System.out.println(s);
   }
	public static void main(String[] args) {
		
		String requser="ravi";
		String getuser="ravi";
	    String pwd="kishore";
	    if(requser.equals(getuser)&&pwd.equals("kishore")){
	   	System.out.println("method login success");
	    }else
	    {
		System.out.println("method invallid login");
	}
	    if((requser==getuser)&&(pwd=="kishore")){
	    	System.out.println("operator login success");
	    }else{
	    	System.out.println("operator login invallid");
	    }
	
}
	
}