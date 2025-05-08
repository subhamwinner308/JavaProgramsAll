package com.javaprograms;

import java.util.Scanner;

public class LastWordLength {
	
	public int lengthOfLastWord(String s) {
        s.trim().replaceAll("( )+", " ");
        //s.replace("  ", " ");
        //System.out.print(s);
        String lastWord = s.substring(s.lastIndexOf(" ")+1);
        return lastWord.length();
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input sentence");
		String s = sc.nextLine();
		
		sc.close();
		
		LastWordLength lastwordlength = new LastWordLength();
		
		System.out.println(lastwordlength.lengthOfLastWord(s));

	}

}
