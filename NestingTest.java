class Nesting
{
	int m, n;
	Nesting (int x, int y) // Constructor method
	{
		m = x;
		n = y;
	}

	int largest()
	{
		if (m >= n)
			return(m);
		else
			return(n);
	}

	void display()
	{
		int large = largest(); // Calling a method
		System.out.println("Largest value = " + large);
	}
}

class NestingTest
{
	public static void main(String args[ ])
	{
		Nesting nest = new Nesting(50,40);
		nest.display( );
	}
}


/*

Output: 

Largest value = 50

*/
