package chapter3_selection.exercise;

import java.util.Scanner;

public class Execise37_Financialapplicationmonetaryunits {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56:");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find the number of quarters in the remaining amount
        int numberOfquarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number of dimes in the remaining amount
        int numbersOfDimes = remainingAmount / 10;

        // Find the number of nickles in the remaining amount
        int numberOfNickles = remainingAmount / 5;

        // Find the number of pennies in the remaining amount
        int numberOfpennies = remainingAmount;

        // Display results
        System.out.println("Your amount" + amount + " consists of");
        System.out.println("" + numberOfDollars + (numberOfDollars== 1 ? " dollar" : " dollars"));
        System.out.println("" + numberOfquarters + (numberOfquarters == 1 ? " quarter" :" quarters"));
        System.out.println("" + numbersOfDimes + (numbersOfDimes == 1 ? " dime" :" nickels"));
        System.out.println("" + numberOfNickles + (numberOfNickles == 1 ? " nickel" : " nickels"));
        System.out.println("" + numberOfpennies + (numberOfpennies == 1 ? " pennie" : " pennies"));
    }
}
