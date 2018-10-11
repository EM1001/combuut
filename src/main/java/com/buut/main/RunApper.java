package com.buut.main;

import com.buut.inputhandle.HandleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunApper {

    public RunApper(){


        HandleInput handleInput = new HandleInput();
        while(true) {

            handleInput.getUserInput();

            String userInput = "";


            if (userInput.equals("exit")){

               // exits the loop
                return;
            }

        }

    }
}
