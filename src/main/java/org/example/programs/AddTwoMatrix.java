package org.example.programs;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {

        int a;
        float b;
        String d;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextFloat();
        sc.nextLine();
        d = sc.nextLine();

        System.out.println("int " + a);
        System.out.println("float " + b);
        System.out.println("string " + d);
    }
}