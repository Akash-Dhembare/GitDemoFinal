package com.akash.dhembare2000.CollectionFramework;

import java.util.*;

public class ArrayListEg {
    public static void main(String[] args) {
        List<String> mylist= new ArrayList<String>();
        mylist.add("Akash");
        mylist.add("Kiran");
        mylist.add("Tejas");


        Vector v= new Vector();
        v.add("Akash");
        v.add("Kiran");
        v.add("Tejas");

        Stack s= new Stack();
        s.push("Akash");
        s.push("Kiran");
        s.push("Tejas");

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);


        // JVM know about natural order so it can sort
        ArrayList marks= new ArrayList();
        marks.add(90);
        marks.add(10);
        marks.add(14);
        marks.add(99);
        marks.add(98);

        Collections.sort(marks);

        ArrayList names= new ArrayList();
        names.add("Akash");
        names.add("Tejas");
        names.add("Kiran");
        names.add("Sachin");
        names.add("Vaibhav");

        Collections.sort(names);
    }
}
