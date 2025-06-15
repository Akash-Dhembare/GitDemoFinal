package com.akash.dhembare2000.Inheritance;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass{


   @Test
    public void testRun(){
       int a=3;
       doThis(); // Calling method through Inheritance

       Constructor rs= new Constructor(5); // Parametarized Constructor
       System.out.println(rs.increment()); // Calling method through object
       System.out.println(rs.decrement());

     //  SuperKeyword sk= new SuperKeyword(3);
      System.out.println(rs.multiplyByTwo());

   }

}
