package org.example;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();

        if(n>0){
            System.out.println(n);
        }
        else{
            n = -1*n;
            System.out.println(n);
        }
    }
}
