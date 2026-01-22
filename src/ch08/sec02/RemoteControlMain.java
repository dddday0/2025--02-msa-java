package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();
        //rc.turnOff();

        // turnOff 호출!!!
        TvRemoteControl trc = (TvRemoteControl) rc;
        trc.turnOff();

        rc.volumeUp(); // volume:1
        rc.volumeUp(); // volume:2
        rc.volumeUp(); // volume:3
        rc.volumeDown();
        rc.volumeDown();
        rc.volumeDown();
        rc.volumeDown();

    }
}
