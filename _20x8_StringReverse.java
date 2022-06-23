package com.examples;

import java.util.Scanner;

// kullanıcı tarafından girilen bir kelimeyi tersten yazdıran Algoritma ?
// yazdığınız kelime kaç harfli ?
// Hamit ==> timaH
//

public class _20x8_StringReverse {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		String kelime = klavye.nextLine();
		
		System.out.println("Reversed String: " + getReverse(kelime));
		System.out.println("Reversed String: " + getReverse2(kelime));
		
	}
	
	public static String getReverse(String klavye) {
		
		StringBuilder builder = new StringBuilder();
		String reverse = builder.append(klavye).reverse().toString();
		return reverse;
	}
	
	public static String getReverse2(String klavye) {
		String reverseWord = "";
		
		for (int i = klavye.length() - 1; i >= 0; i--) {
			reverseWord += klavye.charAt(i);
			
		}
		return reverseWord;
	}
	
}
