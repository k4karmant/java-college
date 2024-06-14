import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int vowelCount = 0;
        int consonantCount = 0;
        int specialSymbolCount = 0;

        // Convert the input string to lowercase to simplify the vowel checking
        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (isVowel(ch)) {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                // Check if the character is a consonant (excluding vowels)
                consonantCount++;
            } else {
                // Count special symbols, excluding spaces and digits
                specialSymbolCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of special symbols: " + specialSymbolCount);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
