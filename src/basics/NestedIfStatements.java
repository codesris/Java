package src.basics;

public class NestedIfStatements {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 10.0;

        if(isStudent){
            if (isSenior) {
                System.out.println("You get a senior discount of 10%");
                price *= 0.9;
            }
            else{
                System.out.println("You get a student discount of 10%");
                System.out.println("You get a student discount of 20%");
                price *= 0.7;
            }
        }
        else{
            if (isSenior) {
                System.out.println("You get a senior discount of 10%");
                price *= 0.1;
            }
        }
    
        System.out.printf("The price of a ticket is %.2f",price);
    }
    
}
