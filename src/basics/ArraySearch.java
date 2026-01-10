package src.basics;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 2, 8, 3, 5, 4}; 
        int target = 2;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i ++)
        {
            if (target == numbers[i]){
                System.out.println("Found at index: "+i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println(target+" not found in the array.");
        }

        //Search index for a String
        //== won't work here because String is reference data type 
        //      so, we use built-in equals method
        String[] fruits = {"apple", "orange", "banana"}; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fruit to search: ");

        String targetFruit = scanner.nextLine();
        isFound = false;
        for(int i = 0; i < fruits.length; i ++)
        {
            if (fruits[i].equals(targetFruit)){
                System.out.println(targetFruit+" found at index: "+i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}
