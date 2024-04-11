import java.util .*;
class Courses 
{
	public static void main(String[] args) 
	{
		// declaration and initialization of variables
		Course course;
		String str, dept, number, name;
		Scanner scanner;
		scanner = new Scanner(System.in);

		// input course
		System.out.print ("Enter the course: ");
		str = scanner.nextLine();
		dept = str.substring(0, str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1, str.length());
		number = str.substring(0, str.indexOf(" "));
		name = str.substring(str.indexOf(" ")+1, str.length());
		course = new Course (dept, number, name);

		// output course information
		System.out.println();
		System.out.println("The class, \"" + course.getName () + "\", is a ") ;
		System.out.println(course.getLevel () + " level class offered by the ");
		System.out.println(course.getDepartment () + " department.");
	}
}

// definition of Course class
class Course 
{
	// data member
	private String department;
	private String number;
	private String name;
	private String level;

	// constructor
	public Course () 
	{
		this (" ", " ", " ");
	}

	// constructor
	public Course (String dept, String number, String name) 
	{
		setDepartment (dept);
		setNumber (number) ;
		setName (name) ;
		setLevel ();
	}

	// mutator methods
	public void setDepartment (String dept) 
	{
		if(dept.equals("CS"))
		department = "Computer Science";
		else
		if (dept.equals("MA") )
		department = "Mathematics";
		else
		department = "undetermined";
	}

	public void setNumber (String number) 
	{
		this.number = number;
	}

	public void setName (String name) 
	{
		this.name = name;
	}
		
	public void setLevel() 
	{
		String str;
		char num;
		str = number.substring(0, 1);
		num = str.charAt(0);
		switch (num) 
		{
			case '1': level = "first-year";
			break;
			case '2': level = "sophomore";
			break;
			case '3': level = "junior";
			break;
			case '4': level = "senior";
			break;
			default: level = "undetermined";
		}
	}

	// accessor methods
	public String getDepartment() 
	{
		return department;
	}

	public String getNumber() 
	{
		return number;
	}

	public String getName() 
	{
		return name;
	}

	public String getLevel() 
	{
		return level;
	}
}