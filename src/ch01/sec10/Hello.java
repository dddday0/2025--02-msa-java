package ch01.sec10; // 여기는 수정하지 않는다.

import java.io.PrintStream;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World! 하하");

        PrintStream ps = System.out;
        ps.println("Hello, World! 크크");
    }
}
