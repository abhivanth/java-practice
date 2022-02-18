package com.abhivanth.practice;

public class AbstarctClassExample {
    OnePlus onePlus;
    Apple apple;
    public static void main(String[] args) {
        Phone obj1 = new OnePlus();
        Phone obj2 = new Apple();
        show(obj1);
        show(obj2);
//        show(new OnePlus());
//        show(new Apple());
    }
    static void show(Phone obj){
        obj.showConfig();
    }

}
abstract class Phone{

    public abstract void showConfig();

}

class OnePlus extends Phone{

    public  void showConfig(){
        System.out.println("snapdragon 855");
    }
}
class Apple extends Phone{
    public  void showConfig(){
        System.out.println("A12 Bionic chip");
    }
}