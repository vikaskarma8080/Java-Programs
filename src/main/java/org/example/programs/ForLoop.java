package org.example.programs;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number..");
        int n=sc.nextInt();
        System.out.println("your output..");
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}
/*
*  output
*
Enter number..
5
your output..
0
1
2
3
4
5
*
* */