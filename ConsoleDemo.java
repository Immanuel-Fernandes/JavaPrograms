import java.io.*;

class ConsoleDemo
{
	public static void main(String arg[])
	{
	String str;
	Console con;
	con =System.console();
	if(con==null) return;
	str=con.readLine("Enter a string: ");
	con.printf("here is your string: %s\n",str);
	}
}

/*

Output: 

Enter a string: Immanuel
here is your string: Immanuel


*/
