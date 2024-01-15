import java.util.Scanner;
class StringSwitch 
{
public static void main (String args []) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a string (one): ");
        String str = scin.next();
        switch (str) 
        {
            case "one" :
            System.out.println("one 1");
            break;
            case "two":
            System.out.println("two 2");
            break;
            case "three":
            System.out.println("three 3");
            break;
            default:
            System.out.println("no match");
            break;
        }
    }
}

/* 
Output:
Enter a string (one): two
two 2

*/