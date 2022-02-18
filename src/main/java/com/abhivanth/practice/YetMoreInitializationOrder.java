package com.abhivanth.practice;

public class YetMoreInitializationOrder {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() {
        System.out.println("construtor");
        add(5);
    }
    static { add(4); }
    { add(6); }
    static { add(10); }
    static {
        System.out.println("before");
        new YetMoreInitializationOrder();
        System.out.println("after");

    }
    { add(8); }
    public static void main(String[] args) {
        System.out.println("next");

    }
}
