package GFG;

/*
Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, such that arr[i] + arr[j] + arr[k] = target and i < j < k.

Examples:

Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
Output: 4
Explanation: Two triplets that add up to -2 are:
arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
Input: arr[] = [-2, 0, 1, 1, 5], target = 1
Output: 0
Explanation: There is no triplet whose sum is equal to 1. 
Constraints:
3 ≤ arr.size() ≤ 103
-105 ≤ arr[i], target ≤ 105
*/

//{ Driver Code Starts
// Initial Template for Java
import java.util.*;

class GFG16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution16 ob = new Solution16();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution16 {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        // Fix the first element of the triplet
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            // Use two-pointer technique to find the other two elements
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    // Count all combinations of duplicates
                    if (arr[left] == arr[right]) {
                        int freq = right - left + 1; // All elements between left and right are the same
                        count += (freq * (freq - 1)) / 2; // Combination formula: nC2
                        break;
                    }

                    // Count distinct combinations
                    int leftCount = 1, rightCount = 1;

                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        left++;
                        leftCount++;
                    }

                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        right--;
                        rightCount++;
                    }

                    count += leftCount * rightCount;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
