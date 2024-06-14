import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 numbers:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the key value to search: ");
        int key = scanner.nextInt();
        scanner.close();

        int index = linearSearch(numbers, key);

        if (index != -1) {
            System.out.println("The key value " + key + " is found at index " + index + ".");
        } else {
            System.out.println("The key value " + key + " is not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; 
    }
}

