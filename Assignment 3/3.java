import java.util.Scanner;

class Array2 {
    private int[] numbers;

    public Array2() {
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

    public void quickSort() {
        quickSortRecursive(0, numbers.length - 1);
    }

    private void quickSortRecursive(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSortRecursive(low, pivotIndex - 1);
            quickSortRecursive(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }

    public void display() {
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array2 array = new Array2();
        array.getData();

        array.quickSort();
        array.display();
    }
}