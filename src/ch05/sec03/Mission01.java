package ch05.sec03;

public class Mission01 {
    public static void main(String[] args) {
        String  fileNm = "abc12-jjk-bbb.kkk.jpg";

        //유연하게 코드 짜야 한다.
        // 확장자명을 알고 싶다. 콘솔에 확장자명을 출력한다.

        int newfile = fileNm.lastIndexOf(".");
        String newfile2 = fileNm.substring(newfile + 1);
        System.out.println("newfile2:" + newfile2);

        //한줄로 쓰는 것도 가능
    }
}
