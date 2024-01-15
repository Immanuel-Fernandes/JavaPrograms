import java.util.Scanner;
class CharDemo2 
{
    public static void main (String args[]) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a character for ch1: ");
        char ch1 = scin.next().charAt(0);
        System.out.println("ch1 contains " + ch1);
        ch1++; 
        System.out.println("ch1 is now " + ch1) ;
    }
}


/* 
Output:
Enter a character for ch1: I
ch1 contains I
ch1 is now J

*/