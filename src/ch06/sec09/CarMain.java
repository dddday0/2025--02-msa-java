package ch06.sec09;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("그랜져"); // 그랜져 문자열이 model에 저장되게
        System.out.println("c1.model: " + c1.model);
        Car c2 = new Car(); // 모델명: 소나타
    }
}
