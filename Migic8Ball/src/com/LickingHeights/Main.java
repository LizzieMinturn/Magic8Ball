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

        if(number<=10){
            System.out.println(" It is more than likely");
        }
        else if(number<=20){
            System.out.println("Probably not");
        }
        else if(number<=30){
            System.out.println("I love it!");
        }
        else if(number<=40){
            System.out.println("Sorry, no");
        }
        else if(number<=50){
            System.out.println("Yes, duh!");
        }
        else if(number<=60){
            System.out.println("I don't know yet");
        }
        else if(number<=70){
            System.out.println("Without a doubt");
        }
        else if(number<=80){
            System.out.println("It is not likely");
        }
        else if(number<=90){
            System.out.println("Yes, you're the man!");
        }
        else if(number<=100){
            System.out.println("That is not smart");
        }

    }
}
