// Problem: Linear Search
// Description: Search for a value and return index or -1 if not found.
// Sample Input: [4, 2, 7, 1], target = 7
// Sample Output: 2
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Array size
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int target = sc.nextInt(); // Value to find
        int index = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        sc.close();
    }
}
