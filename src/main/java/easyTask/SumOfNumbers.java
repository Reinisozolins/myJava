package easyTask;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Create a program that will sum all digits in an entered number.
        // Numbers should be in 0..999 range.
        // Data must be read from console input.
        //
        // Hints and examples:
        // Remember, that number 123 is 1*100 + 2*10 + 3
        // Initiate console reader:         new Scanner(System.in)
        // Read number from console:        Scanner.nextInt()
        // 123 = 6
        // 111 = 3
        //  12 = 3

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        int firstDigit = (number - number % 100) / 100;
        int secondDigit = (number - firstDigit * 100) / 10;
        int thirdDigit = (number - firstDigit * 100 - secondDigit * 10);
        int result = firstDigit + secondDigit + thirdDigit;

        System.out.println("Sum of all digits is " +result);


        //// Fastest way - get all digits and sum them up
        // It is much better way, but its not how I solve this task.

        //String numberString = "" + number;
        //int result = 0;
        //for (int i = 0; i < numberString.length(); i++) {
        //	result += Integer.parseInt("" + numberString.toCharArray()[i]);
        //}





    }

}
