package edu.step.arrays;

import edu.step.poly.Dev;

public class ArrayDemo {
    private Dev dev;
    private Dev devs[];
    private String[][][] linesOfTextReadFromTheFile;

    public static void main(String[] args) {
        int y;
        String message = "Hello world!";
        Dev dev = new Dev("John", "Smith");

        int[] numbers = new int[300];
        numbers[0] = 100;
        numbers[149] = 105;

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        for (int idx = 0; idx < numbers.length; idx++) {
            numbers[idx] =  idx * 56;
        }

        for(int num: numbers){
            System.out.println(num);
        }

        String[] messages = new String[1000];
        messages[0] = "First message";
        messages[555] = "Second message";
        messages[658] = "Third messages";
        if(messages.length > 1501) {
            messages[1500] = "Test";
        }

        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
        }

        int index = 0;
        while(index < messages.length) {
            messages[index] = "Message";
            index++;
        }


        double[] decimals = { 1.3, 4.5, 5.6, 50.5 };
    }
}
