package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise213_Financialapplication {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // Create a new Scanner object.
       final double MONTHLY_INTEREST_RATE = 0.00417; // initialize constant value

       // Prompt the user to enter a montly saving amount
       System.out.print("Enter the monthly saving amount: ");
       double savingamount = input.nextDouble();

       // Compute firsts month account value
       double total = 100 * (1 + MONTHLY_INTEREST_RATE);
       // Compute second month account value
       total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
       // Compute third month account value
       total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
       // Compute fourth month account value
       total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
       // Compute fifth month account value
       total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
       // Compute sixth month account value
       total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

       //Display result
       System.out.println("After the sixth month, the accont value is " + total);
   }
}
