package com.day5JavaCore;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		System.out.println("Welcome To Even Or Odd Program");
		
		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.print("Enter number : ");
		num = sc.nextInt();
		
		System.out.println("You entered "+num);

		if (num % 2 == 0) {
			System.out.println(num+" is Even");
		} else {
			System.out.println(num+" is Odd");
		}
		sc.close();
	}

}
