package com.voya.collections.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("java");
        linkedList.add("C");
        linkedList.add("C++");
        linkedList.add("Python");
        linkedList.add("Spring");
        linkedList.add("Servlets");
        linkedList.add("JavaScript");


        System.out.println(linkedList.get(11));

        Iterator<String> iterator =linkedList.iterator();
        while (iterator.hasNext()){
            String values= iterator.next();
            System.out.println(values);
        }

                linkedList.add(String.valueOf(linkedList.size()));


    }
}
