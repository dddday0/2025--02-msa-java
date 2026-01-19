package ch06.sec08;

import java.util.Arrays;

public class PracticeMethod2Main {
    public static void main(String[] args) {
        // PracticeMethod2 객체화
        PracticeMethod2 pm = new PracticeMethod2();

        String randomFileName = pm.getRandomFileName();
        System.out.println("randomFileName: " + randomFileName);

        String originalFileName = "크크크크.dkd-kdkdk.hahahah.jpg";
        String ext = pm.getExt(originalFileName); // ".jpg
        System.out.println("ext: " + ext);

        // 파일명만 랜덤이고, 확장자는 같으면 된다.
        String rFileName2 = pm.getRandomFileName(originalFileName);
        System.out.println(rFileName2);


        int[] arr= { 10, 5, 8, 11 };
        int sum = pm.sumArr(arr); // 배열의 모든 값 더한 뒤 리턴

        System.out.println("sum: " + sum);

        int[]arr2 = pm.deepCopy(arr); // 깊은 복사
        System.out.println(Arrays.toString(arr2));


        int max = pm.getMax(arr);
        System.out.println("max: " + max);
    }
}
