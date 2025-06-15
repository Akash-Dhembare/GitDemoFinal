package com.akash.dhembare2000;


abstract class AC1{

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static block");
    }
    AC1(){
        System.out.println("Abstract class constructor Default");
    }
    AC1(int a){
        this();
        System.out.println("Abstract class constructor Parametarized");
    }
    public void m2(){
        System.out.println("Normal Method");
    }
    abstract void m1(); // Abstract method in abstract class
}

class Child1 extends AC1{

    {
        System.out.println("Child static block");
    }

    Child1(int a) {
        super(a);
    }

    @Override
    void m1() {
        System.out.println("Abstract m1 method"); // Implementing Abstract method
    }
}

public class AbstractionEg{
    public static void main(String[] args) {
        Child1 a= new Child1(10);
        a.m1(); // calling abstract method
        a.m2();

    }
}
