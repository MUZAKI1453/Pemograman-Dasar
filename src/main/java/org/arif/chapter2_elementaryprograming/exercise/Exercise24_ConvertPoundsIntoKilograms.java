package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise24_ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create new Scanner object.

        //Prompt the user to enter the subtotal and the gravity rate

        System.out.print("Enter the subtotal and a gravity rate: ");

        double subtotal = input.nextDouble();
        double gratuityrRate = input.nextDouble();

        //Calculate gratuity and total
        double gratuity = subtotal * (gratuityrRate / 100);
        double total = subtotal + gratuity;

        //Display results
        System.out.println("The gratuity is $" + gratuity +
                "and total is $" + total);
    }
}
