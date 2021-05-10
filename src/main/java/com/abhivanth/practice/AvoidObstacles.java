package com.abhivanth.practice;

import java.util.Arrays;

public class AvoidObstacles {
    int avoidObstacles(int[] inputArray) {
        int temp= 0;
        int jumpValue=0;
        Arrays.sort(inputArray);
        int max=inputArray[inputArray.length-1];
        for (int i = 1; i <=max+1; i++) {
            boolean isCorrect=true;
            for(int numerator:inputArray){
                if(numerator%i==0){
                    isCorrect=false;
                    break;
                }
            }
            if(isCorrect){
                jumpValue=i;
                break;
            }

        }
        return jumpValue;
    }

    public static void main(String[] args) {
        AvoidObstacles obj1 = new AvoidObstacles();
        int[] a = {1000, 999};

        System.out.println(obj1.avoidObstacles(a));
    }
}
