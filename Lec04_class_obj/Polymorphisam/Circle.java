package Lec04_class_obj.Polymorphisam;

public class Circle extends Shape{
    double rad;
    Circle(double rad){
        this.rad=rad;
    }
    @Override
    public void area(){
        double res=Math.PI*rad*rad;
        System.out.println("the Area of Circle is "+res);
    }
}
