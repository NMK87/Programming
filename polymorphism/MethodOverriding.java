package org.example.polymorphism;

public class MethodOverriding extends Shape {

    public static void main(String[] args) {

        Shape obj= new Shape();
        obj.draw(1,2);
        obj = new Rectangle();
        obj.draw(3,4);
        obj = new Circle();
        obj.draw(5,6);
    }




}
