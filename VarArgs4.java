class VarArgs4
{
	 static void vaTest( int ... v)
	 { 
	  
	  System.out.print("vaTest(int ...): "+" Number of args: "+v.length + " Contents: ");
	   for(int x:v)
	    System.out.print(x+" ");
	   System.out .println();
	 }
 
	 static void vaTest(boolean ... v)	
	 {
	 
		System.out.print("vaTest(boolean ...): "+" Number of args: "+v.length + " Contents: ");
			for( boolean x:v)
		     System.out.print(x +" ");
			System.out.println();
	 }   
    
	public static void main(String args[])
	{
		 vaTest(1,2,3);
		 vaTest(true,false,false);
		 vaTest(); // Error:  ambiguous
	}
}





/*
Output:

VarArgs4.java:25: error: reference to vaTest is ambiguous
                 vaTest();
                 ^
  both method vaTest(int...) in VarArgs4 and method vaTest(boolean...) in VarArgs4 match
1 error

*/