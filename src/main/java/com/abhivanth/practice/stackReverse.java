package com.abhivanth.practice;

import java.util.Stack;

public class stackReverse {
	String reverseinparanatheis(String inputstring) {
		Stack<Integer> mystack = new Stack<>();
		StringBuilder st = new StringBuilder();
		StringBuilder reversestack = new StringBuilder();	
		boolean flag = false;		
		int temp = 0;
		String mystring = "";
		String tempstring = "";
		
		for (int i = 0; i < inputstring.length(); i++) {
			if(inputstring.charAt(i) == '(') {
				mystack.add(i);			
				
			}
		
			
			else if(inputstring.charAt(i) == ')') {
				temp = mystack.pop();
				mystring = inputstring.substring(temp+1, i);
				mystring = reverse(mystring);
				
			
			}
			else {
				if(mystack.size()>0) {
					continue;
				}
				else {
					st.append(inputstring.charAt(i));
				}
				
					     
			   
			}
		
				
			
		}
		String output = st.toString();
		
		
		return output;
	}
	private String reverse(String mystring) {
		StringBuilder reverse = new StringBuilder();	
		
		for (int i = mystring.length()-1; i >=0; i--) {
			reverse.append(mystring.charAt(i));
			
			
		}
		mystring = reverse.toString();		
		
		return mystring;
	}
	public static void main(String[] args) {
		stackReverse obj = new stackReverse();
		System.out.println(obj.reverseinparanatheis("foo((bar))"));
		
	}

}
