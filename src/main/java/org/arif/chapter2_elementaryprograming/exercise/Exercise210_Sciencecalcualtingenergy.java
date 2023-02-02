package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise210_Sciencecalcualtingenergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create new Scanner object.

        // Prompt the user to enter the amount of water in kilograms.
        System.out.print("Enter the amount of the water in kilograms: ");
        double kilograms = input.nextDouble();
        // Prompt the user to enter the initial temperature.
        System.out.print("Enter the initial temperature");
        double initialtemperature = input.nextDouble();
        // Prompt the user to enter the final temperature.
        System.out.print("Enter the final temperaturae: ");
        double finaltemperature = input.nextDouble();

        // Calculate the energy
        double energy = kilograms * (finaltemperature - initialtemperature) * 4184;

        // Display results
        System.out.println("the energy needed is" + energy);
    }
}
