package src.basics;

public class StaticExample {
    // static = Makes a variable or method belong to the class
    //          rather to an specific object.
    //          Commonly used for utility methods or shared resources
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Friend friend1 = new Friend ("Srisan");
        @SuppressWarnings("unused")
        Friend friend2 = new Friend ("Chaudhary");
        @SuppressWarnings("unused")
        Friend friend3 = new Friend ("Cha");
        @SuppressWarnings("unused")
        Friend friend4 = new Friend ("Sris");
        @SuppressWarnings("unused")
        Friend friend5 = new Friend ("Sri");

        Friend.showFriends();
        
    }
}
