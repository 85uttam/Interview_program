package interview_program;

import java.util.Scanner;

public class PrimeNumbers 
{
	/*
	 A Prime number is a natural number greater than 1 that has no positive divisors 
	 other than 1 and itself. It means it is only divisible by 1 and itself, and it start from 2. 
	 The smallest prime number is 2.
	 */
	public static void main(String args[])
    {
        int start, end, i, j, count=0;
        
        /* to print all the prime numbers between any range
         * enter the two number (starting and ending number)
		 */
        
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter the Range :\n");
		
        System.out.print("Enter Starting Number : ");
        start = scan.nextInt();
        System.out.print("Enter Ending Number : ");
        end = scan.nextInt();
		
        System.out.print("Prime Numbers Between " + start + " and " +end+ " is :\n");
        for(i=start; i<=end; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
