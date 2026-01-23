package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;
        System.out.println("num: " + num);
        //짝수, 홀수
        switch (num) {
            case 1, 3, 5:
                System.out.println("홀수");
                break;
            case 2, 4, 6:
                System.out.println("짝수");
                break;
        }
    }
}
