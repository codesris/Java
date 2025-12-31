package src.projects.miniProjects;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
    Random random = new Random();
    int number1;
    int number2;
    int number3;
    double number4;
    double number5;
    boolean isHead;

    //origin is inclusive but bound is exclusive 
    number1 = random.nextInt(1,6);
    number2 = random.nextInt(1,6);
    number3 = random.nextInt(1,6);
    number4 = random.nextInt(1,6);
    number5 = random.nextInt();
    isHead = random.nextBoolean();

    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number4);
    System.out.println(number5);

    if (isHead) {
        System.out.println("Head");
    }
    else{
        System.out.println("Tail");
    }
    }
}
