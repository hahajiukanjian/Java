package com.hahajiukanjian._001_String;

public class demo01 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.substring(1, 4);
        System.out.println(str2);

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);
    }
}
