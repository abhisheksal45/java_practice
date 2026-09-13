package Lec01;

public class Shopping {
    public static void main(String[] args) {
        double pro1=1234.56;
        double pro2=675456.55;
        double pro3=343576.77;

        double subtotal=pro1+pro2+pro3;
        double GST=subtotal*0.18;
        System.out.println("Subtotal of all products are : " +subtotal);
        System.out.println("Adding GST to All product :" +GST);
    }
}
