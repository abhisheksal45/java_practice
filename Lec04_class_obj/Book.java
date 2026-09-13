package Lec04_class_obj;

public class Book {
    String title;
    String author;
    double price;

    Book(String title,String author,double Price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
public void Bookdetails(){
        System.out.println("Book name is "+title+ " Auther is "+ " and price is "+ price);
    }
}
