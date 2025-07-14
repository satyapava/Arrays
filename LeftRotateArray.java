// Problem: Left Rotate an Array by D Places
// Description: Rotate elements to the left by D positions.
// Sample Input: arr = [1, 2, 3, 4, 5], D = 2
// Sample Output: [3, 4, 5, 1, 2]
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Array size
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int d = sc.nextInt(); // Rotation count
        int[] rotated = new int[n];

        // Rotate left by D using mod
        for(int i = 0; i < n; i++) {
            rotated[i] = arr[(i + d) % n];
        }

        for(int val : rotated) System.out.print(val + " ");
        sc.close();
    }
}
