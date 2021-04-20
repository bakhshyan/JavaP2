package JavaP1;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    private double firstNumber;
    private String actionName;
    private double secondNumber;

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        calculator.getNumbersAndAction();
        System.out.println(calculator.calculate());


    }


    private void getNumbersAndAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter FirstNumber: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter action name: ");
        actionName = scanner.next();

        System.out.print("Enter SecondNumber : ");
        secondNumber = scanner.nextDouble();

    }

    private double calculate() {
        double sum = 0;
        switch (actionName) {
            case "+":
                sum = firstNumber + secondNumber;
                break;
            case "-":
                sum = firstNumber - secondNumber;
                break;
            case "*":
                sum = firstNumber * secondNumber;
                break;
            case "/":
                sum = firstNumber / secondNumber;
                break;

        }
        return sum;
    }
}

