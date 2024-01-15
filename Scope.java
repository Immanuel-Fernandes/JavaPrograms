import java.util.Scanner;
class Scope 
{
    public static void main (String args []) 
    {
    Scanner scin = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = scin.nextInt();
    if(x == 10) 
        { 
            int y = 20; 
            System.out.println("x and y: " + x + " " + y) ;
            x =y * 2;
        }
        // y = 100; // Error! y not known here
        // x is still known here.
        System.out.println("x is " + x);
    }
}


/* 
Output:
Enter a number: 10
x and y: 10 20
x is 40

*/