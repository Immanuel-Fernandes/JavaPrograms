import java.util.Scanner;

public class Dollar_pattern
{
    public static void main(String[] args) 
    {
        Scanner scin = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = scin.nextInt();

        DollarPattern(row, 1);
    }

    private static void DollarPattern(int row, int cur) 
    {
        if (cur <= row) 
        {
            Dollar(cur);
            System.out.println();
            DollarPattern(row, cur + 1);
        }
    }

    private static void Dollar(int count) 
    {
        if (count > 0) 
        {
            System.out.print("$ ");
            Dollar(count - 1);
        }
    }
}

/*

Enter the number of rows: 3
$ 
$ $ 
$ $ $ 

*/
