package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class GuessHandler {
    int randomChoice;
    boolean incorrectGuess;

    public GuessHandler() {
        randomChoice = (int)(Math.random() * (100) + 1);

        incorrectGuess = true;
    }

    public void playGuessingGame() {
        Scanner reader = new Scanner(System.in);

        while(incorrectGuess) {
            System.out.println("Enter a integer guess: ");
            String guess = reader.next();

            incorrectGuess = handleGuess(guess);
        }

        reader.close();
    }

    public boolean handleGuess(String guess) {
        int num = Integer.parseInt(guess);

        if(num == randomChoice) {
            System.out.println(num + " is the correct guess! You win!");
            return false;
        }

        return true;
    }
}
