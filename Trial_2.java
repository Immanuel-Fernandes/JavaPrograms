class Trial_2
{
    public static void main(String[] args) 
    {
        // Implicit Conversion (widening)
        
        byte b = 24;
        short s = b;
        int i = s;
        
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        
        
        // Explicit Conversion 
        
        /*
        Error: 
        
        int z = 13;
        short y = z;
        byte x = y;
        
        System.out.println("int = " + z);
        System.out.println("short = " + y);
        System.out.println("byte = " + x);
     
        
        */
        
        int z = 13;
        short y = (short) z;
        byte x = (byte) y;
        
        System.out.println("int = " + z);
        System.out.println("short = " + y);
        System.out.println("byte = " + x);
        
        
        
        
        
       
    }
}