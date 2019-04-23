package easyTask;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    // Create a program to convert Celsius degrees to Fahrenheit degrees.
    // Data should be pre-filled in variable.
    //
    // Hints and examples:
    // F = (°C × 9/5) + 32
    // 10°C  = 50F
    // 11°C  = 51.8F
    // 100°C = 212F

    public static void main(String[] args) {

        Scanner scanner =new Scanner (System.in);

        System.out.println("How much is temperature in Celsius degrees?");
         double Ctemp = scanner.nextDouble();
         double Ftemp;

         Ftemp = (Ctemp * 9/5)+32;

        System.out.println(Ctemp+ " Celsius degrees is "+Ftemp+" Fahrenheit degrees " );

    }





}
