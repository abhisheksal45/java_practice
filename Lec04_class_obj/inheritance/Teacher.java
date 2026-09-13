package Lec04_class_obj.inheritance;

public class Teacher extends Person {
    public void Teacherdetails(){
        System.out.println("Name of teacher is "+name+ " and age is "+age);
    }
public void SubjectForTeaching(){
        System.out.println(name+ " teacher teach math science");
}
}
