package Lec01;

import java.util.Scanner;

public class math1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two no :");
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
