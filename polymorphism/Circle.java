package org.example.polymorphism;

public class Circle extends Shape {

    void draw(int l,int b){
        int h = l+b;
        System.out.println("print circle"+h);
    }
}
