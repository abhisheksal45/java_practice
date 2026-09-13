package Lec04_class_obj.Polymorphisam;

public class Triangle extends Shape{
   double b;
   double h;
    Triangle(int b,int h){
       this.b=b;
       this.h=h;
    }
@Override
    public void area(){
    double res=0.5*b*h;
    System.out.println(res);
}


}
