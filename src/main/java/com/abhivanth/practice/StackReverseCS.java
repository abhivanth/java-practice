package com.abhivanth.practice;

import java.util.Stack;

public class StackReverseCS {

	public static void main(String args[]) {
		StackReverseCS stackReverseCS = new StackReverseCS();
		System.out.println(stackReverseCS.reverseInParentheses("(a()b)"));
	}

	String reverseInParentheses(String input) {
		StringBuilder outputBuilder = new StringBuilder();
		Stack<String> indexStack = new Stack<>();
		StringBuilder tempStringBuilder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				indexStack.push(tempStringBuilder.toString());
				tempStringBuilder = new StringBuilder();
			} else if (input.charAt(i) == ')') {
				indexStack.push(tempStringBuilder.toString());
				tempStringBuilder = new StringBuilder();
				// pop all empty strings in stack
				boolean isPopNeeded = true;
				String poppedString = "";
				while (isPopNeeded) {
					poppedString = indexStack.pop();
					if (!poppedString.isEmpty()||indexStack.empty()) {
						isPopNeeded = false;
					}
				}
				if (!indexStack.isEmpty()) {
					indexStack
							.push(indexStack.pop().concat(tempStringBuilder.append(poppedString).reverse().toString()));
				} else {
					outputBuilder.append(tempStringBuilder.append(poppedString).reverse().toString());
				}
				tempStringBuilder = new StringBuilder();
			} else {
				tempStringBuilder.append(input.charAt(i));
			}
		}
		while (!indexStack.isEmpty()) {
			outputBuilder.append(indexStack.remove(0));
		}
		if (tempStringBuilder.length() > 0) {
			outputBuilder.append(tempStringBuilder);
		}
		return outputBuilder.toString();
	}
}
