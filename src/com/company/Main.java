package com.company;

import com.sun.glass.ui.Clipboard;
import com.sun.org.apache.bcel.internal.generic.Select;
import jdk.internal.util.xml.impl.Input;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {

    private static Clipboard toDoList;

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
        while (!(line = input.nextLine()).equalsIgnoreCase("end")) {
            toDoList.add(line);
        }

        Collections.sort(toDoList);
        System.out.println(toDoList);

        int Selected;
        do {
            Selected = yesOrNo();
            switch (Selected) {
                case 1:
                    System.out.println("Option 1 selected. Please add to your task");
                    break;
                case 2:
                    System.out.println("Please continue ahead.");
                    break;
                default:
                    break;
            }
        }
        while (Selected > 2);
    }

    public static int yesOrNo() {
        int Selection;
        Scanner yn = new Scanner(System.in);
        System.out.println("Do you want to add to your task?");
        System.out.println("1 - yes");
        System.out.println("2 - no");

        Selection = yn.nextInt();

        if (Selection == 1) {
            
        } else {

        }
        return Selection;

    }
}








       // TimerTask task = new TimerTask() {
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







