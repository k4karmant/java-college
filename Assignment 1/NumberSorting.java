import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 numbers:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        // Sort the array using bubble sort
        bubbleSort(numbers);

        System.out.println("\nSorted numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Initially assume that the array is already sorted
            boolean sorted = true;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements at positions j and j+1
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false; // Set the sorted flag to false since a swap occurred
                }
            }

            // If the sorted flag remains true, the array is already sorted, and we can break the loop
            if (sorted) {
                break;
            }
        }
    }
}
