package org.example;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        int a =50;
        int b = 60;

        int temp=0;
        System.out.println("Before swapping"+a+" "+b);
        temp = a;
        a=b;
        b=temp;

        System.out.println("After swapping"+a+" "+b);
    }
}
