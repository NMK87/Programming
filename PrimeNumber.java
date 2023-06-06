package org.example;

public class PrimeNumber {
    public static void main(String[] args) {

        int m=0,flag=0;

        int n = 3;

        m=n/2;

        if(n==0 || n==1){
            System.out.println("Not prime");
        }
        else{
            for(int i = 2; i<=m ; i++){
                if(n%i == 0){
                    System.out.println("no prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime");
            }
        }
    }
}
