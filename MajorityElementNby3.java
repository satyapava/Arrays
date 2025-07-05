import java.util.*;

/*
Sample Input:
Enter number of elements: 8
Enter array elements:
1 1 1 3 3 2 2 2

Sample Output:
Majority elements (> n/3 times):
1 2

Explanation:
- The length of the array = 8
- n/3 = 2.66... → floor(n/3) = 2
- 1 and 2 both appear more than twice

Time Complexity: O(n)
- First pass to find candidates
- Second pass to count actual occurrences

Space Complexity: O(1)
- No extra space used (excluding output)
*/

public class MajorityElementNby3 {

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        // Candidates and their counts
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;

        // First Pass: Find potential candidates
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second Pass: Verify counts of candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Output
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority elements (> n/3 times):");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
