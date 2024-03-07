package com.example.csd214lab3ankit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void annuallysalary() {
        HelloApplication x = new HelloApplication();
        assertEquals(x.Annuallysalary(3000),36000);
    }
}