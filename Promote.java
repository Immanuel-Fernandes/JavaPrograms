class Promote 
{
    public static void main (String args []) 
    {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f *b) + (i / c) - (d*s);
        System.out.println((f * b) + " +"+ (i/c) +"-"+ (d* s));
        System.out.println("result = " + result) ;
    }
}

/* 
Output:
238.14 + 515 - 126.3616
result = 626.7784146484375

*/