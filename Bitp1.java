import java.util.*;

class Bitp1 
{
	static Scanner scanner;
	public static void main (String [] args) 
	{
		int x,y=0, answer=0;
		char op;

		x = input8 ();
		output8(x);

		scanner = new Scanner (System.in);
		System.out.println();
		System.out.print("Enter an operation ( |, ^ , & , ~ , + , L , R ) : ") ;
		op = scanner.next ().charAt (0) ;

		if (op == '|' || op == '^' || op == '&') 
		{
			y = input8 ();
			output8(y);
		}

		switch (op) 
		{
			case '|': answer = x | y;
				break;
			case '^': answer = x ^ y;
				break;
			case '&': answer = x & y;
				break;

			case 'L':
			case 'l': answer = x << 1;
				break;

			case 'R':
			case 'r': answer = x >>> 1;
				break;
			
			case '~': answer = ~x;
				break;

			default: System.out.println("Invalid entry");
		}
		answer = answer & 0b11111111;
		System.out.println();
		output8(answer);
		System.out.println();
	}

	public static int input8() 
	{
		int bNum;
		scanner = new Scanner(System.in);
		System.out.println();
		System.out.print ("Enter a binary number: ");

		bNum = scanner.nextInt(2);
		bNum = bNum & 0b11111111;
		return bNum;
	}

	public static void output8(int bNum) 
	{
	String bString, zString;
	bString = Integer.toBinaryString (bNum) ;
	zString = String.format("%8s", bString) .replace(' ','0');
	System.out.println(" The binary number is: " + zString);
	}
}



/*

Output:

Enter a binary number: 0011
 The binary number is: 00000011

Enter an operation ( |, ^ , & , ~ , + , L , R ) : L

 The binary number is: 00000110

*/
