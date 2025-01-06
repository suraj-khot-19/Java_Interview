package GFG;
/*
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

Examples:

Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
Input: arr[] = [10], target = 10
Output: []
Explanation: As the input array has only 1 element, return an empty array.
*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

 class GDG15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution17 ob = new Solution17();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution17 {
    public List<Integer> sumClosest(int[] arr, int target) {
        // Handle edge case: if the array has fewer than 2 elements
        if (arr.length < 2) {
            return new ArrayList<>();
        }

        // Sort the array
        Arrays.sort(arr);

        // Initialize variables to store the closest pair and the minimum difference
        int closestDiff = Integer.MAX_VALUE;
        int maxAbsDiff = Integer.MIN_VALUE;
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        // Two-pointer approach
        int i = 0, j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            int diff = Math.abs(target - sum);
            int absDiff = arr[j] - arr[i];

            if (diff < closestDiff || (diff == closestDiff && absDiff > maxAbsDiff)) {
                closestDiff = diff;
                maxAbsDiff = absDiff;
                result = Arrays.asList(arr[i], arr[j]);
            }

            // Move pointers based on the sum
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
