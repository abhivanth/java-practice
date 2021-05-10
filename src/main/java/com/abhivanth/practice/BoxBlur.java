package com.abhivanth.practice;

import java.util.ArrayList;
import java.util.List;

public class BoxBlur {


    int[][] boxBlur(int[][] image) {
        int countRows = 0;
        int countColumns = 0;
        int intialI = 0;
        int intialJ = 0;
        int avg = 0;
        int noOfElement = 0;
        int bluredImage = 0;
        int jVertical = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = intialI; i <image.length ; i++) {
            countRows++;
            for (int j = intialJ; j <image[0].length ; j++) {
                countColumns++;
                avg += image[i][j];
                noOfElement++;

                if(countColumns == 3){
                    countColumns = 0;
                    if(noOfElement == 9){
                        bluredImage = avg/9;
                        result.add(bluredImage);
                        avg = 0;
                        noOfElement = 0;
                        j = intialJ++;
                        if(intialJ == (image[0].length - 2)){
                            i = intialI++;
//                            intialJ = jVertical++;
                            intialJ = 0 ;
                            break;
                        }else {
                            i = intialI;
                        }

                        continue;
                    }

                    break;
                }


            }

        }




        return image;
    }








    public static void main(String[] args) {
        BoxBlur obj = new BoxBlur();
        int[][] inputImage = new int[][]{{36,0,18,9,9,45,27},{27,0,254,9,0,63,90},{81,255,72,45,18,27,0},{0,0,9,81,27,18,45},{45,45,227,227,90,81,72},{45,18,9,255,9,18,45},{27,81,36,127,255,72,81}};
//        obj.boxBlur(inputImage);
        obj.boxBlur(inputImage);
    }

}
