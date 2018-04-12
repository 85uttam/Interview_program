package pattern_prog;

public class NumberPattern_6 
{

/*
5
54
543
5432
54321
 */
	public static void main(String[] args) 
	{
        int i = 5;
        while (i >= 1) 
        {
            int j = 5;
            while (j >= i) 
            {
                System.out.print(j);
                j--;
            }
            i--;
            System.out.println();
        }
    }
}
