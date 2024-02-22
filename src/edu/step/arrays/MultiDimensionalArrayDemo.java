package edu.step.arrays;

import edu.step.poly.Employee;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        Employee[][] employeesByGender = new Employee[2][1000];

        Employee john = new Employee("John", "Smith");
        employeesByGender[0] = new Employee[50];
        employeesByGender[0][0] = john;
        employeesByGender[0][1] = john;
        employeesByGender[0][2] = new Employee("Will", "Smith");


        Employee jane = new Employee("Jane", "Smith");
        employeesByGender[1] = new Employee[100];
        employeesByGender[1][0] = jane;
        employeesByGender[1][1] = jane;
        employeesByGender[1][2] = new Employee("Jill", "Smith");

        for(int i=0; i<2; i++) {
            for(int j=0; j<5; j++){
                System.out.println(employeesByGender[i][j]);
            }
            System.out.println("Trecem la al doilea array");
        }
    }
}
