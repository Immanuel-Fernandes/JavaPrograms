import java.util.Scanner; 
class Example2 
{
    public static void main(String args[]) 
    {
        Scanner scin = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scin.nextInt(); 
        System.out.println("This is num: " + num);
        num = num * 2;
        System.out.print("The value of num * 2 is ");
        System.out.println(num);
    }
}


/* 
Output:
Enter a number: 4
This is num: 4
The value of num * 2 is 8

*/