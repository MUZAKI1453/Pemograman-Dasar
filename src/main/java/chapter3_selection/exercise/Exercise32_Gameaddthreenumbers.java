package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise32_Gameaddthreenumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate three randome integers
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);

        //Prompt user to enter the sum of three integers
        System.out.print(
                "What is " + digit1 + "+" + digit2 + "+" + digit3 + "? ");
                int answer = input.nextInt();

        System.out.println(
                digit1 + "+" + digit2 + "+" + digit3 + " = " + answer + "is" +
                        (digit1 + digit2 + digit3 == answer));
    }
}
