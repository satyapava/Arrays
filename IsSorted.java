import java.util.*;

/*
---------------------------------------------------------
3. Problem: Check if Array is Sorted
---------------------------------------------------------
Description:
Check if the array is sorted in non-decreasing order.

Sample Input:
5
1 2 3 4 5

Sample Output:
true

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted); // Output true/false
    }
}
