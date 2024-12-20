package GFG;

//Given a sorted array of distinct positive integers arr[], we need to find the kth positive number that is missing from arr[].
//
//Examples :
//
//Input: arr[] = [2, 3, 4, 7, 11], k = 5
//Output: 9
//Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution01 sln = new Solution01();
            int ans = sln.kthMissing(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution01 {
    public int kthMissing(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        // Binary search to find the range containing the kth missing number
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missingCount = arr[mid] - mid - 1; // Missing numbers up to arr[mid]

            if (missingCount < k) {
                low = mid + 1; // Move right to find more missing numbers
            } else {
                high = mid - 1; // Move left to narrow down the range
            }
        }

        // After the loop, low points to the index where kth missing would be
        int missingCountAtHigh = high >= 0 ? arr[high] - high - 1 : 0;
        return high >= 0 ? arr[high] + (k - missingCountAtHigh) : k;
    }
}

