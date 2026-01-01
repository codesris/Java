package src.miniProjects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fNumber;
        double sNumber;
        char operator;
        double result;

        System.out.print("Enter first number: ");
        fNumber = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        sNumber = scanner.nextDouble();

        result = switch (operator) {
            case '+' -> fNumber + sNumber;
            case '-' -> fNumber - sNumber;
            case '*' -> fNumber * sNumber;
            case '/' -> {
                if (sNumber==0) {
                    System.out.println("Cannot divide by zero.");
                    yield 0;
                }
                yield fNumber / sNumber;
            }
            case '^' -> result = Math.pow(fNumber, sNumber);

            default -> {System.out.println("Not a valid operator.");
            yield 0;
        }
        };

        System.out.printf("%f " +"%c "+ "%f = %.3f", fNumber,operator,sNumber,result);


        scanner.close();
    }
}
