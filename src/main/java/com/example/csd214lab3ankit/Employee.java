package com.example.csd214lab3ankit;

import javafx.scene.control.TextField;

public class Employee {

    private int ID;
        private String Name;
        private String Salary;

        public Employee(int ID, String Name, String Salary) {
            this.ID = ID;
            this.Name = Name;
            this.Salary = Salary;
        }
        public int getId() {
            return ID;
        }
        public String getFather() {
            return Name;
        }
        public String getMother() {
            return Salary;
        }

    }



}
