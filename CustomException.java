package org.example;

class InvlaidAgeException extends Exception{

    String msg;


    public InvlaidAgeException(String msg) {
        System.out.println(msg);
    }
}
public class CustomException {

    public static void main(String[] args) throws InvlaidAgeException {

        try{
            CustomException.Test(4);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void Test(int age) throws InvlaidAgeException{
        if(age<18){
            throw new InvlaidAgeException("Age is invalid");
        }
        else{
            System.out.println("valid");
        }
    }
}
