package com.hahajiukanjian._001_String;

public class demo06 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append('c');
        builder.append("Hello");
        String str1 = builder.toString();
        System.out.println(str1);
    }
}
