package interview_program;

import java.util.Scanner;

public class CheckPrimeNumber 
{
	/*
	 A Prime number is a natural number greater than 1 that has no positive divisors 
	 other than 1 and itself. It means it is only divisible by 1 and itself, and it start from 2. 
	 The smallest prime number is 2.
	 */

	public static void main(String[] args) 
	{
		int no, i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=s.nextInt();
		if(no==1)
		{
			System.out.println("Smallest Prime number is 2");
		}
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Not Prime");
				break;
			}
		}
		if(no==i)
		{
			System.out.println("Prime");
		}
	}
}
