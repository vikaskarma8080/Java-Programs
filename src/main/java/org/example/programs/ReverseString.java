package org.example.programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "",original;
        Scanner sc=new Scanner(System.in);
        original=sc.nextLine();
        System.out.println("Your orignal String is.."+original);
        int n=original.length();
        for (int i=n-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        System.out.println("Reverse String :- "+reverse);
    }
}
/*
* vikas
Your orignal String is..vikas
Reverse String :- sakiv
* */