package Lec04_class_obj;

public class Main1 {
    public static void main(String[] args) {
//        Employee Emp=new Employee(12,"Jessica",1234567);
//        Employee Emp1=new Employee(13,"Louis",345678);
//        Employee Emp2=new Employee(14,"Harvey",4567899);
//        Employee Emp3=new Employee(15,"Mike",34567867);
//        Employee Emp4=new Employee(16,"Dona",1234567);
//Emp1.name="Abhishek";
//        Emp.EmployeeDetails();
//        Emp1.EmployeeDetails();
//        Emp2.EmployeeDetails();
//        Emp3.EmployeeDetails();
//        Emp4.EmployeeDetails();

//        Book book=new Book("War and peace","Leo Toistoy",456);
//book.Bookdetails();

        En_Student en=new En_Student();
        en.setName("Rachel");
        en.setMarks(88);

        System.out.println("the name of the Student is " +en.getName()+ " and marks is "+en.getMarks());

        En_Student en1=new En_Student();
        en1.setName("Robert");
        en1.setMarks(66);
        System.out.println("name "+en1.getName()+ " marks " + en1.getMarks());
    }
}
