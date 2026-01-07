package src.basics;

public class VariableScope {
    int x = 3; //CLASS
    public static void main(String[] args) {
    //local variable has priority over class variable

    int x = 1; //LOCAL

    System.out.println(x);

    doSomething();
    }
    static void doSomething(){
        
        int x = 2; //LOCAL

        System.out.println(x);
    }
}
