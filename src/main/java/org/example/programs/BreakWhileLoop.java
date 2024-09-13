package org.example.programs;

import java.util.Scanner;
class BreakWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("You entered " + n);
        }
    }
}
/* Output
*
Input an integer
5
You entered 5
Input an integer
0
*
* */