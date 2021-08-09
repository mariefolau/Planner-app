package com.company;

import jdk.internal.util.xml.impl.Input;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to your planner!");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        Scanner input = new Scanner(System.in);
        System.out.println("What is on today's agenda?");
        String agenda = input.nextLine();
        System.out.println("On today's agenda: " + agenda);

        ArrayList<String> toDoList = new ArrayList<>();
        System.out.println("Enter your to-do List: ");
        Scanner list = new Scanner(System.in);

        String line;
        while(!(line = input.nextLine()).equals("end")){
            toDoList.add(line);
        }

        Collections.sort(toDoList);
        System.out.println(toDoList);
    }


//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("Task complete");
//            }
//        };
//        Timer timer = new Timer();
//
//        timer.schedule(task, 1000);
//
//        timer.cancel();


}




