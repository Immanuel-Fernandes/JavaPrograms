import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo 
{
	public static void main (String args []) 
	{
		int size;

		try ( FileInputStream f = new FileInputStream("FileInputStreamDemo.java")) 
		{
			System.out.println("Total Available Bytes: " + (size = f.available()));
		
		int n = size/40;

		System.out.println("First " + n +" bytes of the file one read() at a time");
		for (int i=0; i < n; i++) 
		{
			System.out.print ((char) f.read());
		}
		System.out.println("\nStill Available: " + f.available());

		System.out.println("Reading the next " + n + " with one read (b[] )");
		byte b[] = new byte [n];
		if (f.read(b) != n) 
		{
			System.err.println("couldn't read " + n + " bytes.") ;
		}

		System.out.println(new String(b, 0, n));
		System.out.println("\nStill Available: " + f.available ());
		System.out.println("Skipping half of remaining bytes with skip()");
		f.skip(size/2);
		System.out.println("Still Available: " + f.available ());

		System.out.println("Reading " + n/2 + " into the end of array") ;
		
		if (f.read(b, n/2, n/2) != n/2) 
		{
			System.err.println("couldn't read " + n/2 + " bytes.") ;
		}

		System.out.println(new String(b, 0, b.length) );
		System.out.println("\nStill Available: "+ (size = f.available()));
		} 
		
		catch (IOException e) 
		{
		System.out.println("I/O Error: " + e);		
		}
	}
}





/*

Output: (Online Compiler)

Total Available Bytes: 1424
First 35 bytes of the file one read() at a time
import java.io.FileInputStream;
im
Still Available: 1389
Reading the next 35 with one read (b[] )
port java.io.IOException;

class 

Still Available: 1354
Skipping half of remaining bytes with skip()
Still Available: 642
Reading 17 into the end of array
port java.io.IOExtln(new String(b, 

Still Available: 625


*/