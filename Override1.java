class A 
{
	int i, j;

	A(int a, int b) 
	{
		i = a;
		j = b;
	}

	void show () 
	{
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A 
{
	int k;

	B(int a, int b, int c) 
	{
		super (a, b) ;
		k = c;
	}

	void show (String msg) 
	{
		System.out.println (msg + k);
	}
}

class Override1 
{
	public static void main (String args []) 
	{
		B subOb = new B(1, 2, 3);
		subOb.show("This is k: "); // show() in B
		subOb.show(); // show() in A
	}
}





/*
Output:

This is k: 3
i and j: 1 2

*/