package com.akash.dhembare2000.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapEg2 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
       hashMap.put("ID",1);
       hashMap.put("ID2",2);
       hashMap.put("ID3",18);
       hashMap.put("ID4",21);

        System.out.println(hashMap);
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("ID2"));
        System.out.println(hashMap.containsValue(18));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        // Iterate over the map
        for(Map.Entry<String, Integer> item: hashMap.entrySet()){
            System.out.println(item.getKey()+ " "+item.getValue());
        }
    }
}
