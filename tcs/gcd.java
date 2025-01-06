package tcs;

public class gcd {
    public static void main(String[] args) {
        int n1=12,n2=18;
        int gcd=1;
        // Iterate from 1 to the smaller of the two numbers
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) { // Check if `i` is a common divisor
                gcd = i; // Update gcd
            }
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);

    }
}
