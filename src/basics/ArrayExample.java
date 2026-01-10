package src.basics;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // array = a collection of value of the same data type

        String[] fruits = {"apple","cononut","banana","dragon fruit"}; 

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        fruits[0] = "pineapple";
        System.out.println("\n"+fruits[0]);

        int numOfFruits = fruits.length;
        System.out.println("\n"+numOfFruits);

        for(int i=0;i<numOfFruits;i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println("\n");

        //enhanced "for loop" or "for each loop"
        //Array sort in ascending using library and built-in function
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println();

        //Array fill
        Arrays.fill(fruits, "melon");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }

}
