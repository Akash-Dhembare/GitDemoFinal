package com.akash.dhembare2000;


class Parent{
    public static void m1(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    public static void m1(){
        System.out.println("Child");
    }

}


public class StaticMethodOverriding {
    public static void main(String[] args) {
        Parent.m1();
        Child.m1();
    }
}
