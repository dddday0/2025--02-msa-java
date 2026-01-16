package ch06.sec08;

public class CalculatorMain {
    public static void main(String[] args) {
        // Calculator 객체화 해주세요.
        Calculator c1 = new Calculator();
        c1.powerOn();
        c1.powerOff();
       int result = c1.plus(10, 20);
        System.out.println("result: " + result);

        int z = 10, v = 3;
        double result2 = c1.divide(z,v);
        System.out.println("result2: " + result2);
    }
}
