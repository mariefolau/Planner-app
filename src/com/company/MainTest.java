package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void userSelection(){

        // create fake input
        ByteArrayInputStream in = new ByteArrayInputStream("1\r\nend\r\n".getBytes());

        int actual = Main.UserSelection(new Scanner(in));
        assertEquals(1, actual);

    }

}