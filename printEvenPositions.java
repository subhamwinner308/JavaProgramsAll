package com.javaprograms;

import java.util.Scanner;

public class printEvenPositions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size=0;
		
		System.out.println("Enter the size of array");
		
		size = sc.nextInt();
		
		int num[] = new int[size];
		
		System.out.println("Enter the numbers");
		
		for(int i=0;i<size;i++)
		{
			num[i] = sc.nextInt();
		}
		
		System.out.print("The even position numbers are: ");
		
		for(int j=0;j<size;j++)
		{
			if(j%2 == 0) {
				System.out.print(num[j]+" ");
			}
		}

	}

}
