package org.example.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer {
    public static void main(String[] args) {
        int totalSeconds = 3600;
        int elapsedSeconds = 0;

        while (elapsedSeconds < totalSeconds) {
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            System.out.println(formatter.format(now) + " - " + (elapsedSeconds + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            elapsedSeconds++;
        }
        System.out.println("");
    }
}