package com.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;

interface TestInterface{

    class ClassInsideInterface{
        protected void gotIt(){
        }
        private int j;
        protected int k;

    }
    int myNumber = 1;

//    static void print(){
//        System.out.println(new ClassInsideInterface().j);
//        System.out.println("static method in interface");
//    }
    void print();
    void getNumber();
    default int getArticle(){
        return -1;
    }

    int putNotProtected();
}

abstract class MyAbstractClass{

    abstract void print();

}



public class Test extends MyAbstractClass  implements TestInterface {


    Test(){

    }
    public static void main(String[] args)  {


        new Test().print();
        new Test().put();
        System.out.println(new Test().getArticle());
        new Test().getNumber();
        System.out.println(new Test().putNotProtected());

        float y = 13.0f;
        float fg = 123;
        System.out.println();

        StringBuilder sb = new StringBuilder(10);

        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array);
        array[0] = "new";
        System.out.println(list);
        LocalDateTime localDateTime = LocalDateTime.of(2020,4,4,10,14);
        LocalDateTime localDateTime2 = localDateTime;
        localDateTime = localDateTime.plusYears(10);
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(localDateTime2);




;








    }

    private void put(){
        System.out.println(" put in test class");
    }

    public int getArticle(){
        return 10;
    }


    @Override
    public  void print() {
        System.out.println("print in test class");

    }

    @Override
    public void getNumber() {
        System.out.println(" test class getnumber");

    }

    @Override
    public int putNotProtected() {
        return 0;
    }
}




