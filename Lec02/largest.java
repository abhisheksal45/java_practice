package Lec02;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=in.nextInt();
        int b=in.nextInt();

        if(a>b){
            System.out.println("the largest value is :" +a);
        }
        else {
            System.out.println("the largest no :" +b);
        }
    }
}
