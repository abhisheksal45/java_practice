package Lec04_class_obj.inheritance;

public class manager extends Employee{
    int teamsize;
    public void manage(){
        System.out.println(name+" Manager having team size of"+teamsize);
    }
}
