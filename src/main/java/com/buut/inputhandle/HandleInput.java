package com.buut.inputhandle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandleInput {

    public String getUserInput(){

        System.out.println("User input:");

        String userInput = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(

                    new InputStreamReader(System.in));

            userInput = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(userInput);

       return userInput;

    }

    }


