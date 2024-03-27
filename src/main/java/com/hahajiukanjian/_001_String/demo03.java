package com.hahajiukanjian._001_String;

public class demo03 {
    public static void main(String[] args) {
        String str1 = "🍺Hello";
        System.out.println(str1.length());

        int i = str1.codePointCount(0, str1.length());
        System.out.println(i);

        char first = str1.charAt(1);
        System.out.println(first);

        int index = str1.offsetByCodePoints(0, 1);
        System.out.println(index);
        int cp = str1.codePointAt(index);
        System.out.println(cp);
        index += Character.charCount(cp);
        System.out.println(index);
    }
}
