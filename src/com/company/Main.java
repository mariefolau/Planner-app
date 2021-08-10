package com.company;

import com.sun.glass.ui.Clipboard;
import com.sun.org.apache.bcel.internal.generic.Select;
import jdk.internal.util.xml.impl.Input;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.Timer;

public class Main {


    static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to your planner!");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        Scanner input = new Scanner(System.in);
        System.out.println("What is on today's agenda?");
        String agenda = input.nextLine();
        System.out.println("On today's agenda: " + agenda);


        enterToDoList();


        int Selected;
        do {
            Selected = yesOrNo();
            switch (Selected) {
                case 1:
                    System.out.println("Your tasks are now up to date");
                    break;
                case 2:
                    System.out.println("No tasks added");
                    break;
                default:
                    break;

            }

        }
        while (Selected > 2);

        Timer timer = new Timer();
        Scheduler scMain = new Scheduler();
        timer.scheduleAtFixedRate(scMain, 0, 10000);

    }

//        new TaskTimer(5000);
//        System.out.format("Task scheduled.. Now wait for 5 sec to see next message..%n");


    private static void enterToDoList() {
        System.out.println("Enter your to-do List: ");
        Scanner list = new Scanner(System.in);

        String line;
        while (!(line = list.nextLine()).equalsIgnoreCase("end")) {
            toDoList.add(line);
        }

        Collections.sort(toDoList);
        System.out.println("Task scheduled: " + toDoList);
    }




    public static int yesOrNo() {
        int Selection;
        Scanner yn = new Scanner(System.in);
        System.out.println("Do you want to add to your task?");
        System.out.println("1 - yes");
        System.out.println("2 - no");

        Selection = yn.nextInt();

        if (Selection == 1) {
            enterToDoList();

        }
        return Selection;
    }





    }





