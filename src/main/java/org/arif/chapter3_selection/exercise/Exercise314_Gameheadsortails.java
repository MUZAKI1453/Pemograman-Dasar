package org.arif.chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise314_Gameheadsortails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random integer 0 or 1
        int coin = (int)(Math.random() * 2);

        // Prompt the user to enter a guess
        System.out.print("Enter a guess 0-head or 1- tail: ");
        int guess = input.nextInt();

        // Display result
        System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess.");
    }
}
