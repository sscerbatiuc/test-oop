package edu.step.poly;

import static edu.step.poly.ConsoleUtil.out;

public class Dev extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Dev(String name, String surname) {
        super(name, surname);
    }

    public Dev(String name, String surname, String programmingLanguage) {
        super(name, surname);
        this.programmingLanguage = programmingLanguage;
    }

    public void presentYourself() {
        out("Hi, I am a programmer");
        out("My name is");
        out(getName());
        out(getSurname());
        out(programmingLanguage);
    }
}
