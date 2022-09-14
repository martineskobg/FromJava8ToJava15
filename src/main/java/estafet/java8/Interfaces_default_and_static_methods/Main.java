package estafet.java8.Interfaces_default_and_static_methods;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Using Scanner for Getting Input from User
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two int numbers");
        int firstNumber = input.nextInt();
        System.out.println("---------");
        int secondNumber = input.nextInt();
        System.out.println("---------");

        MatemathicOperations matemathicOperations = new MathOperation();

        System.out.println(firstNumber + " + " + secondNumber + " = " + matemathicOperations.sum(firstNumber, secondNumber));

        int result = matemathicOperations.getDivisionResult(firstNumber,secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " = " + result);
    }
}