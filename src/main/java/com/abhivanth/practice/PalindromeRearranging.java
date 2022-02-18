package com.abhivanth.practice;

public class PalindromeRearranging {
    boolean palindromeRearranging(String inputString) {
        boolean isPalindromePossible = true;
        int[] charcount = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            charcount[inputString.charAt(i) - 97] += 1;
        }
        int numberOfOdds = 0;
        for (int i = 0; i < 26; i++) {
            numberOfOdds += charcount[i] % 2;
        }
        if (numberOfOdds > 1 ) {
            isPalindromePossible = false;
        }
        return isPalindromePossible;

    }

    public static void main(String[] args) {
        PalindromeRearranging p=new PalindromeRearranging();
        System.out.println(p.palindromeRearranging("aabb"));

    }
}
