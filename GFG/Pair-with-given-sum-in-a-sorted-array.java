package GFG;
/*
You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
Note: pairs should have elements of distinct indexes. 

Examples :

Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 2 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
Input: arr[] = [-1, 10, 10, 12, 15], target = 125
Output: 0
Explanation: There is no such pair which sums up to 4.
*/
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

// User function Template for Java
class Solution20 {
    int countPairs(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                // Handle duplicates for the same pair
                if (arr[left] == arr[right]) {
                    // Special case: both pointers point to the same number
                    int freq = right - left + 1;
                    count += (freq * (freq - 1)) / 2; // Combination formula: nC2
                    break;
                } else {
                    // Count duplicates for left and right separately
                    int countLeft = 1, countRight = 1;

                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        left++;
                        countLeft++;
                    }
                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        right--;
                        countRight++;
                    }

                    count += countLeft * countRight;

                    // Move pointers inward
                    left++;
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}




//{ Driver Code Starts.
class GFG20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution20 obj = new Solution20();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
