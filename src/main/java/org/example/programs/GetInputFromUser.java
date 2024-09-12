package org.example.programs;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {

        int a;
        float b;
        String c;
        Scanner sc1=new Scanner(System.in);
        a=sc1.nextInt();
        System.out.println("this is int "+a);
        Scanner sc2=new Scanner(System.in);
        b=sc2.nextFloat();
        System.out.println("this is float "+b);
        Scanner sc3=new Scanner(System.in);
        c=sc3.nextLine();
        System.out.println("this is string "+c);
    }
}
