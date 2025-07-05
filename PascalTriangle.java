import java.util.*;

/*
Sample Input:
Enter number of rows: 5

Sample Output:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

Time Complexity: O(n^2)
  - We iterate over each row and within each row, we iterate up to the row index.

Space Complexity: O(n^2)
  - We're storing all rows in a list of lists.
*/

class PascalTriangle 
{

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop over each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Loop over each element in the row
            for (int j = 0; j <= i; j++) {
                // First and last elements of the row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Value is the sum of the two values above it from the previous row
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        // Generate the triangle
        List<List<Integer>> result = generate(numRows);

        // Print the triangle
        for (List<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
