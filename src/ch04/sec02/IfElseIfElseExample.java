package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 81) +20 ; // 20~100점 사이 랜덤값
       /*
       90점 ~100점 이상 "A등급" 출력
       80점 ~89점 이상 "B등급" 출력
       70점 ~79점 이상 "C등급" 출력
        나머지 "D등급" 출력 */
        String result = "D";
        if( score >= 90){
            result = "A";
        } else if ( score >= 80 ) {
            result = "B";
        } else if ( score >= 70 ) {
            result = "C";;
        }
        System.out.printf("%s등급\n", result);
    }
}
