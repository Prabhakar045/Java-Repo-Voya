package com.voya.collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(10);
        System.out.println(list.size());

        list.add("java");
        list.add("Spring");
        list.add("10000.0");
        list.add("node");
        list.add("servlets");
        list.add("pbk");
        list.add("maven");
        list.add("gradel");
        list.add("java");

        for (String l : list){
            System.out.println(l);
        }





        System.out.println("-------");
        ListIterator<String> itr = list.listIterator(list.size());
        while (itr.hasPrevious()){
            String str= itr.previous();
            System.out.println(str);
        }

        System.out.println("--------");
        System.out.println("sorting list");
        Collections.sort(list);
    }
}
