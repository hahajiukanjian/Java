package com.hahajiukanjian._001_String;

public class demo02 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.equals("Hello"));
        System.out.println(str1 == "Hello");
        System.out.println(str1.substring(0, 3).equals("Hel"));
        System.out.println(str1.substring(0, 3) == "Hel");
        String str2 = str1.substring(0, 3);
        System.out.println(str2 == "Hel");
        String str3 = "H" + "e" + "l";
        System.out.println(str3 == "Hel");
    }
}
