package Lec04_class_obj;

public class En_Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks){
        if(marks>=0 &&marks<=100){
            this.marks=marks;
        }
        else {
       System.out.println("Error the marks should be greater than 0 and less than 100");
        }
    }
}