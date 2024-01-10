import java.util.Scanner;

class Marks {
    public static void main(String[] args) 
    {
        Scanner scin = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
            
            float sgpi = scin.nextFloat();

             if (sgpi >= 10.0)
            {
            System.out.println("O");
            } 
            else if (sgpi >= 9.0) 
            {
             System.out.println("A+");
            } 
            else if (sgpi >= 8.0) 
            {
             System.out.println("A");
            } 
            else if (sgpi >= 7.0) 
            {
             System.out.println("B");
            } 
            else if (sgpi >= 6.0) 
            {
             System.out.println("C");
            } 
            else if (sgpi >= 5.0) 
            {
             System.out.println("D");
            } 
            else 
            {
             System.out.println("F");
            }
    } 
}

/*
Enter a number: 
9.3
A+
*/


