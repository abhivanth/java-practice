package com.chapterwise.operators;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {

        byte doublex = 10;
        byte doubley = 11;

        int longz = doublex+doubley; // int , long , double value is returned/accepted.

        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (i > 0) {
                System.out.print(", "); // prints , in in between only
                continue;// can be put here because , it is inside a for loop;
            }
            System.out.print(name);
            System.out.print(", "); // prints extra ,.
        }

//            String x = "new";


            for (char x = 'a'; x <= 'z'; x++) {


            switch (x) {
                case 'n':
                    System.out.println("new");
                    continue;
                case 'o':
                    System.out.println("old");
            }


        }
    }
}
