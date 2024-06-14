public class StringMethods 
{
    public static void main(String[] args) 
    {
        // Creating a sample string
        String sampleString = "Hello, World! This is a demonstration of String methods.";

        // Using various String methods

        // Gets the length of the string
        int length = sampleString.length();
        System.out.println("Length of the string: " + length);

        // Retrieves the character at the specified index
        char charAtIndex = sampleString.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Retrieves a substring within the specified range
        String substring = sampleString.substring(13, 19);
        System.out.println("Substring from index 13 to 19: " + substring);

        // Checks if the string starts with a specified prefix
        boolean startsWithHello = sampleString.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Checks if the string ends with a specified suffix
        boolean endsWithMethods = sampleString.endsWith("methods.");
        System.out.println("Ends with 'methods.': " + endsWithMethods);

        // Finds the index of the first occurrence of a specified substring
        int indexOfWorld = sampleString.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // Finds the index of the last occurrence of a specified character
        int lastIndexOfSpace = sampleString.lastIndexOf(' ');
        System.out.println("Last index of space: " + lastIndexOfSpace);

        // Converts the string to uppercase
        String upperCase = sampleString.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // Converts the string to lowercase
        String lowerCase = sampleString.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        // Checks if the string contains a specified substring
        boolean containsDemo = sampleString.contains("Demo");
        System.out.println("Contains 'Demo': " + containsDemo);

        // Replaces occurrences of a specified substring with another substring
        String replacedString = sampleString.replace("This", "That");
        System.out.println("After replacement: " + replacedString);

        // Removes leading and trailing whitespace
        String trimmedString = sampleString.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // Splits the string into an array of substrings based on a delimiter
        String[] words = sampleString.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println("- " + word);
        }
    }
}
