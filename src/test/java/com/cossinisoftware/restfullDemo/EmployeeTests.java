package com.cossinisoftware.restfullDemo;

import org.junit.Test;

import java.lang.reflect.Method;

public class EmployeeTests {

    @Test
    public void nameShouldBeSplittedInFirstNameAndSurname() {
        Employee employee = new Employee("firstname surname","role");
        assert(employee.getFirstName().equals("firstname"));
        assert(employee.getSurname().equals("surname"));
    }

    @Test
    public void firstNameAndSurnameShouldReturnFromName() {
        Employee employee = new Employee("firstname", "surname", "role");
        assert(employee.getName().equals("firstname surname"));
    }

}
