package control.ioc;

import control.*;

public class TvFactory {
    public static Tv generateTv(String wooferName, String speakerName){
        //wooferName 매개변수에 담겨져 있는 문자열이 "marten"이면 MartenWoofer 객체화
        //"genelec"이면 GenelecWoofer 객체화
       /* if("marten".equals(wooferName)){
            MartenWoofer m = new MartenWoofer();
        } else if("genelec".equals(wooferName)) {
            GenelecWoofer g = new GenelecWoofer();
        } else */
        Woofer woofer = switch (wooferName) {
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default ->  null;
        };

        //speakerName 매개변수에 담겨져 있는 문자열이 "jb1"이면 JBLSpeaker 객체화
        //"harman"이면 HarmanSpeaker 객체화
        Speaker speaker = switch (speakerName) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}
