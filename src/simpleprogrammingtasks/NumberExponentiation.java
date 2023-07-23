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
    static String numberTxt;
    static String powerTxt;
    static String answer;
    static int number;
    static int power;
    static double result;
    // Add scanner object
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the number you want to raise to the power:");
        numberTxt = myScanner.nextLine();  // Read user input
        number = Integer.parseInt(numberTxt);
        
        System.out.println("Please enter the exponentiation you:");
        powerTxt = myScanner.nextLine();  // Read user input
        power = Integer.parseInt(powerTxt);
        
        result = Math.pow(number, power);
        answer = String.format(
            "%s raised to the power of %s equals %s.", number,
            power, result);
        
        System.out.println(answer);
    }
}
