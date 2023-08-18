/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleprogrammingtasks;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class PrimeNumber {

    // User's input data
    static int enteredNumber;
    // Flag for prime no.
    static boolean flag = false;
    // Add scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Please enter the number to check if it is prime (positive number greater than 1):");

            while (!input.hasNextInt()) {
                String invalidInput = input.next();
                System.out.println(invalidInput + " is not a valid Int. Please enter an int value:");
            }

            enteredNumber = input.nextInt();

        } while (enteredNumber <= 1);

        for (int i = 2; i < enteredNumber; i++) {
            // condition for nonprime number
            if (enteredNumber % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(enteredNumber + " is a prime number.");
        } else {
            System.out.println(enteredNumber + " is not a prime number.");
        }
    }
}
