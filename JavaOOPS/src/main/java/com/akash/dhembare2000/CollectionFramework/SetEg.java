package com.akash.dhembare2000.CollectionFramework;

import java.util.*;

public class SetEg {
    public static void main(String[] args) {
        // Set does not allow duplicates
        Set hashSet = new HashSet();
        hashSet.add("Apple");
        hashSet.add("apple");
        hashSet.add("Orange"); // Will be replaced with recent one and garbage collector will delete it at the time of execution
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add(null); // Allows null



        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains("Apple"));
        System.out.println(hashSet.size());


        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange"); // Will be replaced with recent one and garbage collector will delete it at the time of execution
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        linkedHashSet.add(null); // Allows null


        System.out.println(linkedHashSet);

        Set treeSet = new TreeSet();
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Blackberry");
       // treeSet.add(null); // Not allowed

        System.out.println(treeSet);

        // To iterate over Set we can use foreach loop or iterator
        for (Object o : treeSet){
            System.out.println(o);
        }

        Iterator it= treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
