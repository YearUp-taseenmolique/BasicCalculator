package com.pluralsight;

import java.util.*;

public class BasicCalculatorProf2 {

    public static void main(String[] args) {


        float num1 = promptForFloat("Enter the first number: ");
        float num2 = promptForFloat("Enter the second number: ");
        String option = promptForOperationType();

        if (option.equals("A")) doAdd(num1, num2);
        if (option.equals("S")) doSubtract(num1, num2);
        if (option.equals("M")) doMultiply(num1, num2);
        if (option.equals("D")) doDivide(num1, num2);
    }

    public static String promptForOperationType() {
        Scanner s = new Scanner(System.in);

        System.out.println("Possible Calculations: ");
        System.out.println("   (A)dd");
        System.out.println("   (S)ubract");
        System.out.println("   (M)ultiply");
        System.out.println("   (D)ivide");

        System.out.println("Please select an option: ");

        String option = s.nextLine();
        return option;
    }

    public static float promptForFloat(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.print(prompt);
        float num = s.nextFloat();
        s.nextLine();
        return num;

    }
    public static void doAdd(float a, float b){
        float result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public static void doSubtract(float a, float b){
        float result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public static void doMultiply(float a, float b){
        float result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public static void doDivide(float a, float b){
        float result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }
}
