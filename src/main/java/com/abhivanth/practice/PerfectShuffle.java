package com.abhivanth.practice;

import java.util.Arrays;
public class PerfectShuffle {

    public static int[] interleave(int[] a1, int[] a2) {
        int[] interleaved = new int[a1.length + a2.length];
        for (int i = 0; i < interleaved.length; i++) {
            if (i % 2 != 0) {
                if (i > a1.length - 1) {
                    interleaved[i] = a2[a2.length - 1];
                } else {
                    interleaved[i] = a2[i];
                }
            } else {
                if (i > a1.length - 1) {
                    interleaved[i] = a1[a1.length - 1];
                } else {
                    interleaved[i] = a1[i];
                }

            }
        }
        return interleaved;
    }
    public static int[] perfectshuffle(int[] a){
        int halflength = a.length/2;
        int[] firstArray = Arrays.copyOfRange(a,0,halflength);
        int[] secondArray = Arrays.copyOfRange(a,halflength,a.length);

        return interleave(firstArray,secondArray);

    }

//    public static int ShuffleNumber(int n){
////        int[] myarray = new int[n];
//
//        int powervalue = (int) (Math.pow(2,n));
//
//        return powervalue% (n;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(interleave(new int[]{3, 3, 3}, new int[]{2, 2, 2})));
        System.out.println(Arrays.toString(perfectshuffle(new int[]{3, 3, 3, 4, 4, 4})));
//        System.out.println(ShuffleNumber(52));

    }

}
