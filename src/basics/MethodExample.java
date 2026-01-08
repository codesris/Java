package src.basics;

public class MethodExample {
 public static void main(String[] args) {

    //method()  a block of reusable code that is executed whenever it is called.
    //Java does not pass variables it passes arguments (i.e. copies the arguments in new variable)
    //Java is unware of variables inside another method

    String name = "Chasris";
    int age = 22;
    happyBirthday(name, age);
    System.out.println();

    double result = squareMethod(3);
    System.out.println(result);

    System.out.println(cubeMethod(3));
    System.out.println();

    String fullName = getFullName("Spongebob", "SquarePants");
    System.out.println(fullName);
    System.out.println();

    int old = 21;
    if (ageCheck(old)){
        System.out.println("You may sign up");
    }
    else{
        System.out.println("You need to be 18+ to sign up");
    }
 }  
 //happyBirthday() method
static void happyBirthday(String name,int age){
    System.out.println("Happy Birthday "+name);
    System.out.println("You are now "+ age+ " years old");
 }

 //squareMethod()
 static double squareMethod (double number){

    return number * number;
 }

 //cubeMethod()
 static double cubeMethod (double number){
    return Math.pow(number, 3);
 }

 //getFullName() method
 static String getFullName(String first, String last){
    return first + " " + last;
 }

 static boolean ageCheck (int old){
    return old >= 18;
    // same as: if (age>=18){
    //          return true;
    //          }
    //          else{
    //          return false;
    //          };
 }
}
