package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void Reminder() {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is due");
            }
        };


    }
}
