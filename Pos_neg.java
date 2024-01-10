import java.util.Scanner;

class Pos_neg {
    public static void main(String[] args) 
    {
        Scanner scin = new Scanner(System.in);

        System.out.println("Enter a number: ");

            int n = scin.nextInt();

            if (n >= 0) 
            {
                System.out.println(n + " is a Positive number.");
            } 
            else 
            {
                System.out.println(n + " is not a Negative number.");
            }
    } 
}

/*
Enter a number: 
5
5 is a Positive number.
*/