package org.example;

public class FibanocciSeries {

    public static void main(String[] args) {

        int a = 0;
        int b =1;
        int sum=0;
        int n=8;

        if(n == 1){
            System.out.println(a);
            return;
        }
        System.out.print(a+" "+b);

        for(int i = 0; i<n-2; i++){
            sum  = a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
}
