package org.example.polymorphism;

public class Rectangle extends Shape {

    void draw(int l, int b){
        int h = l+b;
        System.out.println("print rectangle"+h);
    }
}
