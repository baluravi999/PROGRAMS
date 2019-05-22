package com.app.mobile;

public class MobilePattern {

	public long getMobilePattern(String s){
		String result="";// empty string 
		//write abc than result is 222, bad=223, deg=334
		for(int i=0;i<s.length();i++){
			Character s1=s.charAt(i);
			String s2=String.valueOf(s1);
			if(s2.equals("a")||s2.equals("b")||s2.equals("c")){
				result=result+ 2;
			}else if(s2.equals("d")||s2.equals('e')||s2.equals("f")){
				result=result+3;
			}
			else if(s2.equals("g")||s2.equals("h")||s2.equals("i")){
				result=result+4;
				
			}
			else if(s2.equals("j")||s2.equals("k")||s2.equals("l")){
				result=result+5;
		}else if(s2.equals("m")||s2.equals("n")||s2.equals("o")){
			result=result+6;}
			
			else if(s2.equals("p")||s2.equals("q")||s2.equals("r")||s2.equals("s")){
				result=result+7;}
			else if(s2.equals("t")||s2.equals("u")||s2.equals("v")){
				result=result+8;}
		else if(s2.equals("w")||s2.equals("x")||s2.equals("y")||s2.equals("z")){
			result=result+9;}
		}return Long.parseLong(result);
	}
	
	public static void main(String[] args) {
		MobilePattern m=new MobilePattern();
		String s="mantra";
		System.out.println(m.getMobilePattern(s));
		
	}
	
}
