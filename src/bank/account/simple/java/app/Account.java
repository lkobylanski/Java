/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.account.simple.java.app;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author lukas
 */
public class Account {

    static Scanner input = new Scanner(System.in);

    private double balance = 0.0;
    private int pin;

    public Account(int pin) {
        this.pin = pin;
        System.out.println("New account creatred. Your account balance equals: " + this.balance);
    }

    private void deposit(double amount, int pin) {
        if (this.pin == pin) {
            double userInputInt;

            try {
                userInputInt = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("\tInvalid input type (must be an double)");
                userInputInt = input.nextDouble(); // Clear invalid input from scanner buffer.
            }

            if (amount <= 0) {
                System.out.println("The number cannot be negative or 0");
            } else {
                this.balance = amount;
                System.out.println("Your input: " + this.balance);
            }

            System.out.println("Your account balance equals: " + this.balance);
        } else {
            System.out.println("Wrong pin!");
        }
    }

    public static void main(String[] args) {

        int newPin;
        boolean isValid = false;
        String takeAction;

        do {
            System.out.print("Set your PIN. Enter a positive integer with exactly 4 digits: ");
            // !input.hasNextInt() juz nam zczytuje dane od uzytkownika i jeżeli nie token ze skanera nie będzie mógłbyć zinterpretowany jako int
            // to uruchomi się kod z while - next(); przyjmie dowolny token (invalidInput), a nastepnie poinformuje, ze nie jest to liczba i ponownie bedzie można zczytać input użytkownika
            while (!input.hasNextInt()) {
                String invalidInput = input.next();
                System.out.println(invalidInput + " is not a valid integer. Please enter a positive integer.");
            }

            // Gdy weryfikacja z pętli while przejdzie pomyślnie, to zapisujemy input (token) wprowadzony przez usera do zmiennej
            newPin = input.nextInt();

            if (String.valueOf(newPin).length() == 4 && newPin >= 0) {
                isValid = true;
            } else {
                System.out.println("The number must be a positive integer with exactly 4 digits. Please try again.");
            }
        } while (!isValid);

        Account myAcc = new Account(newPin);

        boolean stopProgram = false;

        do {
            System.out.println(" ");
            System.out.println("Do you want to deposit, withdraw or check account balance?");
            System.out.println("For deposit emter D, for withdraw enter W, for balance enter B. If you want to close the program enter Q");
            
            takeAction = input.next();

            switch (takeAction) {
                case "D":
                case "d":
                    System.out.println("to be adde isntructions for: D");
                    break;
                case "W":
                case "w":
                    System.out.println("to be adde isntructions for: W");
                    break;
                case "B":
                case "b":
                    System.out.println("to be adde isntructions for: B");
                    break;
                case "Q":
                case "q":
                    stopProgram = true;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Error: Please enter proper instruction");

            }
        } while (!stopProgram);
    }
}
