package control.legacy;

public class LegacyMain {
    public static void main(String[] args) {
        //삼성 tv 객체화
        //Harman Speaker: 소리가 맑아요.
        //Marten woofer: 웅~~ 웅~~웅~~

        //소리가 마음에 안 들어
        //Speaker를 JBLSpeaker로 교체하고 싶어요.
        SamsungTv s = new SamsungTv();
        s.sound();
    }
}
