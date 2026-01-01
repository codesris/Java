package src.basics;

public class BreakAndContinue {
    public static void main(String[] args) {
        //break; is used to break out of a loop (STOP)
        //continue; skip current iteration of loop (SKIP)

        for(int i = 0; i <= 20; i++){
            if (i == 15) {
                break;
            }
            else{
                if (i == 5) {
                 continue;   
                }
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for(int i = 0; i <= 20; i++){
    // If you print FIRST, 15 will appear before the loop breaks
    System.out.print(i + " "); 

    if (i == 15) {
        break; 
    }
    
}

    }
}
