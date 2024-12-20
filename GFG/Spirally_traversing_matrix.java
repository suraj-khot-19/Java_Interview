//Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
//Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
//You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.


package GFG;//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG02 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int[][] matrix = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution02 ob = new Solution02();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

class Solution02 {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> result = new ArrayList<>();
        if (mat == null || mat.length == 0) {
            return result;
        }
        
        int top = 0, left = 0;
        int bottom = mat.length - 1, right = mat[0].length - 1;
        
        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;
            
            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;
            
            // Traverse bottom row (if not already traversed)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            // Traverse left column (if not already traversed)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}

