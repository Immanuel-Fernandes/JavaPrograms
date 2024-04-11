import java.util .*;

class Employee 
{
	private int id;
	public Employee (int id) 
	{
		this.id = id;
	}

	public String toString () 
	{
		return "An employee with ID " + id;
	}
}

class FullTime extends Employee 
{
	private double salary;

	public FullTime(int id, double salary) 
	{
		super (id);
		this.salary = salary;
	}
	public String toString () 
	{
		String str;
		str = String.format (super. toString () + " is a full-time employee \n" + "with salary $%.2f.\n", compensation());
		return str;
	}

	public double compensation() 
	{
		return salary;
	}
}

class PartTime extends Employee 
{
	private double hourlyRate;
	private double hoursWorked;

	public PartTime(int id, double hourlyRate, double hoursWorked) 
	{
		super (id) ;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public String toString () 
	{
		String str;
		str = String.format (super. toString() + " is a part-time employee \n" + "with wages $%.2f.\n", compensation());
		return str;
	}

	public double compensation() 
	{
		return hourlyRate * hoursWorked;
	}
}




public class Company 
{
	public static void main(String[] args) 
	{
		Employee[] employee;
		int numEmp, id;
		double salary, hourlyRate, hoursWorked;
		String type;
		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.print ("Enter number of employees: ");
		numEmp = scanner.nextInt ();
		employee = new Employee [numEmp] ;
		System.out.println();

		for(int i=0; i<employee.length; i++) 
		{
			System.out.print("Enter id of employee " + (i+1) + ": ");
			id =scanner.nextInt ();
			System.out.print ("Enter either 'f' for full-time or ");
			System.out.print("'p' for part-time: ");
			type = scanner.next () ;
			if(type.equals("f")) 
			{
				System.out.print ("Enter salary of employee " + (i+1) + ": ") ;
				salary = scanner.nextDouble ();
				employee[i] = new FullTime(id, salary);
			}
			else 
			{
				System.out.print ("Enter hourly rate of employee " + (i+1) + ": ") ;
				hourlyRate = scanner.nextDouble ();
				System.out.print ("Enter number of hours worked: ");
				hoursWorked = scanner.nextDouble ();
				employee[i] = new PartTime(id, hourlyRate, hoursWorked);
			}
			System.out.println();
		}
		for(int i=0; i<employee.length; i++)
			System.out.println(employee[i].toString ()) ;
	}
}



/*

Output:

Enter number of employees: 2

Enter id of employee 1: 01
Enter either 'f' for full-time or 'p' for part-time: f
Enter salary of employee 1: 10000

Enter id of employee 2: 02
Enter either 'f' for full-time or 'p' for part-time: p
Enter hourly rate of employee 2: 100
Enter number of hours worked: 50

An employee with ID 1 is a full-time employee
with salary $10000.00.

An employee with ID 2 is a part-time employee
with wages $5000.00.

*/