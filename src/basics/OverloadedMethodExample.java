package src.basics;

public class OverloadedMethodExample {
    public static void main(String[] args) {
        //oveloaded methods = methods that share the same name,
        //                    but different parameters
        //                    signature = name + parameters
        
        //double
        System.out.println(add(1, 2, 3, 4));

        System.out.println();

        //pizza
        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);

    }
    //double method()
    static double add (double a, double b){
        return a + b;
    }

    static double add (double a, double b, double c){
        return a + b + c;
    }

    static double add (double a, double b, double c, double d){
        return a + b + c + d;
    }

    //pizza method()
    static String bakePizza (String bread){
        return bread + " pizza";
    }
    static String bakePizza (String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza (String bread, String cheese, String topppings){
        return topppings + " " + cheese + " " + bread + " pizza";
    }
}
