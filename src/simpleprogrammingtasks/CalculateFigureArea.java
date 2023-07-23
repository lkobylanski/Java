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
public class CalculateFigureArea {

    // Number and exponentiation
    static String figureType;
    static String sideATxt;
    static String sideBTxt;
    static String calculateAgain;
    static int sideA;
    static int sideB;
    static double result;
    // Add scanner object
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println(
                    "Select whether you want to calculate the area of a triangle or square (rectangle). For triangle type T for square or rectangle type S. To quit press Q."
            );
            figureType = myScanner.nextLine();  // Read user input

            switch (figureType) {
                case "T":
                case "t":
                    System.out.println("Please enter the length of the triangle's base:");
                    sideATxt = myScanner.nextLine();
                    sideA = Integer.parseInt(sideATxt);

                    System.out.println("Please enter the height of the triangle:");
                    sideBTxt = myScanner.nextLine();
                    sideB = Integer.parseInt(sideBTxt);

                    result = sideA * sideB / 2;

                    System.out.println("Area of the triangle equals: " + result);
                    break;
                case "S":
                case "s":
                    System.out.println("Please enter the length of the figure's first side:");
                    sideATxt = myScanner.nextLine();
                    sideA = Integer.parseInt(sideATxt);

                    System.out.println("Please enter the length of the figure's second side:");
                    sideBTxt = myScanner.nextLine();
                    sideB = Integer.parseInt(sideBTxt);

                    result = sideA * sideB;

                    if (sideA == sideB) {
                        System.out.println("Area of the square equals: " + result);
                    } else {
                        System.out.println("Area of the rectangle equals: " + result);
                    }
                    break;
                case "Q":
                case "q":
                    System.out.println("You've quit operarion.");
                    break;
                default:
                    System.out.println("Provided value is not proper");
            }
            System.out.println("Try again? To continue eneter Y.");
            calculateAgain = myScanner.nextLine();
            System.out.println(calculateAgain);
        } while (calculateAgain.equalsIgnoreCase("y"));
    }
}
