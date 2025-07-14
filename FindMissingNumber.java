// Problem: Find Missing Number in an Array
// Description: From 1 to N, one number is missing. Find it.
// Sample Input: [1, 2, 4, 5, 6]
// Sample Output: 3
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Full range 1 to n
        int[] arr = new int[n - 1];
        for(int i = 0; i < n - 1; i++) arr[i] = sc.nextInt();

        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int val : arr) sum += val;

        System.out.println(total - sum); // Missing number
        sc.close();
    }
}
