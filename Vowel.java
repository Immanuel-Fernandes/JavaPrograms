import java.util.Scanner;

class Vowel 
{
    public static void main(String[] args) 
    {
        Scanner scin = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = scin.next().charAt(0);

      
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                System.out.println(ch + " is a vowel.");
            } 
            else 
            {
                System.out.println(ch + " is a consonant.");
            }
        } 
        
}


/*

Enter a character: 
a
a is a vowel.

*/