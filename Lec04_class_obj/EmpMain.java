package Lec04_class_obj;

import Lec01.EmployeeSal;

public class EmpMain {
    public static void main(String[] args) {
        Empsalary em=new Empsalary(55000);
        em.setSalary(3000000);
        System.out.println("new salary is "+em.getSalary());
    }
}
