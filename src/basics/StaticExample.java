package src.basics;

public class StaticExample {
    // static = Makes a variable or method belong to the class
    //          rather to an specific object.
    //          Commonly used for utility methods or shared resources
    public static void main(String[] args) {
        Friend friend1 = new Friend ("Srisan");
        Friend friend2 = new Friend ("Chaudhary");
        Friend friend3 = new Friend ("Cha");
        Friend friend4 = new Friend ("Sris");
        Friend friend5 = new Friend ("Sri");

        Friend.showFriends();
        
    }
}
