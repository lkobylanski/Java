/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleprogrammingtasks;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author lukas
 */
public class NumberExponentiation {

    // Number and exponentiation
    static String answer;
    static int number;
    static int power;
    static double result;
    // Add scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the number you want to raise to the power:");

        while (!input.hasNextInt()) {
            String invalidInput = input.next();
            System.out.println(invalidInput + " is not a valid Int. Please enter an int value:");
            input.next(); // Clear the invalid input
        }

        number = input.nextInt();

        System.out.println("Please enter the power you want rise the number to:");

        while (!input.hasNextInt()) {
            String invalidInput = input.next();
            System.out.println(invalidInput + " is not a valid Int. Please enter an int value:");
            input.next(); // Clear the invalid input
        }
        
        power = input.nextInt();

        result = Math.pow(number, power);
        answer = String.format(
                "%s raised to the power of %s equals %s.", number,
                power, result);

        System.out.println(answer);
    }
}
