import java.util.*;

/*
---------------------------------------------------------
5. Problem: Left Rotate Array by One Place
---------------------------------------------------------
Description:
Rotate the elements of the array to the left by one position.

Sample Input:
5
1 2 3 4 5

Sample Output:
2 3 4 5 1

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LeftRotateOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input array size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int temp = arr[0]; // Store first element
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // Shift elements left
        }
        arr[n - 1] = temp; // Move first to last

        for (int num : arr) {
            System.out.print(num + " "); // Print rotated array
        }
    }
}
