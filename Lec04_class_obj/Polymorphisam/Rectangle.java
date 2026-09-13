package Lec04_class_obj.Polymorphisam;

public class Rectangle extends Shape{
    double len;
    double wid;
    Rectangle(double len,double wid){
        this.len=len;
        this.wid=wid;
    }
@Override
    public void area(){
    double res=len*wid;
    System.out.println("the area of rectangle is "+res);
}
}
