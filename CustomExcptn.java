package org.example;

class InsufficientSalarayRangeException extends Exception{

    InsufficientSalarayRangeException(String msg){
        System.out.println(msg);
    }
}

public class CustomExcptn {

    public static void main(String[] args) {

        try{
            CustomExcptn.Employee(9000);
        }

        catch (Exception ex){
            System.out.println(ex);
        }

    }

    public static void Employee(int salary) throws InsufficientSalarayRangeException{

        if(salary>500000){
            throw new InsufficientSalarayRangeException("Is in a good range");
        }

        else{
            System.out.println("not in good range");
        }

    }

}
