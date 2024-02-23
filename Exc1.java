class Exc1
{
	static void subroutine()
	{
		int d=0;
		int a= 10/ d;
	}

	public static void main(String args[])
	{
		Exc1.subroutine();
	}
}


/*
Output:

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exc1.subroutine(Exc1.java:6)
        at Exc1.main(Exc1.java:11)

*/