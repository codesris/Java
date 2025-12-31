package src.basics;
 
import java.util.Scanner;

public class MathExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Hypotenuse
        double perpendicular;
        double base;
        double hypotenuse;

        System.out.print("Enter the length: ");
        perpendicular = scanner.nextDouble();

        System.out.print("Enter the width: ");
        base = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(perpendicular,2) + Math.pow(base, 2));
        System.out.println("\nHypotenuse is " +hypotenuse+ " units.");

        //Circumference, Volume of Sphere

        double circum;
        double vol;
        double area;
        int radius;

        System.out.print("\nEnter radius: ");
        radius = scanner.nextInt();

        circum = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius,2);
        vol = (4.0/3.0)*Math.PI*Math.pow(radius, 3);

        System.out.println("\nCircumference is "+ circum + " units.");
        System.out.println("Area is "+ area + " units.");
        System.out.println("Volume is "+ vol + " units.");

        scanner.close();
    }
    
}