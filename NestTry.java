class NestTry 
{
	public static void main (String args []) 
	{
		try 
		{
			int a = args.length;
			int b = 42 / a;
			System.out.println("a = " + a);

			try
			{ 
				if(a == 1) a = a/(a-a); // division by zero

				if(a == 2)
				{
					int c[] = { 1 };
					c [42] = 99; // out-of-bounds exception
				} 
			}

			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Array index out-of-bounds: " + e) ;
			}
		} 

		catch (ArithmeticException e) 
		{
			System.out.println("Divide by 0: " + e);
		}		
	}	
}


/*
Output:

// no command-line args are present

Divide by 0: java.lang.ArithmeticException: / by zero

// two command-line args are used

java NestTry 10 5
a = 2
Array index out-of-bounds: java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 1


*/