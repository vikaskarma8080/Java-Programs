package org.example.programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=123,temp=0;
        while (n!=0)
        {
             temp=temp * 10;
             temp=temp+n%10;
             n=n/10;
        }
        System.out.println("Reversed :- "+temp);
    }
}
/* Output

Reversed :- 321

* */