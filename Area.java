import java.util.Scanner; 
class Area
{
    public static void main(String args[]) 
    {
        Scanner scin = new Scanner(System.in);
        double pi, r, a;
        System.out.print("Enter a number: ");
        r = scin.nextDouble(); 
        pi = 3.1416; 
        a = pi * r * r; 
        System.out.println("Area of circle is " + a);
    }
}

/* 
Output:
Enter a number: 4
Area of circle is 50.2656

*/