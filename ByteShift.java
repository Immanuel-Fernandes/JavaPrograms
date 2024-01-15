import java.util.Scanner; 
class ByteShift 
{
    public static void main(String args[]) 
    {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a value for a (byte): ");
        byte a = scin.nextByte(); 
        int i = a << 2;
        byte b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}

/* 
Output:
Enter a value for a (byte): 64
Original value of a: 64
i and b: 256 0

*/