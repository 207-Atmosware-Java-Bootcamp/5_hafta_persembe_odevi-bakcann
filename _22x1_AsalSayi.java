package com.examples;

import java.util.Scanner;

public class _22x1_AsalSayi {
	
	public static void main(String[] args) {
		
		// girilen bir sayıın asal olup olmaması kodlayan algoritma
		
		int counter = 0;
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz :");
		int number = klavye.nextInt();
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Asal bir sayi girdiniz : " + number);
		} else {
			System.out.println("Girdiğiniz sayi asal sayi değildir : " + number);
		}
		
	}
	
}
