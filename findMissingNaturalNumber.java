package com.javaprograms;

import java.util.Scanner;

public class findMissingNaturalNumber {
	
	public int findMissingNumber(int[] A) {
		
		int len=A.length;
		int max = A[0];
		for(int j=0;j<len;j++) {
			if(max<=A[j]) {
				max=A[j];
			}
		}
		
		//System.out.println("Max value: "+max);

		int result = 0;
		
		if(max<1) {
			result=1;
		}
		else{
			int count=0;
			for(int k=1;k<=max+1;k++) {
				//System.out.println(k);
				for(int num:A) {
//					System.out.println("K: "+k);
//					System.out.println("A: "+num);
					if(num==k) {
						count++;
					}
				}
				//System.out.println("count: "+count+"\n");
				if(count==0) {
					result=k;
					break;
				}
				count=0;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N=0;
		
		System.out.println("Enter the size of array");
		
		N = sc.nextInt();
		
		int[] A = new int[N];
		
		System.out.println("Enter the input numbers");
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		sc.close();
		
		findMissingNaturalNumber fn = new findMissingNaturalNumber();
		System.out.println("\nSmallest positive missing number greater than 0 is: "+fn.findMissingNumber(A));
		

	}

}
