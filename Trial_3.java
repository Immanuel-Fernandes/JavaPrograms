class Trial_3 
{
    public static void main(String[] args) {
       
        byte a = 10, b = 20;

        System.out.println("+ operator " + (a + b));
        System.out.println("- operator " + (a - b));
        System.out.println("/ operator " + (a / b));
        System.out.println("* operator " + (a * b));
        System.out.println("> operator " + (a > b));
        System.out.println(">= operator " + (a >= b));
        System.out.println("< operator " + (a < b));
        System.out.println("<= operator " + (a <= b));
        System.out.println("!= operator " + (a != b));
        System.out.println(">> operator " + (a >> b));
        System.out.println("<< operator " + (a << b));
        System.out.println(">>> operator " + (a >>> b));
        System.out.println("&& operator " + (a > 5 && b < 30));
        System.out.println("|| operator " + (a > 15 || b < 15));
        System.out.println("& operator " + (a & b));
        System.out.println("| operator " + (a | b));
    }
}

/* 

Output:


+ operator 30
- operator -10
/ operator 0
* operator 200
> operator false
>= operator false
< operator true
<= operator true
!= operator true
>> operator 0
<< operator 10485760
>>> operator 0
&& operator true
|| operator false
& operator 0
| operator 30


*/
