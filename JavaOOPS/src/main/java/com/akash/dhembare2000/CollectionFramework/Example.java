package com.akash.dhembare2000.CollectionFramework;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        // Store Student Name, ID

        Student s4= new Student(4,"Aikram");
        Student s1= new Student(2,"Akash");
        Student s2= new Student(3,"Kiran");
        Student s3= new Student(1,"Tejas");

        List list= new ArrayList();
       // List list= new LinkedList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(list); // It will give address, not actual values.
        // To get actual values we will generate a toString method in Student Clas

        // JVM doesn't know how we want to sort, thats why we are using a interface called Comparable

       // Collections.sort(list); // For Comparable
        Collections.sort(list, new SortByID());
        System.out.println(list);

        Collections.sort(list, new SortByIDDesc());
        System.out.println(list);

        Collections.sort(list, new SortByName());
        System.out.println(list);

        Collections.sort(list, new SortByNameDesc());
        System.out.println(list);

    }
}

//class Student implements Comparable<Student>{
class Student{
    // Polymorphism
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // It came from the object class
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //  We are telling how we want to compare, we are comparing based on ID.
//    @Override
//    public int compareTo(Student another) {
//        return Integer.compare(this.id, another.id);
//    }

//    @Override
//    public int compareTo(Student another) {
//        return CharSequence.compare(this.name, another.name);
//    }

    // By using comparable we can sort using any one attribute at a time
    // We are sorting by ID so we can not sort by Name and Vice Versa

    // Due to this disadvantage we are using Comparator instead of Comparable
    // To use Comparator, we will create a new class
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName()); // This is the comparison by name
    }
}

class SortByNameDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName()); // This is the comparison by name
    }
}


class SortByID implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId()); // This is the comparison by ID
    }
}

class SortByIDDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId()); // This is the comparison by ID
    }
}
