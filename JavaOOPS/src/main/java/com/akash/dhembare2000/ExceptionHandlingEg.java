package com.akash.dhembare2000;

public class ExceptionHandlingEg {
    public static void main(String[] args) {
//        try {
//            System.out.println(10/0); // Runtime exception
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Final block");
//        }
//        System.out.println("Hi Akash"); // Will not execute due to exception

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException|ArithmeticException e)
        {
            System.out.println("exception raised  " + e);
        }
        System.out.println("rest of the app");
    }
}
