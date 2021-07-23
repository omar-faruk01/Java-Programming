package com.company;
import java.util.*;

public class Lab3 {

    public static void main(String[] args)
    {
        Student no1 = new Student("Omar", "male", 20, "IT", "Senior",1);
        Teacher t1 = new Teacher("Farooq", "male", 56, "Judge", "Law", 120000);
        printToString(no1);
        printToString(t1);
    }

    public static void printToString(Object x)
    {
        System.out.println(x.toString());
    }
}

class Student extends Person{
    private int studentID;
    private java.util.Date admissionTime;
    private String major;
    private String classStanding;

    public Student( String nme, String g, int num, String spec, String standing, int id){
        super(nme, g, num);
        major = spec;
        admissionTime = new java.util.Date();
        classStanding = standing;
        studentID = id;
    }

    public String toString()
    {
        return "Student, " + name + " - Student ID: " + studentID + ", is majoring in  "
                + major + " as a " + classStanding + " and was first admitted on \n" + admissionTime + ". "
                + name + " is a " + gender + " and " + age + " years old.";
    }
}

class Teacher extends Person {
    private String title;
    private String department;
    private int salary;

    public Teacher( String nme, String g, int num, String ttl, String dept, int sal){
        super(nme, g, num);
        title = ttl;
        department = dept;
        salary = sal;
    }

    public String toString()
    {
        return name + " is a " + title + " teaching in " + department+ " and getting paid $" + salary + ".\n" +
        name + " is a " + gender + " and " + age + " years old.";
    }
}

class Person {
    public String name;
    public String gender;
    public int age;

    public Person(String nme, String g, int num){
        name = nme;
        gender = g;
        age = num;
    }

    public String toString()
    {
        return name + " is a " + gender + " and " + age + " years old.";
    }
}


