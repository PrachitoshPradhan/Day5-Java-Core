package com.day5JavaCore;
import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto which power of 2 is to be calculted: ");
		int pow = sc.nextInt();
		
		if (pow<0)
		{
			pow = -pow;
		}
		
		double result = 1;
		for(int i=1 ; i<=pow; i++)
		{
			result = result * 2;
		}
		System.out.println("2^"+pow+" = "+result);
	}

}
