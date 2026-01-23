package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        //스위치 표현식: 결과값을 리턴해야 할 때 좋다.
        //스위치 표현식은 default 필수
        int num = (int)(Math.random()*13)+1;
        System.out.println("num: " + num);
        String denomination = switch(num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> {
                int a = 10;
                int b = 20;
                yield "Q"; // yield는 생략가능, 중괄호 쓰면 연산가능
            }
            case 13 -> "K";
            default -> String.valueOf(num);// 정수 > 문자열
        };
        System.out.println("denomination: " + denomination);
    }
}
