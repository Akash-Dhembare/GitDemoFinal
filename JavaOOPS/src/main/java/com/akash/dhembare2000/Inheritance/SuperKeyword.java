package com.akash.dhembare2000.Inheritance;

public class SuperKeyword {
    int a; // Class Variable

    public SuperKeyword(int a) {
        this.a=a;
    }


    public int multiplyByTwo(){
        a=a*2;
        return a;
    }

    public int multiplyByThree(){
        a=a*3;
        return a;
    }
}
