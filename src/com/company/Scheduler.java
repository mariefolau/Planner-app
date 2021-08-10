package com.company;

import java.util.Date;
import java.util.TimerTask;

import static com.company.Main.toDoList;

public class Scheduler extends TimerTask{

    Date current;
    int count = 0;

        @Override
        public void run() {
            current = new Date();
            System.out.println("Reminder: " + toDoList);
            count++;
            if(count == toDoList.size()){
                System.out.println("Task complete");
                System.exit(0);
            }

        }


}
