import java.util .*;

class Ch8Sample2 
{
	public static void main(String[] args) 
	{
		Scanner scanner;
		scanner = new Scanner(System.in);
		int n,answer;
		System.out.println();
		System.out.print("Enter an integer for n: ");
		n = scanner.nextInt () ;
		System.out.println();

		if (n >= 0) 
		{
			answer = fib(n);
			System.out.println("The answer is " + answer);
		}
		else
			System.out.println("Fibonacci not calculated");
		System.out.println();
	}

	public static int fib(int n) 
	{
		int answer1, answer2, answer;
		if (n > 1) 
		{
			answer1 = fib(n-1);
			answer2 = fib(n-2);
			answer = answer1 + answer2;
		}
		else
			answer = n;
		return answer;
	}
}

/*

Output:

Enter an integer for n: 10

The answer is 55

*/