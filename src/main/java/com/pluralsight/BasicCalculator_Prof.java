package com.pluralsight;
import java.util.*;

public class BasicCalculator_Prof {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = s.nextFloat();
        s.nextLine();

        System.out.print("Enter the second number: ");
        float num2 = s.nextFloat();
        s.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");
        System.out.println("Please select an option: ");

        String option = s.nextLine();

        if (option.equals("A")) {
            float result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }

        if (option.equals("S")) {
            float result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }

        if (option.equals("M")) {
            float result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }

        if (option.equals("D")) {
            if (num2 != 0) {
                float result = num1 / num2;
                System.out.println("Error: Cannot divide by zero,");
            }
        }
    }
}
