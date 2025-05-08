package com.javaprograms;

public class findMaxProfit {

	public static void main(String[] args) {
		
		//int arr[] = {7,1,5,3,6,4};
		
		int arr[] = {8,5,4,-2,3};
		
		int maxProfit=0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(maxProfit<arr[j]-arr[i]) {
					maxProfit=arr[j]-arr[i];
				}
			}
		}
		
		if(maxProfit>0) {
			System.out.println("The max profit is: "+maxProfit);
		}
		else {
			System.out.println("No profit");
		}

	}

}
