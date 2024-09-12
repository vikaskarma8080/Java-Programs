package org.example.programs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {
    public static void main(String[] args) {
        String a,b;
        BigInteger c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st number ");
        a=sc.nextLine();
        System.out.println("number is "+a);
        System.out.println("Enter your 1st number ");
        b=sc.nextLine();
        System.out.println("number is "+b);
        BigInteger bi1=new BigInteger(a);
        BigInteger bi2=new BigInteger(a);
        c=bi1.add(bi2);
        System.out.println("Total : "+c);
    }
}
