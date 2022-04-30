package com.sayno;

public class Basic {
    public static void main(String[] args) {
        System.out.println("正则表达式使用");
        String str = "1235";
        if (str.matches("\\d+")){
            int num = Integer.parseInt(str);
            System.out.println(num * 3);
        }
    }
}
