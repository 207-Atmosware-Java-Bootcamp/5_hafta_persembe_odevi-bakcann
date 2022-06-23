package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _22x3_Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int number = klavye.nextInt();
		
		System.out.println(fibonacci(number));
		
	}
	
	public static List<Integer> fibonacci(int number) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		
		int temp = 0;
		for (int i = 2; i <= number; i++) {
			temp = arr.get(i - 1) + arr.get(i - 2);
			arr.add(i, temp);
		}
		return arr;
	}
	
}
