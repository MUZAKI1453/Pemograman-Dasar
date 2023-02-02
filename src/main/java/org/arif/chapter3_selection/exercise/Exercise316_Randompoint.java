package org.arif.chapter3_selection.exercise;

public class Exercise316_Randompoint {
    public static void main(String[] args) {
        // Generate random width and height
        int width = (int) ((Math.random() * (50 + 50)) -50);

        int height = (int) ((Math.random() * (100 + 100)) -100);
        // Display coordinate
        System.out.println("Random coordinate in ractangle centered at (0,0)");
        System.out.println("with width 100 and height 200: (" + width + "," + height +")");
    }
}
