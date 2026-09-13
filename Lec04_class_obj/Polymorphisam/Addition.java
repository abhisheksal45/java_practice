package Lec04_class_obj.Polymorphisam;

public class Addition {

    public void Add(int a ,int b){
        int res=a+b;
        System.out.println(res);
    }
    public void Add(int a,int b,int c){
        int res=a+b+c;
        System.out.println(res);
    }
    public void Add(double a,double b){
        double res=a+b;
        System.out.println(res);
    }
}
