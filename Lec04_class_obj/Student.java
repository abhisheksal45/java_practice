package Lec04_class_obj;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        main1 ma=new main1();
        ma.name1("Abhi");
        ma.rollno(12);
        ma.marks1(123);

    }
    public static class main1 {
        String name;
        int Roll_no;
        int marks;

        public String name1(String name) {
            System.out.println("the name odf student " + name);
            return name;

        }

        public int rollno(int Roll_no) {
            System.out.println("the Roll no is " + Roll_no);
            return Roll_no;


        }

        public int marks1(int ma) {
            System.out.println("the marks of STUDENT is " + ma);
            return ma;
        }
    }
}
