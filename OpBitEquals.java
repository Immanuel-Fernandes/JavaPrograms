import java.util.Scanner;
class OpBitEquals 
{
    public static void main (String args []) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        int a = scin.nextInt(); 
        System.out.print("Enter a value for b: ");
        int b = scin.nextInt(); 
         System.out.print("Enter a value for c: ");
        int c = scin.nextInt();
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;
        System.out.println("c = " + c);
    }
}

/* 
Output:
Enter a value for a: 1
Enter a value for b: 2
Enter a value for c: 3
a = 3
b = 1
c = 6

*/