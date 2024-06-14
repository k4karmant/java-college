import java.util.Arrays;
import java.util.Scanner;

public class StrSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String sortedString = sortString(inputString);

        System.out.println("Original string: " + inputString);
        System.out.println("Sorted string: " + sortedString);

        sc.close();
    }

    public static String sortString(String str) 
    {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
