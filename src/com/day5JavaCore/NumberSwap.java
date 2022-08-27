package com.day5JavaCore;
import java.util.Scanner;

public class NumberSwap {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number , M= ");
		int M = sc.nextInt();
		System.out.println("Enter the second number , N= ");
		int N = sc.nextInt();
		
		System.out.println("BEFORE SWAP");
		System.out.println("M = "+M+" & N = "+N);
		
		int temp = M;
		M = N;
		N = temp;
		
		System.out.println("AFTER SWAP");
		System.out.println("M = "+M+" & N = "+N);	
		
		System.out.println("Numbers are swaped successfully.");
		
		sc.close();
	}

}
