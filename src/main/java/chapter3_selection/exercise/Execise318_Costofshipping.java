package chapter3_selection.exercise;

import java.util.Scanner;

public class Execise318_Costofshipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight of the package
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        // Calculate cost of shipping
        if (weight > 50)
            System.out.println("The package cannot be shipped.");
        else {
            double costperpound;
            if (weight > 0 && weight <= 1)
                costperpound = 3.5;
            else if (weight <= 3)
                costperpound = 5.5;
            else if (weight <= 10)
                costperpound = 8.5;
            else //if (wight <= 20)
                costperpound = 10.5;
            System.out.println("shipping cost of package is $" + costperpound * weight);
        }
    }
}
