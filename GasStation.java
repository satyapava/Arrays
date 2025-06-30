/*
📌 Problem: Gas Station

🔢 Input:
- First line: n (number of stations)
- Second line: n integers for gas[]
- Third line: n integers for cost[]

✅ Output:
- Index of the starting gas station or -1

⏱ Time Complexity: O(n)
⏱ Space Complexity: O(1)
*/

import java.util.*;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;

        int tank = 0, idx = 0;
        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                tank = 0;
                idx = i + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GasStation sol = new GasStation();

        System.out.print("Enter number of stations: ");
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];

        System.out.println("Enter gas array:");
        for (int i = 0; i < n; i++) gas[i] = sc.nextInt();

        System.out.println("Enter cost array:");
        for (int i = 0; i < n; i++) cost[i] = sc.nextInt();

        int res = sol.canCompleteCircuit(gas, cost);
        System.out.println("Start Station Index: " + res);
    }
}
