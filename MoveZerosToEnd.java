// Problem: Move Zeros to End
// Description: Move all 0s to the end while keeping order of non-zeros.
// Sample Input: [0, 1, 0, 3, 12]
// Sample Output: [1, 3, 12, 0, 0]
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Array size
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int index = 0; // points to position of next non-zero
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) arr[index++] = arr[i];
        }

        while(index < n) arr[index++] = 0;

        for(int val : arr) System.out.print(val + " ");
        sc.close();
    }
}
