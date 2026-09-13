package Lec04_class_obj.inheritance;

public class car extends vehicle{

    public car(String Brand, String Speed) {
        super(Brand, Speed);
    }
public void Cardetails(){
        System.out.println("Brand of the car is  " +Brand+ " ANd the Speed of the car is "+Speed);
}
public void noofdoors(){
        System.out.println("this vehicle have 4 doors");
    }
}
