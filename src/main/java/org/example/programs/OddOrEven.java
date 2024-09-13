package org.example.programs;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        if(firstNumber%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}