package com.javaprograms;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		
		char ch;
		
		String revstr="";
		
		for(int i=0;i<str.length();i++) 
		{
			ch = str.charAt(i);
			revstr = ch+revstr;
		}
		
		System.out.println("The reverse string is: "+revstr);
	}

}
