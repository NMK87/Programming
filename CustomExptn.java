package org.example;

class InvlaidnumberException extends Exception{


    public InvlaidnumberException(String exception) {

    }
}
public class CustomExptn {

    public static void main(String[] args) {

        try{
            throw new InvlaidnumberException("Exception");
        }
        catch (Exception ex){
            System.out.println("caught");
            System.out.println(ex);
        }


    }

}
