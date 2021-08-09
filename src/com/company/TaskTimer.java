package com.company;

import java.util.Timer;
import java.util.TimerTask;



public class TaskTimer {
    Timer timer;

    public TaskTimer(int seconds) {
        timer = new Timer();
        timer.schedule(new TaskReminder(), seconds * 1000);
    }

    class TaskReminder extends TimerTask {
        public void run() {
            System.out.format("Task Timer Finished..!%n");
            timer.cancel(); // Terminate the timer thread
        }
    }

}
