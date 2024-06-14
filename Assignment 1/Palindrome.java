import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPalindrome = isNumberPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }
    }

    public static boolean isNumberPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
