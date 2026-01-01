package src.miniProjects;

import java.util.Scanner;

public class ShoppingCart {
    public static void main (String[] args){
        String item;
        double price;
        int num;
        char currency = '$';



        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("\nWhat is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("\nHow many would you like to buy?: ");
        num = scanner.nextInt();

        System.out.println("You have bought " + num + item);
        System.out.println("Your total is : " + currency + price * num);

        scanner.close();
    }
}
