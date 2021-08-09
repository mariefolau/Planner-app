//package com.company;
//
//import javafx.concurrent.Task;
//
//import java.awt.BorderLayout;
//import javax.swing.*;
//import javax.swing.border.TitledBorder;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.util.List;
//
//public class AddFrame extends JFrame {
//    private TitledBorder title;
//    private List list;
//    private buttonPanel btnPanel;
//
//    private JButton addTask;
//    private JButton clear;
//
//    AppFrame() {
//        this.setSize(400,700);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//
//        title = new TitleBar();
//        list = new List();
//        btnPanel = new ButtonPanel();
//        this.add(title, BorderLayout.NORTH);
//        this.add(btnPanel, BorderLayout.SOUTH);
//
//        this.add(list, BorderLayout.CENTER);
//
//        addTask = btnPanel.getAddTask();
//        clear = btnPanel.getClear();
//
//        add.Listeners();
//
//    }
//
//    public void addListener() {
//        addTask.addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                Task task = new Task();
//                list.add(task);
//                list.updateNumbers();
//
//                task.getDone().addMouseListener(new MouseAdapter(){
//                    @Override
//                    public void MousePressed(MouseEvent e){
//                        task.changeState();
//                        revalidate();
//                    }
//                });
//            }
//        });
//    }
//
//}
