package lec03;

public class Loop1 {
    public static void main(String[] args) {
        for(int row=1;row<=3;row++){
            for(int col=1;col<=row;col++ ){
                System.out.print(+row+ " " +col);
            }
       System.out.println();
        }

    }
}
