package com.pluralsight;
import java.util.*;

public class PayrollCalculator {

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    //Get Employees name
    System.out.print("What is your name? ");
    String name = s.nextLine();

    //Get how many hours they worked
    System.out.print("How many hours did you work this week? ");
    float numbersOfHoursWorked = s.nextFloat();
    s.nextLine();

    //Get employees pay rate
    System.out.print("What do you get paid hourly? ");
    float hourlyPayRate = s.nextFloat();
    s.nextLine();

    //Calculate gross pay
    float grossPay = numbersOfHoursWorked * hourlyPayRate;

    //Overtime (optional)
    if (numbersOfHoursWorked > 40) {
        float regularHours = 40;
        float overtimeHours = numbersOfHoursWorked - regularHours;
        grossPay = (regularHours * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5f);
    } else {
        grossPay = numbersOfHoursWorked * hourlyPayRate;
    }

    //Say their gross pay
    System.out.printf("Employee Name: %s\n", name);
    System.out.printf("Gross pay: $%.2f\n", grossPay);



    }
}
