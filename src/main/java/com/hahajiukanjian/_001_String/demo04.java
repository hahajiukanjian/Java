package com.hahajiukanjian._001_String;

public class demo04 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        if (str1.startsWith("H")) {
            System.out.println(str1);
        }
        if (str1.endsWith("World")) {
            System.out.println(str1);
        }
        System.out.println(str1.indexOf("ld"));

        System.out.println(str1.replace("l", ":"));
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
    }
}
