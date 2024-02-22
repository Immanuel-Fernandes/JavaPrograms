public class Workingdays
{
	enum Days
	{
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday
	}

	public static void main(String args[])
	{
		for (Days d : Days.values())
		{
			weekend(d);

		}
	}

	private static void weekend(Days d)
	{
	if(d.equals(Days.Sunday))
		System.out.println("value = " + d +" is a Holiday");
	else
		System.out.println("value = "+ d +" is a working day");
	}
}



/*

Output: 

value = Sunday is a Holiday
value = Monday is a working day
value = Tuesday is a working day
value = Wednesday is a working day
value = Thursday is a working day
value = Friday is a working day
value = Saturday is a working day


*/
