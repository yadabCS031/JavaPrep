import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to find frequency
        System.out.print("Enter the number to find frequency: ");
        int num = sc.nextInt();

        int count = 0;

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        System.out.println("Frequency of " + num + " = " + count);
        sc.close();
    }
}

