package src.basics;

//printf() is a method used to format output

public class PrintfExample {
    public static void main(String[] args) {
        String name = "Chasris";
        char currency = '$';
        int age = 30;
        double height = 6.0;
        boolean isStudent = true;

        System.out.printf("Hi %s\n", name);
        System.out.printf("You currently have %c%d in you account\n",currency,age);
        System.out.printf("You'll be %d this year\n",age);
        System.out.printf("You're %.2f ft tall\n",height);
        System.out.printf("Student %b\n",isStudent);
    }
}
