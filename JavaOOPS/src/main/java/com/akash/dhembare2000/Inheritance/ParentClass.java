package com.akash.dhembare2000.Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
    public void doThis(){
        System.out.println("I am Parent");
    }

    @BeforeMethod
    public void beforeRun(){
        System.out.println("Run me first");
    }

    @AfterMethod
    public void afterRun(){
        System.out.println("Run me last");
    }
}
