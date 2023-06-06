package org.example.polymorphism;

public class MethodOverloading {

    public void add(int x, int y){
        int c= x+y;
        System.out.println(c);
    }

    public void add(double a, int b){
        double c= a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(1,2);
        obj.add(3.4,8);
    }


}
