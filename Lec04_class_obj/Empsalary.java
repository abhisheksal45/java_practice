package Lec04_class_obj;

public class Empsalary {
    private double salary;



    Empsalary(double initialsalary){
        if(salary >=0){
            this.salary=initialsalary;
        }
  else {
      salary=0.0;
        }
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newsalary) {

        if (newsalary>0){
            this.salary=newsalary;
        }
        else{
            System.out.println("Salary must be greater than 0");
        }

    }
}
