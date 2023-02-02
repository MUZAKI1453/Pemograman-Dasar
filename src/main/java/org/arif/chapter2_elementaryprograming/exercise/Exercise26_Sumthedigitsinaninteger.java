package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise26_Sumthedigitsinaninteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create new Scanner object

        //prompt the user to enter a number between 0 and 1000.
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        //Compute the sum of the digits in the integer.
        int lessthan10 = number % 10;
        //Extract the digit less than 10
        number /=10;
        //Remove the extracted digit
        int tens = number % 10;
        //Remove the extracted digit
        int hundreads = number % 10;
        // between 100 to 999
        number /= 10;
        //Remove the extraced digit
                     int sum = hundreads + tens + lessthan10;

        //Display results
        System.out.println("The sum of the digits is " + sum);
    }
}
