import java.util.Scanner;

public class WordCounter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) 
    {
        if (str == null || str.trim().isEmpty()) 
        {
            return 0;
        }

        String[] words = str.trim().split("\\s+");

        return words.length;
    }
}
