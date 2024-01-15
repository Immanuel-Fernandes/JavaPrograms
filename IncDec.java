import java.util.Scanner; 
class IncDec 
{
    public static void main (String args []) 
    {
    Scanner scin = new Scanner(System.in);
    System.out.print("Enter a value for a: ");
    int a = scin.nextInt(); 
    System.out.print("Enter a value for b: ");
    int b = scin.nextInt(); 
    int c;
    int d;
    c = ++b;
    d = a++;
    c++;
    System.out.println("a = " + a) ;
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    }
}


/* 
Output:
Enter a value for a: 10
Enter a value for b: 20
a = 11
b = 21
c = 22
d = 10

*/