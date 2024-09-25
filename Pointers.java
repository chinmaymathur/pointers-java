import java.util.Scanner;

public class Pointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements in the array
        System.out.println("Enter " + n + " elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array by counting 0s and 1s
        int countZeroes = 0;
        for (int i : arr) {
            if (i == 0) {
                countZeroes++;
            }
        }

        // Fill the array with sorted 0s and 1s
        for (int i = 0; i < countZeroes; i++) {
            arr[i] = 0;
        }
        for (int i = countZeroes; i < n; i++) {
            arr[i] = 1;
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        
    }
}
