package ch04.sec02;

public class PrintStarTriangle {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4) + 3; // 3~6 랜덤값
        System.out.println("star:" + star);

       for(int z = 0; z < star; z++) {
           for (int i = 0; i <= z; i++) {
               System.out.print("*");
           }
           System.out.println();
       }
        // if star = 3
        // *
        // **
        // ***
    }
}
