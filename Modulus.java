import java.util.Scanner; 

class Modulus 
{
    public static void main(String args[]) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int x = scin.nextInt();
        System.out.print("Enter a double value: ");
        double y = scin.nextDouble(); 
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}

/* 
Output:
Enter an integer value: 33
Enter a double value: 12.34
x mod 10 = 3
y mod 10 = 2.34
*/