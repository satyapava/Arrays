import java.util.*;

/*
---------------------------------------------------------
2. Problem: Find Second Largest Element (Without Sorting)
---------------------------------------------------------
Description:
Find the second largest element in an array without sorting.

Sample Input:
5
10 20 40 50 30

Sample Output:
40

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input size
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println(second == Integer.MIN_VALUE ? -1 : second); // Output result
    }
}
