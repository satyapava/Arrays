import java.util.*;

/*
---------------------------------------------------------
1. Problem: Find the Largest Element in an Array
---------------------------------------------------------
Description:
Find the maximum value present in the array.

Sample Input:
5
10 50 30 70 20

Sample Output:
70

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input array size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(max); // Output the largest element
    }
}
