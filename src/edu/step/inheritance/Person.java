package edu.step.inheritance;

public class Person {
    private String name;
    private String surname;
    private String description;

    public Person(String name, String surname, String description) {
        this.name = name;
        this.surname = surname;
        this.description = description;
    }

    public boolean equals(Object object){
        if(this == object) {
            return true;
        }

        if(this.getClass() != object.getClass()) {
            return false;
        }
        Person otherPerson = (Person) object;
        boolean nameIsEqual = this.name.equals(otherPerson.name);
        boolean surnameIsEqual = this.surname.equals(otherPerson.surname);
        boolean descriptionIsEqual = this.description.equals(otherPerson.description);

        return nameIsEqual
                && surnameIsEqual
                && descriptionIsEqual;

    }
}
