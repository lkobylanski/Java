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
public class BankAccount {

    static Scanner input = new Scanner(System.in);

    private double balance = 0.0;
    private int pin;

    public BankAccount(int pin) {
        this.pin = pin;
        System.out.println("New account creatred. Your account balance equals: " + this.balance);
    }

    private void deposit(int pin) {
        if (this.pin == pin) {

            boolean isValid = false;

            do {
                System.out.print("Enter the amount money you want to deposit. Please note only positive double value greater than 0 is accepted: ");

                while (!input.hasNextDouble()) {
                    String invalidInput = input.next();
                    System.out.println(invalidInput + " is not a valid double. Please enter a positive double value: ");
                }

                double amount = input.nextDouble();

                if (amount > 0) {
                    this.balance += amount;
                    System.out.println(" ");
                    System.out.println(String.format("Congratulations you have deposit %s. Your account balance is now: %s", amount, this.balance));
                    isValid = true;
                } else {
                    System.out.println("The number must be a positive double. Please try again.");
                }
            } while (!isValid);
        } else {
            System.out.println("Wrong pin!");
        }
    }

    private void withdraw(int pin) {
        if (this.pin == pin) {

            boolean isValid = false;

            do {
                System.out.print("Enter the amount money you want to withdraw. Please note only positive double value greater than 0 is accepted: ");

                while (!input.hasNextDouble()) {
                    String invalidInput = input.next();
                    System.out.println(invalidInput + " is not a valid double. Please enter a positive double value: ");
                }

                double amount = input.nextDouble();

                if (amount > 0) {
                    this.balance -= amount;
                    System.out.println(" ");
                    System.out.println(String.format("Congratulations you have withdraw %s. Your account balance is now: %s", amount, this.balance));
                    isValid = true;
                } else {
                    System.out.println("The number must be a positive double. Please try again.");
                }
            } while (!isValid);
        } else {
            System.out.println(" ");
            System.out.println("Wrong pin!");
        }
    }

    private double getAccBalance(int pin) {
        if (this.pin == pin) {
            return this.balance;
        }
        throw new IllegalArgumentException("Incorrect PIN");
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

        BankAccount myAcc = new BankAccount(newPin);

        boolean stopProgram = false;

        do {
            int providedPin;

            System.out.println(" ");
            System.out.println("Do you want to deposit, withdraw or check account balance?");
            System.out.println("For deposit enter D, for withdraw enter W, for balance enter B. If you want to close the program enter Q");

            takeAction = input.next();

            switch (takeAction) {
                case "D":
                case "d":
                    System.out.println("Please provide you PIN to access the account: ");

                    while (!input.hasNextInt()) {
                        String invalidInput = input.next();
                        System.out.println(invalidInput + " is not a valid PIN. Please try again: ");
                    }

                    providedPin = input.nextInt();

                    myAcc.deposit(providedPin);
                    break;
                case "W":
                case "w":
                    System.out.println("Please provide you PIN to access the account: ");

                    while (!input.hasNextInt()) {
                        String invalidInput = input.next();
                        System.out.println(invalidInput + " is not a valid PIN. Please try again: ");
                    }

                    providedPin = input.nextInt();

                    myAcc.withdraw(providedPin);
                    break;
                case "B":
                case "b":
                    System.out.println("Please provide you PIN to access the account: ");
                    
                    while (!input.hasNextInt()) {
                        String invalidInput = input.next();
                        System.out.println(invalidInput + " is not a valid PIN. Please try again: ");
                    }
                    
                    providedPin = input.nextInt();
                    
                    double yourBalance = myAcc.getAccBalance(providedPin);
                    
                    System.out.println(" ");
                    System.out.println(String.format("Your account balance is: %s", yourBalance));                   
                    break;
                case "Q":
                case "q":
                    stopProgram = true;                  
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Error: Please enter proper instruction: D - for deposit, W - for withdraw, B - for account balance or Q to quit program");

            }
        } while (!stopProgram);
    }
}
