package com.pluralsight;
import java.util.*;

public class BasicCalculator {
public static void  main(String[] args) {
    Scanner s = new Scanner(System.in);

    //Enter first number

    System.out.print("What is your first number? ");
    float firstNumber = s.nextFloat();
    s.nextLine();

    //Enter second number

    System.out.print("What is your second number? ");
    float secondNumber = s.nextFloat();
    s.nextLine();

    //Possible Calculations
    System.out.println("Possible calculations:");
    System.out.println("(A)dd");
    System.out.println("(S)ubtract");
    System.out.println("(M)ultiply");
    System.out.println("(D)ivide");

    //Users Choice

    System.out.print("Please select an option: ");
    char option = s.next().toUpperCase().charAt(0);

    //Perform calc based on user's choice

    switch (option) {
        case 'A':
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            break;

        case 'S':
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            break;

        case 'M':
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
            break;

        case 'D':
            if (secondNumber != 0) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / (double)secondNumber));
        } else {
            System.out.println("Cannot divide by zero.");
        }
        break;

        default:
            System.out.println("Invalid option Selected.");

    }
  }
}
