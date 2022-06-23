package com.examples;

import java.util.Scanner;

public class _22x2_Factoriyel {
	
	public static void main(String[] args) {
		int fact = 1;
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz :");
		int number = klavye.nextInt();
		
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Girilen sayının faktoriyeli :" + fact);
		
	}
	
}
