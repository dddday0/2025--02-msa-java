package ch04.sec02;

public class PrintStarRectangle {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4) + 3; // 3~6 랜덤값

        for(int z= 0; z< star; z++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.print("*") 만 이용
        // star = 3;
        // ***
        // ***
        // ***

    }
}
