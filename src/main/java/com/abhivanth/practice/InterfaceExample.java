package com.abhivanth.practice;

interface Example{
     default void show(int a){
         System.out.println(a + " from Example");
     }
}
interface Example2{
    default void show(int b){
        System.out.println(b + " from Example2");
    }
}

public class InterfaceExample implements Example,Example2 {

    public static void main(String[] args) {
        InterfaceExample ie = new InterfaceExample();
        ie.show(4);


    }


    @Override
    public void show(int a) {
        // overriding show or  using Example or example2
        Example.super.show(a);
        Example2.super.show(a);
    }
}
