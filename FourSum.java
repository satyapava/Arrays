import java.util.*;

/*
Sample Input:
Enter number of elements: 6
Enter array elements:
1 0 -1 0 -2 2
Enter target sum: 0

Sample Output:
Unique quadruplets that sum to target:
[-2, -1, 1, 2]
[-2,  0, 0, 2]
[-1,  0, 0, 1]

Time Complexity: O(n^3)
- One loop for i
- One loop for j
- Two-pointer for remaining two elements

Space Complexity: O(1) extra (excluding output)
*/

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return result;

        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Output
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println("Unique quadruplets that sum to target:");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
