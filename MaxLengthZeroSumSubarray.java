import java.util.*;

/*
Sample Input:
Enter number of elements: 8
Enter array elements:
15 -2 2 -8 1 7 10 23

Sample Output:
Length of longest subarray with sum = 0: 5
(Explanation: Subarray [-2, 2, -8, 1, 7] has sum 0)

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class MaxLengthZeroSumSubarray {

    public static int maxLength(int[] arr) {
        // Map to store (prefixSum -> first index seen)
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            } else if (map.containsKey(sum)) {
                // Found a subarray with sum = 0
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i); // Store first occurrence of this sum
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        int result = maxLength(arr);
        System.out.println("Length of longest subarray with sum = 0: " + result);
    }
}
