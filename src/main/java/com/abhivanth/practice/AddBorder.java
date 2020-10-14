package com.abhivanth.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class AddBorder {
	String[] addBorder(String[] picture) {
		ArrayList<String> mylist = new ArrayList(Arrays.asList(picture));
		int length = picture[0].length();
		mylist.add(0,"*".repeat(length));
		mylist.add(mylist.size(),"*".repeat(length));
		for (int i = 0; i < mylist.size() ; i++) {
			mylist.add(i,"*".concat(mylist.remove(i).concat("*")));
		}
		System.out.println(mylist);
		picture = mylist.toArray(String[]::new);
		return picture;
	}
	String[] addBorder1(String[] picture) {
		int length= picture[0].length();
		List<String> list = Arrays.<String>asList(picture).stream().map(x -> "*" + x + "*").collect(Collectors.toList());
		list.add(0,"*".repeat(length+2));
		list.add("*".repeat(length+2));
		return list.toArray(String[]::new);
	}
	
    public static void main(String[] args) {
    	AddBorder obj1 = new AddBorder();
    	String[] input = {"abcd",
    			          "defg",
    			          "ijkl"};
		String[] output=obj1.addBorder1(input);
		System.out.println(output);
    	
		
	}

}
