package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise319_Computetheperimeterofatriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three edges for a triangle
        System.out.println("Enter three edges for a triangle: ");
        System.out.println("Edge 1 points x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Edge 2 points x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("");
    }
}
