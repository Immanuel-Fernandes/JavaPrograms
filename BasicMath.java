class BasicMath 
{
    public static void main (String args []) 
    {
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a *3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = "+da);
        System.out.println("db = "+db);
        System.out.println("dc = "+dc);
        System.out.println("dd = "+dd);
        System.out.println("de = "+de);
    }       
}


/* 
Output:
Integer Arithmetic
a = 2
b = 6
c = 1
d = -1
e = 1

Floating Point Arithmetic
da = 2.0
db = 6.0
dc = 1.5
dd = -0.5
de = 0.5

*/