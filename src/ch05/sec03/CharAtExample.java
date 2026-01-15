package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        int len = ssn.length();
        System.out.println("len:" + len);

        char gender = ssn.charAt(7);
        // 2, 4 여자 / 1,3 남자 콘솔 출력

        if(gender == '1' || gender == '3') {
            System.out.println("남자");
        } else if( gender == '2' || gender == '4') {
            System.out.println("여자");
        }
    }
}
