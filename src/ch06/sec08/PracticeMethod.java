package ch06.sec08;

public class PracticeMethod {

    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random (int x) {
        return (int)(Math.random()* x);
    }

    public int random(int z, int y) {
        return (int)(Math.random()* (y-z) ) + z;
    }
}
