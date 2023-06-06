package org.example;

import java.util.Scanner;

public class AmstrongNumber {

    static boolean isAmstrong(int n){

        int temp, count=0, rem=0, sum =0;

        temp = n;

        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = n;
        while (temp>0){
            rem = temp%10;
            sum+= Math.pow(rem,count);
            temp = temp/10;
        }
        if(sum==n){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        if(isAmstrong(num)){
            System.out.println("Amstrong");
        }
        else {
            System.out.println("Not Amstrong");
        }
    }
}
