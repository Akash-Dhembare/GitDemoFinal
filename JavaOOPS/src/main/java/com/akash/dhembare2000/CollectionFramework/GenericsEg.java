package com.akash.dhembare2000.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class GenericsEg {
    public static void main(String[] args) {
        // We are able to add any type of data in Arraylist because we are not giving the type
        // and it is generic in nature
        List mylist = new ArrayList();
        mylist.add("Akash");
        mylist.add(123);
        mylist.add(true);

       temp("Akash");

       System.out.println(sum(10,20));

        System.out.println(sumGeneric("Akash", "Dhembare"));
        System.out.println(sumGeneric(1, 2));
        System.out.println(sumGeneric(true, false));

       tempGeneric("Akash");
       tempGeneric(18);
       tempGeneric(true);
       tempGeneric(null);
    }

    public static void temp(String name){
        System.out.println(name);
    }

    // Generic function
    // It will support all type of Data Types
    public static <T> void tempGeneric (T name){
        System.out.println(name);
    }

    public static Integer sum(int a, int b){
        return a+b;
    }

    public static <T> T sumGeneric(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
