package ch02.sec01;
// p.64
public class OperationPromotionExample {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        int result = n1 / n2;
        System.out.println("result:" + result);

        float result2 = (float) n1 / n2;
        System.out.println("result2:" + result2);


        char c1 ='A';
        System.out.printf("%c - %d\n", c1, (int)c1);

        int i1 = c1 + 2;
        System.out.printf("%c - %d\n", (char)i1, i1);

        String str = "AC"; // 0번방: 65, 1번방: 67 저장
        System.out.println("str:" + str);



    }
}
