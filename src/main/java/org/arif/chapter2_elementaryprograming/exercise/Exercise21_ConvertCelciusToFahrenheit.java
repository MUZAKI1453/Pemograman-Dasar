package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise21_ConvertCelciusToFahrenheit {
    public static void main(String[] args) {
        // Crate new Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user to input a double
        System.out.print("Enter a degree in Celcius: ");
        double celcius = input.nextDouble();

        //Convert Celcius to Fahrenheit
        double fahrenheit = 9.0 / 5 * celcius + 32;

        //Display results
        System.out.println(celcius + " Celcius is " + fahrenheit
                + " Fahrenheit");
    }
}
