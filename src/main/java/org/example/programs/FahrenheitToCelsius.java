package org.example.programs;

import java.util.Scanner;

public class FahrenheitToCelsius {
    static float temp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter ");
        temp=sc.nextInt();
        temp = ((temp - 32)*5)/9;
        System.out.println("Fahrenheit To Celsius"+temp);
    }
}
/* output
*
* Pls enter
20
Fahrenheit To Celsius-6.6666665
*
* */