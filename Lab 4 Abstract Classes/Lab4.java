package com.company;
import java.util.*;

public class Lab4 {
    public static void main (String[] args)
    {
        String name;
        String department;
        int salary;
        int bonus;

        // good employee input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter good employee's details: ");
        name = input.next();
        department = input.next();
        salary = input.nextInt();
        bonus = input.nextInt();

        GoodEmployee Omar = new GoodEmployee(name, department, salary,bonus);

        // basic employee input
        System.out.print("Enter basic employee's details: ");
        name = input.next();
        department = input.next();
        salary = input.nextInt();

        BasicEmployee Arham = new BasicEmployee(name, department, salary);

        printToString(Omar);
        printToString(Arham);
    }
    public static void printToString(Object x)
    {
        System.out.println(x.toString());
    }

}

abstract class Employer{
    private String name;
    private String department;
    private int salary;

    Employer(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    public String showSalary()
    {
        return "salary= $" + salary;
    };

    public abstract String showBonus();

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", " + showSalary();
    }
}

class BasicEmployee extends Employer{
    BasicEmployee(String name, String department, int salary)
    {
        super(name, department, salary);
    }

    @Override
    public String showSalary()
    {
        return "salary= $" + getSalary();
    };

    @Override
    public String showBonus(){
        return "bonus= Does not qualify";
    };

    @Override
    public String toString() {
        return super.toString() +
                ", " + showBonus();
    }
}

class GoodEmployee extends Employer{
    private int bonus;

    GoodEmployee(String name, String department, int salary, int bonus)
    {
        super(name, department, salary);
        this.bonus = bonus;
    }
    @Override
    public String showSalary()
    {
        return "salary= $" + getSalary();
    };

    @Override
    public String showBonus(){
        return "bonus= $" + bonus;
    };

    @Override
    public String toString() {
        return  super.toString() +
                ", " + showBonus();
    }
}