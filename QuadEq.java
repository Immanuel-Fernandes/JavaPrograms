import java.util .*;

public class QuadEq 
{
	public static void main (String[] args) 
	{
		double a, b, c, root1, root2, sqrtDiscr;
		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.print ("Enter a: ");
		a = scanner. nextDouble () ;
		System.out.print ("Enter b: ");
		b = scanner.nextDouble ();
		System.out.print("Enter c: ");
		c = scanner.nextDouble () ;

		sqrtDiscr = Math.sqrt(Math.pow(b,2) - 4*a*c);
		root1 = (-b + sqrtDiscr) / (2*a);
		root2 = (-b- sqrtDiscr) / (2*a);

		System.out.println();
		System.out.println("Two roots of the equation, " + a + " **** + " + b + "*x + " + c + " = 0, are") ;
		System.out.printf("%.2f and %.2f.", root1, root2);
	}
}

/*

Output:

Enter a: 1
Enter b: -3
Enter c: 2

Two roots of the equation, 1.0 **** + -3.0*x + 2.0 = 0, are
2.00 and 1.00.

*/

/*
javadoc QuadEq.java



Loading source file QuadEq.java...
Constructing Javadoc information...
Standard Doclet version 1.8.0_202
Building tree for all the packages and classes...
Generating .\QuadEq.html...
Generating .\package-frame.html...
Generating .\package-summary.html...
Generating .\package-tree.html...
Generating .\constant-values.html...
Building index for all the packages and classes...
Generating .\overview-tree.html...
Generating .\index-all.html...
Generating .\deprecated-list.html...
Building index for all classes...
Generating .\allclasses-frame.html...
Generating .\allclasses-noframe.html...
Generating .\index.html...
Generating .\help-doc.html...

*/