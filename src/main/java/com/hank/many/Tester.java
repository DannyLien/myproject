package com.hank.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "tsmc");
        stocks.put("2317", "Foxconn");
        stocks.put("1234", "Good");
        System.out.println("stocks = " + stocks);
        for (String key :
                stocks.keySet()) {
            System.out.println("key = " + stocks.get(key));
        }
//        Set();
//        list();
    }

    private static void Set() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(33);
        hashSet.add(44);
        hashSet.add(55);
        hashSet.add(33);
        hashSet.add(44);

        for (int n :
                hashSet) {
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(11);
        arraylist.add(22);
        arraylist.add(33);
        arraylist.add(44);
        arraylist.add(33);
        System.out.println(arraylist);
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(3));

        List<Integer> scores = Arrays.asList(55, 66, 77, 88, 99);
        for (int n :
                scores) {
            System.out.println(n);
        }
    }
}
