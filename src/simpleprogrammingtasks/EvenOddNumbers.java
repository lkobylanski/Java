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
public class EvenOddNumbers {

    //
    static String numberTxt;
    static String evenOrOdd;
    static StringBuilder answer = new StringBuilder();
    static int number;
    // Add scanner object
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter any number higher than 1 up to 1000. Program will display all even or odd numbers in this range.");
        numberTxt = myScanner.nextLine();
        number = Integer.parseInt(numberTxt);
        if (number < 1 || number > 1000) {
            System.out.println("Wrong number. Entered number in not in range between 1 and 1000.");
        } else {
            System.out.println("Please enter if you want to find all even or odd numbers. Type even or odd");
            evenOrOdd = myScanner.nextLine();
            if (evenOrOdd.equalsIgnoreCase("even")) {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        answer.append(" " + i);
                    }
                }
                System.out.println("Even numbers in range from 1 to " + number + " are: " + answer);
            } else {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 != 0) {
                        answer.append(" " + i);
                    }
                }
                System.out.println("Odd numbers in range from 1 to " + number + " are: " + answer);
            }

        }
    }
}
