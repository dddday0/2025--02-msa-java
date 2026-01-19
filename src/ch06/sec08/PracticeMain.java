package ch06.sec08;

public class PracticeMain {
    public static void main(String[] args) {
        //PracticeMethod 객체화 해주세요.
        PracticeMethod pm = new PracticeMethod();
        pm.abs(10);

        int r1 = pm.random(10); // 0~9 랜덤값 리턴
        int r2 = pm.random(20); // 0~19 랜덤값 리턴

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);

        int r3 = pm.random(2, 10); // 2~9 랜덤값 리턴
        int r4 = pm.random(10, 15); // 10~ 14 랜덤값 리턴

        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        /*
         90점 초과는 콘솔에 "A", 80점 초과는 "B", 나머지는 "C" 리턴 */
        String grade = pm.getGrade(100);

        System.out.println(grade);

        pm.printStar(5); //*****
        pm.printStar(3); //***
        System.out.println("---------");
        pm.printStarTriangle(4);
        //*
        //**
        //***
        //****
        System.out.println("---------");
        pm.printStarRectangle(4);
        //****
        //****
        //****
        //****

        pm.gugudan(5);
        // 5 x 1 = 5
        // ...
        // 5 x 9 = 45

        pm.gugudan(3,6); // 3~6단 구구단 출력

        int sum = pm.sum(10, 50); //10~50까지 순차적으로 더한값을 리턴
        System.out.println(sum);
    }
}
