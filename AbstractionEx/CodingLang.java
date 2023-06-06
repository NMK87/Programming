package org.example.AbstractionEx;

public class CodingLang extends Abstraction{
    @Override
    public void Java() {

        System.out.println("neha is java developer");

    }

    @Override
    public void HTML() {

        System.out.println("and neha knows HTML too");

    }

    public static void main(String[] args) {
        CodingLang obj = new CodingLang();

        obj.HTML();
        obj.Java();
    }
}
