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
    static String enteredNumberTxt;
    static int enteredNumber;
    // Flag for prime no.
    static boolean flag = false;
    // Add scanner object
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the number to check if it is prime:");
        enteredNumberTxt = myScanner.nextLine();
        enteredNumber = Integer.parseInt(enteredNumberTxt);

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
