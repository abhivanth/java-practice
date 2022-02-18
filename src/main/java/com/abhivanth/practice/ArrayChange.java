package com.abhivanth.practice;

class example{
    void run(){
        ArrayChange.x = 0;
    }
}
public class ArrayChange {
    static int x =10;
     Long h = (long)x + 23
             ;
    int arrayChange(int[] inputArray) {
        int moves = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= inputArray[i - 1]) {
                moves += (inputArray[i - 1] - inputArray[i]) + 1;
                inputArray[i] = inputArray[i - 1] + 1;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        double one = 1.3888848770927699E-14;
        double two = 8.888888894276157E-12;
        double three = 3.64156550639226604820E-12;
        System.out.println(two-three);

        ArrayChange arrayChange = new ArrayChange();
        System.out.println(arrayChange.arrayChange(new int[]{1, 1, 1}));
    }
}

