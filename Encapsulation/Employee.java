package org.example.Encapsulation;

public class Employee extends Encap {

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmp_id(1);
        obj.setEmp_name("neha");
        System.out.println(obj.getEmp_id()+" "+obj.getEmp_name());
    }
}
