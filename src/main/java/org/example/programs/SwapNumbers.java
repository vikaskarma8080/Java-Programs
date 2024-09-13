package org.example.programs;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=10,b=20,c;
        System.out.println("before.."+ a +" "+ b);
        c=b;
        b=a;
        a=c;
        System.out.println("after.."+ a +" "+ b);
    }
}
/*    Output :-

before..10 20
after..20 10

* */