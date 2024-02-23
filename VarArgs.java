class VarArgs
{
	static void vaTest(int ... v)
 	{ 
	  	System.out.print("Number of args: "+v.length + " Contents: ");
	   	for(int x:v)
	    	System.out.print(x+" ");
	    	
	    System.out.println();
	}
	public static void main(String args[])
	{
	 	vaTest(10);
	 	vaTest(1,2,3);
	 	vaTest();
 	}
}



/*
Output:

Number of args: 1 Contents: 10
Number of args: 3 Contents: 1 2 3
Number of args: 0 Contents:

*/