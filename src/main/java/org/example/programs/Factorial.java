package org.example.programs;
import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int n, c, fact = 1;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;
            System.out.println("Factorial of "+n+" is = "+fact);
    }
}
/* Output
*
* Enter an integer to calculate it's factorial
5
Factorial of 5 is = 120
*
* */