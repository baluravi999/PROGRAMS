package com.palindrom.num;

public class PalindromExp {

	public static void main(String[] args) {
	  
		int n=221;int sum=0;int rem=0;
		int temp=n;
      while(n>0){
    	 rem= n%10;
         sum=(sum*10)+rem;
    	 n=n/10;
      }
    if(sum==temp){
    	System.out.println(temp +"\t"+"is a palindrom");
    } 
    else
    	
    	
    {System.out.println(temp +"is not a palindrom");
    	
    }
	}

}
