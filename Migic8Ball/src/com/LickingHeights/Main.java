package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        int number;
        String question;

        //initialize
        keyboard = new Scanner(System.in);

        System.out.println("What is your question?");
        question = keyboard.nextLine();
        System.out.println("choose a number between 1 and 100");
        number = keyboard.nextInt();



    }
}
