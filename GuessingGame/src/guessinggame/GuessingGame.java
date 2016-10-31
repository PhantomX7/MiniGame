package guessinggame;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author PhantomX7
 */
public class GuessingGame {

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner input = new Scanner(System.in);
        
        int ulang = 0;
        do {
            int numToGuess = rand.nextInt(1000);
            int tries = 0;
            int guess, win = 0, score = 0;
            int mode;
            do {
                showMenu();
                mode = input.nextInt();
                if (mode == 1) {
                    tries = 15;
                } else if (mode == 2) {
                    tries = 12;
                } else if (mode == 3) {
                    tries = 8;
                } else {
                    System.out.println(" error!!");
                }

            } while (mode != 1 && mode != 2 && mode != 3);
            do {
                System.out.print("Guess between 0-1000" + "(" + tries + " try left):");
                guess = input.nextInt();
                if (guess > numToGuess && guess < 1001) {
                    System.out.println("Your number is bigger than the guess number");
                    tries--;
                    score++;
                } else if (guess < numToGuess && guess > -1) {
                    System.out.println("Your number is smaller than the guess number");
                    tries--;
                    score++;
                } else if (guess == numToGuess) {
                    System.out.println("Congrats, you guess it right");
                    win = 1;
                } else if (guess > 1000 || guess < 0) {
                    System.out.println("Please input number from 0-1000");
                }
                if (tries == 0) {
                    System.out.println("Game over!!\n You Lose");
                    win = 1;
                }

            } while (win == 0);
            System.out.println("Number of tries=" + score);
            do {
                System.out.print("play again?(1=yes 2=no):");
                ulang = input.nextInt();
                if (ulang == 1) {
                    ulang = 1;
                } else if (ulang == 2) {
                    ulang = 2;
                } else {
                    System.out.println(" error!!!");
                }
            } while (ulang != 1 && ulang != 2);

        } while (ulang == 1);
    }

    public static void showMenu() {
        System.out.println("Please choose a difficulty:");
        System.out.println("1.easy(15 try)");
        System.out.println("2.normal(12 try)");
        System.out.println("3.hard{8 try)");
        System.out.print("Choose your difficulty:");
    }

}
