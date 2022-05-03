package com.hank;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person(66.5f,1.7f);
        p.hello();

        String s = "abcde";//null;
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
    }
}
