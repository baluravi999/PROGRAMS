package com.app;


class BooleanExample{   
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 System.out.println(data);
	 }  
	     
	 public static void main(String args[]){  
	   BooleanExample op=new BooleanExample();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data); 
	   int result = 0;

       Boolean b1 = new Boolean("ravi");// false
       Boolean b2 = new Boolean("Ravi");// false
       Boolean b3 = new Boolean("tRuE"); //true
       Boolean b4 = new Boolean("false");// false

       if (b1 == b2)  /* Line 10 */ 
           result = 1; //
       if (b1.equals(b2) ) /* Line 12 */
           result = result + 10; //10
       if (b2 == b4)  /* Line 14 */
           result = result + 100;
       if (b2.equals(b4) ) /* Line 16 */
           result = result + 1000; //10+1000=1010
       if (b2.equals(b3) ) /* Line 18 */
           result = result + 10000;

       System.out.println("result = " + result);
	  
	 }  
	}  