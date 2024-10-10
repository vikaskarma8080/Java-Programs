package org.example.programs;

public class CompareStrings {
    public static void main(String[] args) {
        String s1="vikas";
        String s2="karma";
        if(s1.compareTo(s2)>0)
            System.out.println("greater then..");
        else if (s1.compareTo(s2)<0)
            System.out.println("smaller then..");
        else
            System.out.println("both are equals...");
    }
}
/* Output

* greater then..

* */