package org.example;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        int total_num = 5, flag;

        int n;
        int arr[] = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be found: ");
        n = sc.nextInt();

        for(int num_check=0; num_check<=total_num; num_check++){


            for(int j =0;j<total_num-1;j++){

                if(arr[j]==num_check){

                    break;

                }
                if(arr[j]!= num_check){
                    System.out.println(num_check);
                    break;
                }



            }

        }
    }
}
