package edu.step.poly;

public class Accountant extends Employee{

    private String accountantCourse;

    public Accountant(String name, String surname, String accountantCourse) {
        super(name, surname);
        this.accountantCourse = accountantCourse;
    }
}
