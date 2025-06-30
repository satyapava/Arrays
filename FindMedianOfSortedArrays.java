/*
📌 Problem: Find Median of Two Sorted Arrays

🔢 Input:
- First line: integer n1 (size of first array)
- Second line: n1 integers (elements of first array)
- Third line: integer n2 (size of second array)
- Fourth line: n2 integers (elements of second array)

✅ Output:
- Median value (double)

⏱ Time Complexity: O((m + n) log(m + n))
⏱ Space Complexity: O(m + n)
*/

import java.util.*;

public class FindMedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] merged = new int[n];
        int ind = 0;

        for (int i : nums1) merged[ind++] = i;
        for (int i : nums2) merged[ind++] = i;

        Arrays.sort(merged);

        if (n % 2 == 0)
            return (merged[n / 2] + merged[(n / 2) - 1]) / 2.0;
        return merged[n / 2];
    }

    // 🧪 Main Method for Dynamic Input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMedianOfSortedArrays sol = new FindMedianOfSortedArrays();

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) nums1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) nums2[i] = sc.nextInt();

        double res = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + res);
    }
}
