package com.factory;

public class Test {
public static void main(String[] args) {
	//ITCompany it=new ITCompany(); private constructor out side class can not accesses
   ITCompany it=ITCompany.getItComany();
  System.out.println(it.pro); 
	
	//System.out.println(a.pro);
	//Test t=new Test();
 Employee e= it.getEmployee();
     System.out.println(e.s);
     
     String d = "bookkeeper";
     String s=d.substring(1,7);
     System.out.println(s);
    // d = "w" + d;
     d.concat("woo");  /* Line 4 */
     System.out.println(d);
    char c1='a';
    char c2='b';
    System.out.println(c1);
    System.out.println(c1+c2);
}
}
