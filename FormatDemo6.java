import java.util .*;

class FormatDemo6 
{
	public static void main (String args []) 
	{
		Formatter fmt = new Formatter ();
		Calendar cal = Calendar.getInstance ();

		fmt.format ("Today is day %te of %<tB, %<tY", cal);
		System.out.println(fmt) ;
		fmt.close ();
	}
}


/*

Output: 
Today is day 22 of February, 2024

*/