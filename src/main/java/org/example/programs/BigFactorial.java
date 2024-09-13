package org.example.programs;

import java.util.Scanner;
import java.math.BigInteger;
class BigFactorial
{
    public static void main(String args[])
    {
        try {
            int n, c;
            BigInteger inc = new BigInteger("1");
            BigInteger fact = new BigInteger("1");
            Scanner input = new Scanner(System.in);
            System.out.println("Input an integer");
            n = input.nextInt();
            for (c = 1; c <= n; c++) {
                fact = fact.multiply(inc);
                inc = inc.add(BigInteger.ONE);
            }
            System.out.println(n + "! = " + fact);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
/* Output
*
* Input an integer
5
5! = 120
*
* */