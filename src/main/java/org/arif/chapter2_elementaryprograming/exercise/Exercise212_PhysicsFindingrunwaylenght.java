package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise212_PhysicsFindingrunwaylenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create new Scanner object.

        // Prompt user to enter the airplane's acceleration a and take-off spead v.
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double accelartion = input.nextDouble();

        // Compute the minimum runway lenght
        // needed for an airplane to take off.
        double lenght = Math.pow(speed, 2) / (2 * accelartion);

        // Display results
        System.out.println("The minimum runway lenght for this" + "airplane is " + lenght);
    }
}
