import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 sorted numbers:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        Arrays.sort(numbers);

        System.out.print("Enter the key value to search: ");
        int key = scanner.nextInt();
        scanner.close();

        int index = binarySearch(numbers, key);

        if (index != -1) {
            System.out.println("The key value " + key + " is found at index " + index + ".");
        } else {
            System.out.println("The key value " + key + " is not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}
