package GFG;
/*
Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
*/
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[0]);

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            boolean ans = new Solution07().twoSum(arr, x);
            System.out.println(ans ? "true" : "false");
            // System.out.println("~");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution07 {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
