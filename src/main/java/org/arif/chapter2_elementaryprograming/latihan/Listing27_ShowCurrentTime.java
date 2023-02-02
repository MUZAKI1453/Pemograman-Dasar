package org.arif.chapter2_elementaryprograming.latihan;

public class Listing27_ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight,jan 1,1970
        long totalseconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentsecond = totalseconds % 60;

        // Obtain the total minutes
        long totalminutes = totalseconds / 60;

        // Compute the current minute in the hour
        long currentminute = totalminutes % 60;

        // Obtain the total hours
        long totalhours = totalminutes / 60;

        // Compute the current hour
        long currenthour = totalhours % 24;

        //Display results
        System.out.println("Current time is " + currenthour + ";"
           + currentminute + ";" + currentsecond + " GMT");
    }
}
