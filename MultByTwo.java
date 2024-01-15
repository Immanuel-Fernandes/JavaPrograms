import java.util.Scanner; 
class MultByTwo 
{
    public static void main (String args []) 
    {
        int i;
        int num = 0xFFFFFFE;
        
        for(i=0; i<4; i++) 
        {
            num = num << 1;
            System.out.println (num) ;
        }
    }
}

/* 
Output:
536870908
1073741816
2147483632
-32

*/