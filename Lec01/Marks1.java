package Lec01;

import java.util.Scanner;

public class Marks1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter marks of 6 subjects :");
        int sub1=in.nextInt();
        int sub2=in.nextInt();
        int sub3=in.nextInt();
        int sub4=in.nextInt();
        int sub5=in.nextInt();
        int sub6=in.nextInt();

        int total=sub1+sub2+sub3+sub4+sub5+sub6;
        int avg=total/6;
        double per=(total/600.0)*100.0;

        System.out.println("the total marks obtain is " +total);
        System.out.println("avg marks are " +avg);
        System.out.println("percentage is " +per);



    }
}
