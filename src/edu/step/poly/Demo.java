package edu.step.poly;

public class Demo {
    public static void main(String[] args) {

//        Employee emp2 = new Employee("John", "Smith");
//        emp2.presentYourself();
//
//        Dev[] devs = new Dev[100];
//        Dev javaDev = new Dev("Peter", "Williams", "Java");
//        javaDev.presentYourself();
//
//        Accountant[] accountants = new Accountant[20];
//        Driver[] drivers = new Driver[20];
//
//        Employee employeeDev = new Dev("Selena", "Williams", "C++");
//        employeeDev.presentYourself();

        Employee[] employees = new Employee[100]; // null, 0, 0.0,

        System.out.println(employees.length);

        employees[0] = new Dev("Peter", "Williams", "Java");
        employees[1] = new Accountant("Helen", "Smith", "Best accountant course");
        employees[2] = new Driver("Will", "Smith", "A,B,C,D");
        employees[3] = new Designer("Peter", "Chapelle");

        for(Employee emp: employees){
            emp.presentYourself();
        }


    }
}
