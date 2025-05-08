package com.javaprograms;

import java.util.Scanner;

public class JumpGame {
	
	public boolean canJump(int[] nums) {
		boolean jump=false;
		int len=nums.length;
        if(nums.length==1){
            jump=true;
        }
        else{
        	int i=0;
            while(i<len-1) {
            	if(nums[i]+i>len-1) {
            		System.out.println("Run");
            		jump=false;
            		break;
            	}
            	else if(nums[i]+i==len-1) {
            		jump=true;
            	}
            	i=newIndex(nums);
            }
            
        }
        return jump;   
	}
	
	public int newIndex(int[] nums) {
		int i=0;
		i=nums[i]+i;
		return i;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int nums[] = new int[size];
		System.out.println("Enter the array");
		
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		
		JumpGame jump = new JumpGame();
		
		System.out.println(jump.canJump(nums));
	}

}
