package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ask the user to input two numbers
        //Convert the numbers as Strings using Scanner
        //Convert a String to a double using Double.parseDouble. Save the the first double value in an operand1 variable and the second double value in an operand2 variable
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String userNumber = s.nextLine();
        double firstNumber = Double.parseDouble(userNumber);

        System.out.print("Enter second number: ");
        userNumber = s.nextLine();
        double secondNumber = Double.parseDouble(userNumber);

        //Add the operands and save in a sum variable
        //Subtract the operands and save in a difference variable
        //Divide the operands and save in a division variable
        //Multiply the operands and save in a multiplication variable

        double sum = firstNumber + secondNumber;//9
        double difference = firstNumber - secondNumber;//6
        double division = firstNumber / secondNumber;
        double multiplication = firstNumber * secondNumber;

        //Find the remainder when one operand is divided by the other and save in a remainder variable.
        double remainder = firstNumber % secondNumber;

        //Call a showResults method and pass the sum, difference, division, multiplication and remainder variables as arguments.
        showResults(sum, difference, division, multiplication, remainder);
    }

    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        //In the showResults method output the parameters with some meaningful text (e.g. The sum is 10.5).
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The division is " + division);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The remainder is " + remainder);

    }
}
