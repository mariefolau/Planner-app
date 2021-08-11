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


        enterToDoList(input);


        int Selected;
        do {
            Selected = UserSelection(new Scanner(System.in));
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
        Reminder scMain = new Reminder();
        timer.scheduleAtFixedRate(scMain, 0, 10000);


    }


    private static void enterToDoList(Scanner list) {
        System.out.println("Enter your to-do list and print 'end' at end of tasks list");

        String line;
        while (!(line = list.nextLine()).equalsIgnoreCase("end")) {
            toDoList.add(line);
        }

        Collections.sort(toDoList);
        System.out.println("Task scheduled: " + toDoList);
    }




    public static int UserSelection(Scanner yn) {
        int selection;
        System.out.println("Do you want to add to your task?");
        System.out.println("1 - yes");
        System.out.println("2 - no");

        selection = yn.nextInt();

        if (selection == 1) {
            enterToDoList(yn);

        }else if(selection != 1 && selection != 2){
            System.out.println("Invalid input. Please try again.");
        }
        return selection;
    }





    }





