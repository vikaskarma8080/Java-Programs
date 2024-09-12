package org.example.programs;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        char gread;
        int passingMarks,marksObtained;

        Scanner sc=new Scanner(System.in);
        marksObtained = sc.nextInt();

        passingMarks = 40;

        if (marksObtained >= passingMarks) {
            if (marksObtained == 90)
                gread = 'A';
            else if (marksObtained == 75)
                gread = 'B';
            else if (marksObtained == 60)
                gread = 'C';
            else
                gread = 'D';
            System.out.println("Passed " + gread);
        }
        else {
           gread = 'F';
            System.out.println("You failed and your grade is " + gread);
        }
    }
}