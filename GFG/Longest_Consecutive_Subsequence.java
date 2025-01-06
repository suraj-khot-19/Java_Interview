package GFG;
/*

Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
Output: 4
Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.
Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
Output: 7
Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.

*/

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution12 ob = new Solution12();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution12 {

    // Function to return the length of the longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        // Use a HashSet to store array elements for fast lookup.
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        // Iterate through the array to find the start of each sequence.
        for (int num : arr) {
            // Check if the current number is the start of a sequence.
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Incrementally check for the next numbers in the sequence.
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the maximum length of the sequence.
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
