package org.example.programs;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Total a+b is "+c);
    }
}
/* Output

10
20
Total a+b is 30

* */