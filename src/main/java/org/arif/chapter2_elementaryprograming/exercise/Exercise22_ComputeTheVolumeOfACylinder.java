package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise22_ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265359;

        //Prompt user to enter the radius and lenght of a cylinder
        System.out.print("Enter the radius and lenght of a cylinder: ");

        double radius = input.nextDouble();
        double lenght = input.nextDouble();

        // Comput the area and volume
        double area = radius * radius * PI;
        double volume = area * lenght;

        //Display results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
