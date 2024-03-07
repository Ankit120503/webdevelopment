package com.example.csd214lab3ankit;

public class Employee {

    private int ID;
        private String Name;
        private String Salary;


    public Employee(int ID, String name, String salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
