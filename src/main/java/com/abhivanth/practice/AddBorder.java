package com.abhivanth.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AddBorder {
	String[] addBorder(String[] picture) {

		ArrayList<String> mylist = new ArrayList(Arrays.asList(picture));
		String star = "*";

		
		mylist.add(0,"      ");
		mylist.add(picture.length+1,"      ");
		
        
//		for (int i = 0; i < mylist.size() ; i++) {
//						
//				       
//			
//			
//		}
		System.out.println(mylist);
		
		return picture;
	}

	
    public static void main(String[] args) {
    	AddBorder obj1 = new AddBorder();
    	String[] input = {"abcd",
    			          "abcd",
    			          "abcd"};
    	obj1.addBorder(input);
    	
		
	}

}
