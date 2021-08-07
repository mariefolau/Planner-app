package com.company;

import jdk.internal.util.xml.impl.Input;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to your planner!");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        Scanner input = new Scanner(System.in);

        System.out.println("What is on today's agenda?");
        String agenda = input.nextLine();
        System.out.println("On today's agenda: " + agenda);


        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task complete");
            }
        };
        Timer timer = new Timer();

        timer.schedule(task, );




    }
}
