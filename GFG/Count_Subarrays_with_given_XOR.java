package GFG;
/*
Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.

Examples: 

Input: arr[] = [4, 2, 2, 6, 4], k = 6
Output: 4
Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.
Input: arr[] = [5, 6, 7, 8, 9], k = 5
Output: 2
Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]. Hence, the answer is 2.
*/


//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG14 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution14 obj = new Solution14();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution14 {
    public long subarrayXor(int arr[], int k) {
        long count = 0;
        int xor = 0;
        HashMap<Integer, Integer> xorCount = new HashMap<>();

        // Initialize the map with 0 XOR (base case)
        xorCount.put(0, 1);

        for (int num : arr) {
            xor ^= num;

            // Check if there's a prefix with XOR that matches xor ^ k
            int target = xor ^ k;
            count += xorCount.getOrDefault(target, 0);

            // Add the current XOR to the map
            xorCount.put(xor, xorCount.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
