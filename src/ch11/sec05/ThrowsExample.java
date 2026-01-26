package ch11.sec05;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾을 수 없다!!!");
        } catch (Exception e) {
            System.out.println("예외 발생!!");
        }
        findClass2();
    }

    //코드 안에 예외를 몰아서 예외처리하기 위해? throw
    /* 메소드가 예외를 던질 때 해결방법 2가지 */
    // 1. 나도 던진다.
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2"); // forName 메소드는 예외를 던진다.
    }

    //2. 해결한다. (try- catch)
    public static void findClass2() {
        try{
            Class.forName("java.lang.String2"); //forName 메소드는 예외를 던진다.
        } catch (Exception e) {
            System.out.println("클래스를 찾을 수 없습니다.");
        }
    }


}
