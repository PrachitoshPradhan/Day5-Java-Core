package com.day5JavaCore;
import java.util.Scanner;
import java.lang.Integer;

public class FlipCoin {
	public static void main(String[] args) {
     
		int heads=0;
		int tails=0;
		int check;
		
		System.out.println("Enter the no of flips: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for (int i=1; i<=n;i++)
		{
			check= (int) (Math.floor(Math.random()*10)%2);
			if (check==0)
			{
				System.out.println("Tails");
				tails++;
			}
			else
			{
				System.out.println("Heads");
				heads++;
			}
		}
		sc.close();
		
		
		System.out.println("Heads percentage is = "+ ((float)heads*100/n+"%"));
		System.out.println("Tails percentage is = "+ ((float)tails*100/n+"%"));
	
		
		
	}

}
