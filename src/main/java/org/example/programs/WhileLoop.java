package org.example.programs;
import java.util.Scanner;
class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }
        System.out.println("Out of loop");
    }
}
/* Output

Input an integer
5
You entered 5
Input an integer
2
You entered 2
Input an integer
3
You entered 3
Input an integer
4
You entered 4
Input an integer
5
You entered 5
Input an integer
6
You entered 6
Input an integer
6
You entered 6
Input an integer
5
You entered 5
Input an integer
5
You entered 5
Input an integer
5
You entered 5
Input an integer
9
You entered 9
Input an integer

*/