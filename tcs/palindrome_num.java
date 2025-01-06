package tcs;

public class palindrome_num {
    public static void main(String[] args) {
        int n = 121;  // Number to check
        int original = n;  // Store the original number
        int reversed = 0;  // To hold the reversed number

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;       // Extract the last digit
            reversed = reversed * 10 + digit;  // Build the reversed number
            n /= 10;                  // Remove the last digit
        }

        // Check if the original number is equal to its reverse
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
