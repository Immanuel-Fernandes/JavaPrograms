import java.util .*;
class TimeDateFormat 
{
	public static void main (String args []) 
	{
		Formatter fmt = new Formatter ();
		Calendar cal = Calendar.getInstance ();

		fmt.format("%tr", cal);
		System.out.println (fmt) ;
		fmt.close ();

		fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println (fmt) ;
		fmt.close();

		fmt = new Formatter();
		fmt.format("%tl : %tM", cal, cal) ;
		System.out.println (fmt);
		fmt.close ();

		fmt = new Formatter();
		fmt.format("%tB %tb %tm", cal, cal, cal);
		System.out.println (fmt) ;
		fmt.close();
	}
}



/*

Output: 

01:01:49 PM
Thu Feb 22 13:01:49 GMT 2024
1 : 01
February Feb 02

*/