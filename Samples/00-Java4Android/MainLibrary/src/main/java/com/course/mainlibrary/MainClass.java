package com.course.mainlibrary;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        /*
        int age = 30;
        float weight = 85.5f;
        long idNumber = 12010016485L;

        String firstName = "Mohammad";
        String lastName = "Mohammad";

        Boolean isMarried = false;

        System.out.print("The age is " + String.valueOf(age));
        System.out.println();
        System.out.print("The weight is " + String.valueOf(weight));
        System.out.println();
        System.out.print("The Id Number is " + String.valueOf(idNumber));
        System.out.println();
        System.out.print("The Person name is " + firstName + " " + lastName);
        System.out.println();
        System.out.print("Is Person Married " + String.valueOf(isMarried));
        System.out.println();
        */

        //Operations
        //int type operation
        /*int x = 100;
        int y = 50;
        System.out.print("x + y = " + String.valueOf(x + y));
        System.out.println();
        System.out.print("x - y = " + String.valueOf(x - y));
        System.out.println();
        System.out.print("x * y = " + String.valueOf(x * y));
        System.out.println();
        System.out.print("x / y = " + String.valueOf(x / y));
        System.out.println();
        System.out.print("Increase x =" + String.valueOf(x ++));
        System.out.println();

        //String  operation
        String firstName = "Mohammad";
        String lastName = "Mahmoud";

        System.out.print("Full name " + firstName + " " + lastName);
        System.out.println();
        System.out.print("Capitalize first name " + firstName.toUpperCase());
        System.out.println();
        System.out.print("Capitalize last name" + lastName.toUpperCase());
        System.out.println();
        System.out.print("Lower case first name" + firstName.toLowerCase());
        System.out.println();
        System.out.print("Lower case last name" + lastName.toLowerCase());
        System.out.println();*/


        //Relational operation
        int c = 70;
        int d = 80;
        d = sc.nextInt();
        if (c > d) {
            System.out.print("C bigger than d");
        } else if (c == d) {
            System.out.print("d equal c");
        } else {
            System.out.print("d bigger than c");
        }
        System.out.println();


        //Loops
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.print("Line number " + String.valueOf(i));
            System.out.println();
        }

        for (int i = 0; i < 10; i = i + 2) {
            System.out.print("Line number " + String.valueOf(i));
            System.out.println();
        }



    }


    int CarSpeed(int distance, int time) {
        return distance / time;
    }


}
