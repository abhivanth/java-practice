package com.abhivanth.practice;

public class Ipv4Address {
    static boolean isIPv4Address(String inputString) {
        String[] mystring = inputString.split("\\.", -1);
        String temp = "";
        if (mystring.length == 4) {
            for (int i = 0; i < mystring.length; i++) {
                temp = mystring[i];
                if (temp.trim().length() == 0) {
                    return false;
                } else {
                    boolean letters = temp.matches(".*[a-z]+.*");
                    if (letters == true||temp.startsWith("0")&&temp.length()>1) {
                        return false;
                    } else {
                        long currentBit = Long.parseLong(temp);
                        if (!(currentBit >= 0 && currentBit <= 255)) {
                            return false;
                        }
                    }
                }
            }
        } else {
            return false;
        }

        return true;
    }
    static boolean isIPv4Address1(String s) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";

        return s.matches(PATTERN);

    }

    public static void main(String[] args) {

//        System.out.println(isIPv4Address("01.1.1.11"));
        System.out.println(isIPv4Address1("00.1.1.11"));

    }


}
