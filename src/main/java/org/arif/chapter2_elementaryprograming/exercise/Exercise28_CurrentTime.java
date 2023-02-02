package org.arif.chapter2_elementaryprograming.exercise;

import java.util.Scanner;

public class Exercise28_CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create new Scanner object

        // Prompt user to enter the time offset of GMT
        System.out.print("Enter the time zone offset to GMT" +
                ";");
        int offset = input.nextInt();

        // Obtain the total milliseconds since midnight,jan1,1970
        long totalmilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, jan 1,1970
        long totalseconds = totalmilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentsecond = totalseconds % 60;

        // Obtain the total minutes
        long totalminutes = totalseconds / 60;

        // Compute the current minute in the hour
        long currentminute = totalminutes % 60;

        // Obtain the totalhours
        long totalhours = totalminutes / 60;

        //Compute the current hour
        long currenthour = totalhours % 24;
        currenthour = currenthour + offset;

        //Display results
        System.out.println("Current time is " + currenthour +
                ";"
                + currentminute + ":" + currentsecond);
    }
}
