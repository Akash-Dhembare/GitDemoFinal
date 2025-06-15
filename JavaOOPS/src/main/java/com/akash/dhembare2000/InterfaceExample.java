package com.akash.dhembare2000;


interface I1{
    public int a=100;
    static int b=100;
    final int c =100;
    int d = 100;

     void m1();
     void m2();

    default void m3(){
         System.out.println("Default method m3");
     }

     static void m4(){
         System.out.println("Static method m4");
     }

     private static void m5(){
         System.out.println("Private method m5");

     }


}

interface I2 extends I1 {

}
public class InterfaceExample implements I1{


    @Override
    public void m1() {
        System.out.println("Interface method 1");
    }

    @Override
    public void m2() {
        System.out.println("Interface method 2");
    }

    public void m3(){
        System.out.println("Overridden M3 method");
    }

    public static void m4(){
        System.out.println("Overridden M4 method");
            }

    public static void main(String[] args) {
       // I1 i1= new InterfaceExample(); // Like this also we can do it
        InterfaceExample interfaceExample= new InterfaceExample();
        interfaceExample.m1();
        interfaceExample.m2();
        interfaceExample.m3();
        m4();
        I1.m4();

        System.out.println(a+b+c);

    }
}
