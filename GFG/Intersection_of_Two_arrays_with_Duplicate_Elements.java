package GFG;
/*
Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not have duplicate elements and the result should contain items in any order.

Note: The driver code will sort the resulting array in increasing order before printing.

Examples:

Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
Output: [1, 3]
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.
Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
Output: [1]
Explanation: 1 is the only common element present in both the arrays.
Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
Output: []
Explanation: No common element in both the arrays.

*/
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution10 sol = new Solution10();
            ArrayList<Integer> res = sol.intersectionWithDuplicates(a, b);

            // Sort the result
            Collections.sort(res);

            // Print the result
            if (res.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int num : res) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution10 {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // Create hash sets for both arrays to remove duplicates
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        
        // Add elements from array `a` to `setA`
        for (int num : a) {
            setA.add(num);
        }
        
        // Add elements from array `b` to `setB`
        for (int num : b) {
            setB.add(num);
        }
        
        // Create a result list to store the intersection
        ArrayList<Integer> result = new ArrayList<>();
        
        // Iterate through setA and check for common elements in setB
        for (int num : setA) {
            if (setB.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
}
