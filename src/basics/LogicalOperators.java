package src.basics;

public class LogicalOperators {
    public static void main(String[] args) {
        // Sample variables
        int age = 22;
        boolean hasVoterId = true;
        boolean isCitizen = true;
        boolean hasCriminalRecord = false;

        // 1. Logical AND (&&) - Both must be true
        if (age >= 18 && isCitizen) {
            System.out.println("Condition 1: Eligible to vote (Both true)");
        }

        // 2. Logical OR (||) - At least one must be true
        if (hasVoterId || isCitizen) {
            System.out.println("Condition 2: Identity verified (At least one true)");
        }

        // 3. Logical NOT (!) - Reverses the boolean value
        if (!hasCriminalRecord) {
            System.out.println("Condition 3: Clean record (NOT false is true)");
        }

        // 4. Logical XOR (^) - True only if conditions are different
        boolean testXor = (age > 20) ^ (isCitizen == false);
        System.out.println("Condition 4: XOR Result is " + testXor);

        // 5. Short-Circuiting Example
        // If the first part of '&&' is false, the second part is never checked.
        boolean shortCircuit = (age < 18) && (10 / 0 == 0); 
        System.out.println("Short-circuit result: " + shortCircuit);
    }


}
