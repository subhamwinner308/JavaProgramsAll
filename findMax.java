package com.javaprograms;

import java.util.Scanner;

public class findMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++) 
		{
			num[i] = sc.nextInt();
		}
		
		int temp=0;
		
		for(int j=0;j<size-1;j++)
		{
			for(int k=j+1;k<size;k++)
			{
				if(num[j]>num[k])
				{
					temp=num[j];
					num[j]=num[k];
					num[k]=temp;
				}
			}
		}
		System.out.println("Enter sorted numbers are");
		for(int i=0;i<size;i++) 
		{
			System.out.print(num[i]+" ");
		}
		System.out.println("\n"+"The max number is: "+num[size-1]);
		System.out.println("The second max number is: "+num[size-2]);
	}

}
