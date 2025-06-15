package com.akash.dhembare2000.CollectionFramework;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEg {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
       // Map hashMap = new LinkedHashMap();
      //  Map hashMap = new TreeMap();
        hashMap.put("name", "Akash");
        hashMap.put("rollNo", 18);
        hashMap.put("Address", "Panvel");
        hashMap.put(null, "Abc"); // Will be ignored
        hashMap.put(null, null); // One null key allowed

        System.out.println(hashMap);
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap);
    }
}
