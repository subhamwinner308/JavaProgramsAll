package com.javaprograms;

import java.util.Scanner;

public class RotateArray {
	
	public void rotate(int[] nums, int k) {
		int len=nums.length;
        for (int i = 0; i < k; i++)   {
        //calling function without passing the number of rotations  
        rotateArrayByOne(nums, len); 
        }   
        System.out.print("[");
        for(int p=0;p<len;p++){
            System.out.print(nums[p]);
            if(p!=len-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
	
	public static void rotateArrayByOne(int array[], int n) {   
        int i, temp;   
        //temporary array to store the newly created array  
        temp = array[n - 1];   
        for (i = n-1; i > 0; i--)   {
        	//shifts array element to the left by 1  
            array[i] = array[i - 1];
        }   
        array[0] = temp;   
        }   

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotations");
		int k=sc.nextInt();
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter the input array");
		for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            }
		RotateArray rotatearray = new RotateArray();
		rotatearray.rotate(nums, k);
	}

}
