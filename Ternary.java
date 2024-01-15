class Ternary 
{
    public static void main (String args []) 
    {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; 
        System.out.print ("Absolute value of ");
        System.out.println(i + " is " + k) ;
        
        i = -10;
        k = i < 0 ? -i : i; 
        System.out.print ("Absolute value of ") ;
        System.out.println(i + " is " + k);
    }
}

/* 
Output:
Absolute value of 10 is 10
Absolute value of -10 is 10

*/