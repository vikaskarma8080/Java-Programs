package org.example.programs;

import java.util.Scanner;
class BreakContinueWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            }
            else {
                break;
            }
        }
    }
}
/* Output

Input an integer
5
You entered 5
Input an integer
6
You entered 6
Input an integer
8
You entered 8
Input an integer
6
You entered 6
Input an integer
0

*/