package pattern_prog;
public class NumberPattern_7 
{
	
/*
1****
12***
123**
1234*
12345
 */
	public static void main(String[] args) 
	{
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i; ++j)
                System.out.print(j);
 
            for (k = n - i; k >= 1; k--)
                System.out.print("*");
 
            System.out.println();
        }
 
    }
}
