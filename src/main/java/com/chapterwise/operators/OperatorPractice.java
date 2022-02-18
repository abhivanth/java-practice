package com.chapterwise.operators;

public class OperatorPractice {

    public static void main(String[] args) {
        int y = 0;
        //int x = y++ + ++y; // prints y =  2
        //int x = y++ + 1; // prints y = 1 ; y++ is never used ;
        int x = y += 2; // prints y = 2

        System.out.println(y +" "+x);

        int z = 2 * ((5 + 3) * 4 -   8);
        System.out.println(z);

        int y_1 = 2;
        int z_1 = 2;
        final int x_1 = y_1>10 ? y_1++ : ++z_1; // careful with post/pre increment|decrement
        System.out.println(y_1+","+z_1);
        System.out.println(x_1);//prints 3 with pre increment


    }
}
