package org.example.programs;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*bjdbwaknfeqkfhekurfnke*/
        System.out.println("Table :- ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<= 10;i++)
        {
            System.out.println("Table :- "+(i*number));
        }
    }
}
/* Output

2
Table :- 2
Table :- 4
Table :- 6
Table :- 8
Table :- 10
Table :- 12
Table :- 14
Table :- 16
Table :- 18
Table :- 20

*/