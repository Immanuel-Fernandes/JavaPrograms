import java.util .*;

class ScoreVersion4 
{
	public static void main(String[] args) 
	{
		boolean flag;
		int score=0;
		Scanner scanner;
		scanner = new Scanner(System.in);
		flag = true;
		while(flag) 
		{
			System.out.print ("Enter the score: ");
			try 
			{
				score = scanner.nextInt();
				if (score < 0 || score > 100)
				throw new RuntimeException ();
				flag = false;
			}
			catch (InputMismatchException exception) 
			{
				scanner.next ();
				System.out.println("Error: Score must be integer.");
			}
			catch (RuntimeException exception) 
			{
				System.out.println("Error: Score must be in 0-100.");
			}
		}
		System.out.println("Your score is " + score + ".") ;
	}
}

/*

Output:

Enter the score: 10
Your score is 10.

*/