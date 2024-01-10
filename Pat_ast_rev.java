import java.util.Scanner;

class Pat_ast_rev 
{
    static int i = 1;
    static int r = 1;
    static int n;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        pattern();
        reflection();
    }
    private static void pattern() 
    {
        if ((int) Math.sqrt(Math.pow((i - (2 * n - 1) * (r - 1) - n), 2)) < r) 
        {
            System.out.print("*");
        } 
        else 
        {
            System.out.print(" ");
        }

        if ((i - (2 * n - 1) * (r - 1)) % (2 * n - 1) == 0) 
        {
            System.out.println();
            r++;
        }

        if (i++ < n * (2 * n - 1)) 
        {
            pattern();
        }
    }
    
    private static void reflection() 
    {
        i = n * (2 * n - 1) - 1;
        r = n;

        while (i >= 1) 
        {
            if ((int) Math.sqrt(Math.pow((i - (2 * n - 1) * (r - 1) - n), 2)) < r) 
            {
                System.out.print("*");
            } 
            else 
            {
                System.out.print(" ");
            }

            if ((i - (2 * n - 1) * (r - 1)) % (2 * n - 1) == 0) 
            {
                System.out.println();
                r--;
            }

            i--;
        }
    }
}
