package com.abhivanth.practice;

public class AreSimilarNew {
    boolean areSimilar(int[] a, int[] b) {
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            if (temp == b[i]) {
                continue;
            } else {
                int count = 0;
                for (int j = 0; j < b.length; j++) {
                    if (temp == b[j]) {
                        count++;
                        temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                        swap++;
                    }
                }
                if ((count == 0) || (count > 1)) {
                    return false;
                }
            }
        }
        return swap < 2;
    }


    public static void main(String[] args) {

        AreSimilarNew obj1 = new AreSimilarNew();

        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
        System.out.println(obj1.areSimilar(a, b));

    }


}


