package ch06.sec08;

public class Calculator {
    public void powerOn() {
        System.out.println("전원 ON");
    }

    public void powerOff() {
        System.out.println("전원 OFF");
    }

    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public double divide(int z, int v) {
       return (double) z/ v;
    }
}
