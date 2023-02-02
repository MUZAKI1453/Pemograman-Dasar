package org.arif.chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise310_Gameadditionquiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate tow integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // Prompt the user to enter an answer
        System.out.print(
                "What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        // Display results
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("you are wrong " + number1 + "+" + number2
            + " should be " + (number1 + number2));
    }
}
