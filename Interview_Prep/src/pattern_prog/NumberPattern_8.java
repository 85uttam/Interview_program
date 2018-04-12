package pattern_prog;
public class NumberPattern_8 
{

/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1
 */
	public static void main(String[] args) 
	{
        int i, j, k;
        for (i = 1; i <= 5; i++) 
        {
            for (j = 1; j <= 5 - i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
        for (i = 1; i <= 4; i++) 
        {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= 5 - i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
    }

}
