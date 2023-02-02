package org.arif.chapter3_selection.latihan;

import java.util.Scanner;

public class Listing37_Leapyear {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a yeaar: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isleapyear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result
        System.out.println(year + " is a leap year? " + isleapyear);
    }
}
