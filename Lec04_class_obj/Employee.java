package Lec04_class_obj;

public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
public void EmployeeDetails(){
        System.out.println("name of Employee is "+name+" Employee id is "+id + " and salary is "+salary);

    }
}
