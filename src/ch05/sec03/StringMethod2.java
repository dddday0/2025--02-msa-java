package ch05.sec03;

public class StringMethod2 {
    public static void main(String[] args) {
        // 문자열 잘라내기 substring 메소드 이용, 방법 2가지
        //첫번째, 아규먼트 1개(정수) 이용, 정수(index)문자부터
        // 마지막 문자까지의 문자열을 잘라낸다.
        String oldStr1 = "abcdefghijklmnopqrstu";
        String newStr1 = oldStr1.substring(10);
        System.out.println("oldStr1:" + oldStr1);
        System.out.println("newStr1:" + newStr1);

        //두번째, 아규먼트 2개(둘다 정수) 이용
        //둘다 index값이고,
        // 시작 index, 종료 index인데,  그 전 문자까지 자른다
        String newStr2 = oldStr1.substring(10, 13);
        System.out.println("newStr2:" + newStr2);

        // 미션, 생년월일 문자열만 잘라내기
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0,6);
        System.out.println("firstNum:" + firstNum);

        String secondNum = ssn.substring(7);
        System.out.println("secondNum:" + secondNum);

        //문자열안에서 문자열 찾기, -1은 그런 문자열 없다.
        // 찾으면 첫번째 문자의 index값을 리턴한다.
        int idx = oldStr1.indexOf("hi");
        System.out.println("idx:" + idx); // 7

        // 5를 찾기
        int idx2 = ssn.indexOf("5");
        System.out.println("idx2:" +idx2);

        int idx3 = ssn.lastIndexOf("5");
        System.out.println("idx3:" +idx3);

        // 문자열도 포함되어 있는지 찾을 때, contains도 사용가능
        if (ssn.contains("88") ) {
            System.out.println("ssn에 88이 있음");
        } else {
            System.out.println("ssn에 88이 없음");
        }

        String board = "번호, 제목, 내용, 성명";
        String[] arr = board.split(",");
        for(int i= 0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %s\n", i, arr[i]);
        }
    }
}
