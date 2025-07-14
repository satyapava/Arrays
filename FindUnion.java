// Problem: Find the Union of Two Arrays
// Description: Return all distinct elements from both arrays.
// Sample Input: arr1 = [1,2,3], arr2 = [2,3,4,5]
// Sample Output: [1,2,3,4,5]
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

import java.util.*;

public class FindUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of arr1
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int m = sc.nextInt(); // Size of arr2
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        Set<Integer> unionSet = new TreeSet<>(); // Sorted set
        for(int val : arr1) unionSet.add(val);
        for(int val : arr2) unionSet.add(val);

        for(int val : unionSet) System.out.print(val + " ");
        sc.close();
    }
}
