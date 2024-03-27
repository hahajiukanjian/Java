package com.hahajiukanjian._001_String;

public class demo05 {
    public static void main(String[] args) {
        String str1 = "  Hello World ";
        System.out.println(str1);
        System.out.println(str1.strip());
        System.out.println(str1.stripLeading());
        System.out.println(str1.stripTrailing());
        System.out.println(str1.stripIndent());
    }
}
