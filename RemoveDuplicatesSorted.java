import java.util.*;

/*
---------------------------------------------------------
4. Problem: Remove Duplicates from Sorted Array
---------------------------------------------------------
Description:
Given a sorted array, remove duplicates in-place and print unique elements.

Sample Input:
7
1 1 2 2 3 4 4

Sample Output:
1 2 3 4

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input array size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int j = 1; // Index to place next unique element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j++] = arr[i];
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " "); // Print result
        }
    }
}
