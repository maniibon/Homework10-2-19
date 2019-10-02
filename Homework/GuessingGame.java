package Homework;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random ();
        Scanner scanner = new Scanner ( System.in );
        ArrayList<Integer> guesses = new ArrayList<> ();
        int counter = 0;
        int number = random.nextInt ( 100 );
        int guess = -1;

        while (guess != number) {
            System.out.print ( "Enter your guess: " );
            guess = scanner.nextInt ();

            if (guess < number) {
                if (!guesses.contains ( guess )) {
                    guesses.add(guess);
                }
                System.out.println ( "Too low, please try again" );
            } else if (guess > number) {
                if (!guesses.contains ( guess )) {
                    guesses.add(guess);
                }
                System.out.println ( "Too high, please try again" );
            } else {
                System.out.println ( "Correct, the number was " + number );
                System.out.println ("you've made this many unique wrong guesses: " + guesses.size ());
            }
        }
    }
}

