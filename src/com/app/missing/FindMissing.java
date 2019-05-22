package com.app.missing;

public class FindMissing {
	static 	int  idx = 1;
	static  int sum=0;
	
	public static  int getmissNum(int[] arr){
		System.out.println(arr.length);
	int total = (arr.length + 1) * (arr.length+2) / 2;
	for (int i = 0; i < arr.length; i++)
	{
		/*
	}
	    if (arr[i] == 0)
	    {
	         idx = i; 
	    }
	    else 
	    {
	         sum += arr[i];
	    }*/
		
		total-=arr[i];
		
	}
	
	return total;
	}
	// the total sum of numbers between 1 and arr.length.
	

	//System.out.println("missing number is: " + (total - sum) + " at index " + idx);}
	public static void main(String[] args) {
		int arr[]={1,2,4,5,8,9};
        int miss= getmissNum(arr);
         System.out.println(miss);
	}

}
