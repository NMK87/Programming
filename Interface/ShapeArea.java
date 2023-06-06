package org.example.Interface;

import java.util.Scanner;

public class ShapeArea implements Area{
    @Override
    public void Circle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter r");

        int r = sc.nextInt();
        final double pi= 3.14;

        double cicle= pi*r*r;

        System.out.println(cicle);

    }

    @Override
    public void Square() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter s");
        int s  = sc.nextInt();


        double sqaure = s*s;
        System.out.println(sqaure);
    }
    public static void main(String[] args) {

        ShapeArea geo = new ShapeArea();

        geo.Circle();
        geo.Square();
    }
}
