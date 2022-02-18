package com.abhivanth.practice;

public class SwitchExample {
    static  int f = 5;
    static short y = (short) ( f= 100);

    public static void main(String[] args) {

        String s = "abc";
    // does not modify the String S.
        s.concat("d");
        s.trim();
        s.replace('a','A');
        s.substring(1);

        int x = 1111;//
        System.out.println(x);

        double a = 39.21;

        boolean alwaystrue = true;
        String booleanString = null;


        if(booleanString != null & x>1){
            System.out.println("pass");
        }


        float b = 2.1f;//floating-point literals are assumed to be double, unless postfi xed with an f
        boolean exp = true|true;

        System.out.println(f); // Outputs 3
        System.out.println(y);

        char d = 'a';
        final char c1 = 'A';
        final char c2 = 'b';
        final char c3 = 'B';

        switch(d){
            case c1 : {
                System.out.print("A");
            }
            default : {
                System.out.print("default ");
                break;
            }
            case c2 : {
                System.out.print("B");
            } break;
            case c3 : {
                System.out.print("C");
            }
        }
    }



}
