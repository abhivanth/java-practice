package com.abhivanth.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class demo {

	public static void main(String[] args) {

		String[] input = {"abcd",
				"abcd",
				"abcd"};
		int length = input[0].length();

		ArrayList<String> mylist = new ArrayList(Arrays.asList(input));

		mylist.add(0,"*".repeat(length));
		System.out.println(mylist);
		// TODO Auto-generated method stub

		

	}

}
