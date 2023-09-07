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
public class CheckAge {

    // Depending on given person's age return some infomration 
    static int providedAge;
    static int age;
    // Add scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            if (age <= 0) {
                System.out.println("Please provide the positive number gerater than 0");
            } else {
                System.out.println("Please provide the Age");
            }

            while (!input.hasNextInt()) {
                String invalidInput = input.next();
                System.out.println(invalidInput + " is not a valid int. Please enter a positive int value: ");
            }

            age = input.nextInt();

        } while (age <= 0);

        if (age < 18) {
            System.out.println("You have to go to school.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You can work now and you don't have go to school if don't want to.");
        } else if (age >= 65 && age < 120) {
            System.out.println("You can retire if you want to.");
        } else if (age > 120) {
            System.out.println("You probably a vampire, so you don't have to go to school or work anyway.");
        } else {
            System.out.println("You can't retire yet.");
        }
    }
}
