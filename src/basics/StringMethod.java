package src.basics;

public class StringMethod {
    public static void main(String[] args) {
        String phrase = "  Learning Java is Fun!  ";

        // 1. trim() - Removes leading and trailing whitespace
        String cleanPhrase = phrase.trim();
        System.out.println("Trimmed: [" + cleanPhrase + "]");

        // 2. length() - Returns the number of characters
        int size = cleanPhrase.length();
        System.out.println("Length: " + size);

        // 3. toUpperCase() - Converts all characters to capital letters
        String loudPhrase = cleanPhrase.toUpperCase();
        System.out.println("Uppercase: " + loudPhrase);

        // 4. substring(int begin, int end) - Extracts a portion of the string
        String language = cleanPhrase.substring(9, 13);
        System.out.println("Extracted Word: " + language);

        // 5. replace(char old, char new) - Replaces specific characters
        String updatedPhrase = cleanPhrase.replace('!', '?');
        System.out.println("Modified Ending: " + updatedPhrase);

        // 6. equalsIgnoreCase() - Case-insensitive comparison
        boolean sameMeaning = cleanPhrase.equalsIgnoreCase("learning java is fun!");
        System.out.println("Equals Ignore Case: " + sameMeaning);

        // 7. contains() - Checks if substring exists
        boolean hasJava = cleanPhrase.contains("Java");
        System.out.println("Contains 'Java': " + hasJava);

        // 8. isEmpty() - Checks if string has zero length
        String emptyString = "";
        System.out.println("Is empty string empty? " + emptyString.isEmpty());
        System.out.println("Is cleanPhrase empty? " + cleanPhrase.isEmpty());
    }
}
