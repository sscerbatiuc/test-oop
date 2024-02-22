package edu.step.poly;

import static edu.step.poly.ConsoleUtil.out;

public class Employee {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void presentYourself() {
        out("Hi, my name is");
        out(name);
        out(surname);
    }
}
