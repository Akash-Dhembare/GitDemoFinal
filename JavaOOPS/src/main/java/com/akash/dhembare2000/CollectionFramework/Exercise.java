package com.akash.dhembare2000.CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1= new Hashtable<>();
        ht1.put(1, "One"); // Allowed
       // ht1.put("1", "One"); // Not Allowed
      //  ht1.put(null, "One"); // Not Allowed

        HashMap h1= new HashMap();
        h1.put(null,"Abc"); // Allowed

        Set<String> fruits= new HashSet<>();
        fruits.add("Mango");
        fruits.add("Orange");
       // fruits.add(123); // Not allowed because we given type as String



    }
}
