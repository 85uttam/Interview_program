package interview_program;

import java.util.Scanner;

public class Odd_Even 
{
	public static void main(String args[])
    {
        int num;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        if(num%2 == 0)
        {
            System.out.print("This is an Even Number");
        }
        else
        {
            System.out.print("This is an Odd Number");
        }
    }
}
