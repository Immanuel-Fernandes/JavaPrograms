class X implements Runnable
{
	public void run( )
	{

		for(int i = 1; i <= 10; i++)
		{
			System.out.println("\tThreadX : " +i);
		}
		System.out.println("End of ThreadX");
	}
} 

class RunnableTest
{
	public static void main(String args[ ])
	{
		X runnable = new X( );
		Thread threadX = new Thread(runnable);
		threadX.start( );
		System.out.println("End of main Thread");
	}
}




/*
Output:

End of main Thread
        ThreadX : 1
        ThreadX : 2
        ThreadX : 3
        ThreadX : 4
        ThreadX : 5
        ThreadX : 6
        ThreadX : 7
        ThreadX : 8
        ThreadX : 9
        ThreadX : 10
End of ThreadX

*/