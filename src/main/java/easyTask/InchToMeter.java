package easyTask;

import java.util.Scanner;

public class InchToMeter {

    // Create a program that will convert inches to meters.
    // Data must be read from console input.
    //
    // Hints and examples:
    // Initiate console reader:         new Scanner(System.in)
    // Read number from console:        Scanner.nextInt()
    // 1 inch = 0.0254 meters
    // 10in   = 0.254 m
    // 100in   = 22.54 m

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How much inches you want convert in meters");
        int inches = sc.nextInt();
        double meters = inches*0.0254;

        System.out.println(inches+" inches is " +meters+ " meters.");
    }

}
