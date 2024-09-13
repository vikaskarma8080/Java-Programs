package org.example.programs;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int passingMarks,marksObtained;
        passingMarks=40;
        Scanner sc=new Scanner(System.in);
        marksObtained =sc.nextInt();
        if(marksObtained>=passingMarks)
        {
            System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }
    }
}
/* Output
*
* 40
passed
*
* */