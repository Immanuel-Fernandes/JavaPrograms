import java.util.Scanner;

class Whole {
    public static void main(String[] args) 
    {
        Scanner scin = new Scanner(System.in);

        System.out.println("Enter a number: ");

            int n = scin.nextInt();

            if (n >= 0) 
            {
                System.out.println(n + " is a whole number.");
            } 
            else 
            {
                System.out.println(n + " is not a whole number.");
            }
    } 
}

/*
Enter a number: 
5
5 is a whole number.
*/
