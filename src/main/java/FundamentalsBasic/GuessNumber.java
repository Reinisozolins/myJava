package FundamentalsBasic;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Create a program that will guess the number (0..100)
        // E.g. if you make number 5, the program should ask,
        // whether your number is greater than 50 or not,
        // subsequently reducing the possible number scope until
        // the only possible result is found. At this point program
        // should ask, whether it is your number or not.
        // User should answer with Y as yes and N as no.
        //
        // Hints and examples:
        // Initiate console reader:         new Scanner(System.in)
        // Read number from console:        Scanner.next()
        // algorithm - Binary search
        // Rounding (regular) - (int) Math.round(...)
        // Rounding (upper) - (int) Math.ceil(...)
        // Rounding (lower) - (int) Math.floor(...)

        int minBoundary = 0;
        int maxBoundary = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imagine one number from 1 to 100 and let me try guess it.");
        System.out.println("If yes put [Y] \n If no put [N] \n");
        int step = 0;

        while (true) {
            if (minBoundary > maxBoundary) {
                System.out.println("Something went wrong, minBoundary[" + minBoundary + "] > maxBoundary[" + maxBoundary + "]");
                break;
            }
            if (++step > 8) {
                System.out.println("Something went wrong, step count > 8");
                break;
            }
            if (minBoundary == maxBoundary) {
                System.out.println("Your number is " + minBoundary);
                break;
            } else {
                @SuppressWarnings("IntegerDivisionInFloatingPointContext")
                int half = (int) Math.floor((maxBoundary + minBoundary) / 2);

                System.out.println("[DEBUG]    " + minBoundary + " - " + maxBoundary);

                if (half >= minBoundary) {
                    System.out.println("Is your number greater than " + half + "?");
                    if (scanner.next().toLowerCase().equals("y")) {
                        if (minBoundary == half) {
                            System.out.println("Your number is " + (half + 1));
                            break;
                        }
                        minBoundary = half;
                    } else {
                        if (minBoundary == half) {
                            maxBoundary = minBoundary;
                            continue;
                        }
                        if (maxBoundary == half) {
                            System.out.println("Your number is " + maxBoundary);
                            break;
                        }
                        maxBoundary = half;
                    }
                } else {
                    System.out.println("Is your number less than " + half + "?");

                    if (scanner.next().toLowerCase().equals("y")) {
                        if (maxBoundary == half) {
                            System.out.println("Your number is " + minBoundary);
                            break;
                        }
                        maxBoundary = half;
                    } else {
                        if (maxBoundary == half) {
                            System.out.println("Your number is " + maxBoundary);
                            break;
                        }
                        minBoundary = half;
                    }
                }
            }
        }
    }
}
