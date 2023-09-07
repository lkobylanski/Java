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

    // Figures and other data
    static String figureType;
    static String sideATxt;
    static String sideBTxt;
    static String calculateAgain;
    static int sideA;
    static int sideB;
    static double result;
    // Add scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println(
                    "Select whether you want to calculate the area of a triangle or square (rectangle). For triangle type T for square or rectangle type S. To quit press Q."
            );
            figureType = input.next();  // Read user input

            switch (figureType) {
                case "T":
                case "t":
                    double[] userInputTriangle = new double[2];

                    for (int i = 0; i < userInputTriangle.length; i++) {
                        do {
                            if (i == 0) {
                                System.out.println("Please enter length of the triangle base (positive integer is accepted only)");
                            } else {
                                System.out.println("Please enter length of the triangle height (positive integer is accepted only)");
                            }

                            while (!input.hasNextDouble()) {
                                String invalidInput = input.next();
                                System.out.println(invalidInput + " is not a valid double. Please enter a positive double value: ");
                            }

                            userInputTriangle[i] = input.nextDouble();

                        } while (userInputTriangle[i] <= 0);
                    }

                    result = userInputTriangle[0] * userInputTriangle[1] / 2;
                    System.out.println("Area of the triangle equals: " + result);

                    break;

                case "S":
                case "s":
                    double[] userInputRectangle = new double[2];

                    for (int i = 0; i < userInputRectangle.length; i++) {
                        do {
                            if (i == 0) {
                                System.out.println("Please enter length of the rectangle sideA (positive integer is accepted only)");
                            } else {
                                System.out.println("Please enter length of the rectangle sideB (positive integer is accepted only)");
                            }

                            while (!input.hasNextDouble()) {
                                String invalidInput = input.next();
                                System.out.println(invalidInput + " is not a valid double. Please enter a positive double value: ");
                            }

                            userInputRectangle[i] = input.nextDouble();

                        } while (userInputRectangle[i] <= 0);
                    }

                    result = userInputRectangle[0] * userInputRectangle[1];
                    System.out.println("Area of the rectangle equals: " + result);

                    break;
                case "Q":
                case "q":
                    System.out.println("You've quit the operarion.");
                    break;
                default:
                    System.out.println("Provided value is not proper");
            }

            System.out.println("Try again? To continue eneter Y.");
            calculateAgain = input.next();

        } while (calculateAgain.equalsIgnoreCase("y"));
    }
}
