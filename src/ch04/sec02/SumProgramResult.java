package ch04.sec02;

import java.util.Scanner;

/*
숫자를 입력해 주세요 (종료: 0) >> 5
숫자를 입력해 주세요 (종료: 0) >> 10
숫자를 입력해 주세요 (종료: 0) >> 3
숫자를 입력해 주세요 (종료: 0) >> 0

합계: 18
 */
public class SumProgramResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("숫자를 입력해 주세요");
            System.out.println("종료:");
            String y = scanner.nextLine();

            if("0".equals(y)) {
                break;
            } else {
               sum = sum + Integer.parseInt(y);
            }
        }
        System.out.println("합계:" + sum);
    }
}

/* if("0".equals(y)) {
        break;
}
 int yInt= Integer.parseInt(y);
 sum += yInt; //nextInt () 계행이 남아 있어서 계행 제거용
*/