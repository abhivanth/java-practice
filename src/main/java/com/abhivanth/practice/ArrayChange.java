package com.abhivanth.practice;

public class ArrayChange {
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
        ArrayChange arrayChange = new ArrayChange();
        System.out.println(arrayChange.arrayChange(new int[]{1, 1, 1}));
    }
}
