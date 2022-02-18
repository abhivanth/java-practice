package com.abhivanth.practice;

// Important
class Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Foo");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Foo");
    }

    public static void newMethod(){
        System.out.println("bar class");
    }
}

class Bar extends Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Bar");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Bar");
    }


}

class Test extends Bar {
    public static void main(String[] args) {
        System.out.println("FooBar");

        Foo f = new Bar();  // stored in Foo but a new Bar();
        f.instanceMethod();
        f.instanceMethod();
        f.classMethod(); // calling a static method by an object from a static method.


//                """
//                                bird = new pigeon;

//                                early binding for static methods/class methods
//                                late binding for instance method / non static methods
//                """
        System.out.println("Foo");
        Foo foo = new Foo();
        foo.instanceMethod();
        foo.classMethod();

        System.out.println("bar");
        Bar bar = new Bar();
        bar.instanceMethod();
        bar.classMethod();
    }
}