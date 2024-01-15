import java.util.Scanner; 

class OpEquals 
{
    public static void main(String args[]) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        int a = scin.nextInt(); 
        System.out.print("Enter a value for b: ");
        int b = scin.nextInt(); 
        System.out.print("Enter a value for c: ");
        int c = scin.nextInt(); 
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


/* 
Output:
Enter a value for a: 5
Enter a value for b: 10
Enter a value for c: 15
a = 10
b = 40
c = 1

*/