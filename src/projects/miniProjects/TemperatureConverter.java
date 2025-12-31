package src.projects.miniProjects;

import java.util.Scanner;


public class TemperatureConverter {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double temp;
    double newTemp;
    String unit;
    
    System.out.println("Temperature Converter\n");

    System.out.print("Convet to Celcius or Fahrenheit (C or F): ");
    unit = scanner.nextLine().toUpperCase();

    System.out.print("Enter the temperature: ");
    temp = scanner.nextDouble();

    //(condition) ? true : false
    newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

    System.out.printf("%.2f °%s",newTemp,unit);


    scanner.close();
    }
}
