package org.example;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {

//        int n;
//        int sum=0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter numbers: ");
//        n = sc.nextInt();
//
//        for (int i =1;i <=n; i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);

        int[] numbers = {1,2,3,4,5,6,7,8};
        int sum=0;

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
       n = sc.nextInt();

        for(int i = 0; i<=numbers.length;i++){
            sum = sum+i;
        }
        sum = sum/n;
        System.out.println(sum);
    }
}
