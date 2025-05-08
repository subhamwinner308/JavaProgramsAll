package com.javaprograms;

import java.util.Scanner;

public class PalindromeWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String str1 = s.replaceAll("[^a-zA-Z0-9]", " ");
		
		String newstr = str1.replaceAll("\\s+","").toLowerCase();
		
		//System.out.println(newstr);
		
		String revstr=" ";
		for(int i=newstr.length()-1;i>=0;i--) {
			revstr+=newstr.charAt(i);
		}
		
		String newrevstr = revstr.trim().toLowerCase();
		
		//System.out.println(newrevstr);
		
		if(newstr.equals(revstr)) {
			System.out.println("Palindrome");
		}

	}

}
