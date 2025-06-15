package com.akash.dhembare2000.Inheritance;

public class Constructor extends SuperKeyword{
    int a; // Class Variable

    // default constructor
    public Constructor(int a) {
               // Instance Variable
        super(a); // Parent class constructor will invoke
        // We will use Super() whenever there is concept of inheritance
        // It should be the first line your child constructor
        this.a=a;
    }


    public int increment(){
        a=a+1;
        return a;

    }

    public int decrement(){
        a=a-1;
        return a;

    }
}
