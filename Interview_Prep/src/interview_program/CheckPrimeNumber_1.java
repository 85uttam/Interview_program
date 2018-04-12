package interview_program;

import java.util.Scanner;

public class CheckPrimeNumber_1 
{
	/*
	 A Prime number is a natural number greater than 1 that has no positive divisors 
	 other than 1 and itself. It means it is only divisible by 1 and itself, and it start from 2. 
	 The smallest prime number is 2.
	 */
	public static void main(String args[])
    {
        int num, i, count=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
