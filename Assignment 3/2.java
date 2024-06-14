import java.util.Scanner;

class Array {
    private int[] numbers;

    public Array() {
        numbers = new int[10];
    }

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public int findSmallest() {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public int findLargest() {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.getData();

        int smallest = array.findSmallest();
        int largest = array.findLargest();

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}