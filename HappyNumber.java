package com.javaprograms;

import java.util.Scanner;

public class HappyNumber {
	
	public boolean isHappyNumber(int num) {
		boolean happy=false;
		if(num==1){
            happy=true;
        }
        else {
        	int count=0;
        	while(num!=1 && count<9){
        		count++;
        		num=sqareSumNumber(num);
            }
        	if(num==1){
                happy=true;
            }
            }
            return happy;
        }
	
	public static int sqareSumNumber(int num) {
		int sum=0;
        int r=0;
        while(num!=0){
        r=num%10;
        sum=sum+(int)Math.pow(r,2);
        num=num/10;
        }
        return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		HappyNumber happynumber = new HappyNumber();
		System.out.println(happynumber.isHappyNumber(n));
		
	}
	}
