package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;
import java.util.ArrayList;

public class SecureGuessHandler {
    int randomChoice;

    public SecureGuessHandler(int min, int max) {
        randomChoice = (int)(Math.random() * (max - min + 1) + 1);
    }

    public ArrayList<Integer> playGuessingGame() {
        ArrayList<Integer> guesses = new ArrayList<Integer>();

        Scanner reader = new Scanner(System.in);
        int guessNumber = -1;

        do {
            String guess = requestGuess(reader);

            try {
                guessNumber = handleGuess(guess);
                guesses.add(guessNumber);
            } catch(NumberFormatException e) {
                System.out.println("The input provided was not an integer, try again");
            }
        }
        while(guessNumber != randomChoice);

        System.out.println(guessNumber + " is the correct guess! You win!");
        reader.close();

        return guesses;
    }

    public String requestGuess(Scanner reader) {
        System.out.println("Enter a integer guess: ");
        return reader.next();
    }

    public int handleGuess(String guess) throws NumberFormatException {
        int num;
        num = Integer.parseInt(guess);

        return num;
    }

    public static void outputGuesses(ArrayList<Integer> guesses) {
        System.out.println("Your guesses were: ");

        for(int guess : guesses) {
            System.out.print(guess + " ");
        }
    }
}
