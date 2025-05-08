package com.javaprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int power=arr.length-1;
        BigInteger num1= new BigInteger("0");
        for(int i=0;i<arr.length;i++) {
        	num1=num1.add(BigInteger.valueOf(arr[i]*(int)Math.pow(10, power)));
        	power--;
        }
        //System.out.println("Input number: "+num1+"\nNumber of digits: "+power);
        BigInteger addValue = new BigInteger("1");
        BigInteger num2=new BigInteger("0");
        num2 = num1.add(addValue);
        String snum2=String.valueOf(num2);
        int strlen = snum2.length();
        int[] newdigits = new int[strlen];
        BigInteger ten = new BigInteger("10");
        while(!num2.equals(BigInteger.ZERO)) {
        	newdigits[strlen-1]=(num2.remainder(ten)).intValue();
        	num2=num2.divide(ten);
        	strlen--;
        }
        
        for(int k=0;k<newdigits.length;k++) {
        	System.out.print(newdigits[k]+" ");
        }
		
	}

}
