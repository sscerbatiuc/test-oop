package edu.step.inheritance;

public class Main {
    public static void main(String[] args) {
        int x = 21;
        int y = 20;

        boolean isEqual = x == y;

        Person peter = new Person("Peter", "Smith", "Accountant");
        Person firstPerson = new Person("John", "Smith", "IT specialist 2");
        // + 99998 more

        // Add new person
        // John Smith "IT specialist"
        Person person = new Person("John", "Smith", "IT specialist");

        System.out.println(firstPerson.equals(person));
    }
}
