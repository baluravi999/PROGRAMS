package com.app.missing;

public class MissingElement {
 
	public static void main(String[] args) {
		int[] a={1,2,4,5,6,9};
		int n=8,count=1;
		int temp=0;
		boolean isin=true;
		for(int i=0;i<a.length;i++){
			if(a[i]!=count){
				System.out.println("missing element is"+count);
				for(int j=count+1;j<=a[i];j++){
					temp=j;
					isin=true;
					if(a[i]!=j){
						System.out.println("missing element is"+j);
					}//if
				}//for
				if(isin==true)
					
				{
					count=temp;
				}
				count++;
				isin=false;
			}
		}
	}
} 
