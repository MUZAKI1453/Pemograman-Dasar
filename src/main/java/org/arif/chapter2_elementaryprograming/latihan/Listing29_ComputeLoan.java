package org.arif.chapter2_elementaryprograming.latihan;

import java.util.Scanner;

public class Listing29_ComputeLoan {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate in percentage, e.g., 7.25
        System.out.print("Enter annual interest rate, e.g., 7,25: ");
        double annualInterestRate = input.nextDouble();

        //Obtain monthly interest rate
        double monthlyinterestRate = annualInterestRate / 1200;

        //Enter number of years
        System.out.print(
                "Enter number of years as an integer, e.g.,5: ");
        int numberOfyears = input.nextInt();

        //Enter loan amount
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        //Calculate payment
        double mothlypayment = loanAmount * monthlyinterestRate / (1
        - 1 / Math.pow(1 + monthlyinterestRate, numberOfyears * 12));
        double totalpayment = mothlypayment * numberOfyears * 12;

        //Display results
        System.out.println("tHE Monthly payment is $" +
                (int)(mothlypayment * 100) / 100.0);
        System.out.println("The total payment is $" +
                (int)(totalpayment * 100) / 100.0);
    }
}
