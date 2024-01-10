import java.util.Scanner;

class Swap
{
    public static void main(String[] args) 
    {
        byte b1;
        short sh1;

        Scanner scin = new Scanner(System.in);

        System.out.println("Enter a Byte Value");
        b1 = scin.nextByte();
        
        System.out.println("Enter a Short Value");
        sh1 = scin.nextShort();

        sh1 = (short) (sh1 + b1);
        b1 = (byte) (sh1 - b1);
        sh1 = (short) (sh1 - b1);

        System.out.println("Swapped Values Are b1 = " + b1 + " sh1 = " + sh1);
    }
}

/*

Enter a Byte Value
10
Enter a Short Value
5
Swapped Values Are b1 = 5 sh1 = 10

*/
