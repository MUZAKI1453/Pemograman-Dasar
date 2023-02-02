package org.arif.chapter2_elementaryprograming.latihan;

import java.util.Scanner;

public class Listing24_ComputeAreaWithCostant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant

        // Crate a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * PI;

        // Display result
        System.out.println("The area for the circle of radius " +
          radius + " is " + area);
    }
}
