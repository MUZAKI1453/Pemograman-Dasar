package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise211_Populationprojection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Prompt the user to the number of years
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate population projection
        int popilation = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);

        // Display the results
        System.out.println("The poppulation in " + years + " is " + popilation);
    }
}
