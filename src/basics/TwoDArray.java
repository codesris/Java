package src.basics;

public class TwoDArray {
    public static void main(String[] args) {
        //2D array = An array where each element is an array 
        //      Useful for storing a matrix of data

        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meats = {"chicken", "pork", "meat", "fish"};
        
        // String[][] groceries = { fruits,
        //                         vegetables,
        //                          meats
        // };

        String [][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "meat", "fish"}};

            groceries[0][0] = "tangerine";
            groceries[2][1] = "eggs";

        for(String[] foods: groceries ){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }   
}
