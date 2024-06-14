import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        displayWordStats(word);

        sc.close();
    }

    public static void displayWordStats(String word) {
        int total = word.length();
        int vowel = 0;

        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }

        System.out.println("Word: " + word);
        System.out.println("Total number of characters: " + total);
        System.out.println("Number of vowels: " + vowel);
    }
}
