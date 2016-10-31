/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stick21game;

import java.util.Scanner;

/**
 *
 * @author Phantom
 */
public class Stick21Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner take = new Scanner(System.in);
        int ulang = 1;
        do {
            System.out.println("|| 21 STICK ||");
            System.out.println("How to play:");
            System.out.print("there is 21 stick,\nevery turn player/AI choose to pick");
            System.out.println(" 1 or 2 stick, the last one that pick the stick lose");
            System.out.println("   Game start!!...");
            String goFirst;

            String ulangCount;

            do {
                System.out.print(" do you want to go first?(Y/N):");
                goFirst = input.nextLine();
                if (!goFirst.equals("Y") && !goFirst.equals("y") && !goFirst.equals("n") && !goFirst.equals("N")) {
                    System.out.println("  error!!!");
                }
            } while (!goFirst.equals("Y") && !goFirst.equals("y") && !goFirst.equals("n") && !goFirst.equals("N"));
            int numStick = 21;
            if (goFirst.equals("y") || goFirst.equals("Y")) {
                System.out.println("Player go first");
            } else {
                System.out.println("AI go first");
            }
            String numToTake;

            while (numStick > 0) {
                if (goFirst.equals("y") || goFirst.equals("Y")) {
                    System.out.println("\nThere are " + numStick + " stick left");
                    do {
                        System.out.print("how many stick do you want to take? (1/2)? :");
                        numToTake = take.nextLine();
                        if (!numToTake.equals("1") && !numToTake.equals("2")) {
                            System.out.println("  error!!!");
                        }
                    } while (!numToTake.equals("1") && !numToTake.equals("2"));
                    int x = Integer.parseInt(numToTake);
                    System.out.println("you take " + x + " stick");
                    numStick = numStick - x;
                    if (numStick <= 0) {
                        System.out.println("Too bad,you lose");
                    } else {
                        if ((numStick - 2) % 3 == 0 || numStick - 2 == 0) {
                            x = 1;
                        } else {
                            x = 2;
                        }
                        System.out.println("AI take " + x + " Stick");
                        numStick = numStick - x;
                        if (numStick <= 0) {
                            System.out.println("Congrats,you win!!!");
                        }
                    }
                } else {
                    System.out.println("\n There are " + numStick + " stick left");
                    int x;

                    if ((numStick - 2) % 3 == 0 || numStick - 2 == 0) {
                        x = 1;
                    } else {
                        x = 2;
                    }
                    System.out.println("AI take " + x + " Stick");
                    numStick = numStick - x;
                    if (numStick <= 0) {
                        System.out.println("Congrats,you win!!!");
                    } else {
                        do {
                            System.out.print("how many stick do you want to take? (1/2)? :");
                            numToTake = take.nextLine();
                            if (!numToTake.equals("1") && !numToTake.equals("2")) {
                                System.out.println("  error!!!");
                            }
                        } while (!numToTake.equals("1") && !numToTake.equals("2"));
                        x = Integer.parseInt(numToTake);
                        System.out.println("you take " + x + " stick");
                        numStick = numStick - x;
                        if (numStick <= 0) {
                            System.out.println("Too bad,you lose");
                        }
                    }

                }

            }
            do {
                System.out.print("Play again? (Y/N):");
                ulangCount = input.nextLine();
                if (!ulangCount.equals("Y") && !ulangCount.equals("y") && !ulangCount.equals("n") && !ulangCount.equals("N")) {
                    System.out.println("  error!!!");
                }
            } while (!ulangCount.equals("Y") && !ulangCount.equals("y") && !ulangCount.equals("n") && !ulangCount.equals("N"));
            if (ulangCount.equals("Y") || ulangCount.equals("y")) {
                ulang = 1;
            } else {
                ulang = 2;
            }

        } while (ulang == 1);
        System.out.println("Thanks for playing!!!...");
    }

}
