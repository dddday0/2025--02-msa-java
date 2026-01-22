package ch07.sec10;
//Phone 클래스를 상속
public class SmartPhone extends Phone {
    @Override
    public void bell() {
        System.out.println("스마트폰이 울린다.");

    }
}
