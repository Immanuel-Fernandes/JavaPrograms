import java.util.Scanner; 
import java.lang.Math;

class SquareRoot 
{
    public static void main(String args[]) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = scin.nextDouble(); 
        double y = Math.sqrt(x);
        System.out.println("Square root of " + x + " is: " + y);

   }
}

/* 
Output:
Enter a number: 4
Square root of 4.0 is: 2.0

*/