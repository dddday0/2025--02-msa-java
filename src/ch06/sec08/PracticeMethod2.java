package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {
    public String getRandomFileName() {
        return UUID.randomUUID().toString();
    }

    public String getExt(String z) {
        int newfile = z.lastIndexOf(".");
        String newfile2 = z.substring(newfile);
        return newfile2;
    }

    public String getRandomFileName(String s) {
        String sz = getRandomFileName() + getExt(s);
        return sz;
    }

    public int sumArr(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    public int[] deepCopy(int[] arr2) {
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr2[i];
        }
        return arr3;
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}





