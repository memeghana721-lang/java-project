import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Create an array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Copy array elements to ArrayList
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        // Display ArrayList elements
        System.out.println("Elements in the ArrayList:");

        for (int num : list) {
            System.out.println(num);
        }

        sc.close();
    }
}