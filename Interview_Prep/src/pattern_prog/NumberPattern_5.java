package pattern_prog;

public class NumberPattern_5 
{
	/*
	1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
	 */
	public static void main(String[] args) 
	{   
        int n= 5;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
