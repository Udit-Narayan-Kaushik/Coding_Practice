public class Main {
    public static void main(String[] args) {
        int N = 120; // Example number
        System.out.println(countDividingDigits(N));
    }

    public static int countDividingDigits(int N) {
        int originalNumber = N; // Store the original number
        int count = 0;

        while (N > 0) { // Continue until all digits are processed
            int digit = N % 10;  // Extract the last digit
            N /= 10;  // Remove the last digit by performing integer division

            // Check if the digit is not zero and originalNumber is divisible by this digit
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
        }

        return count; // Return the count of digits that divide the number
    }
}
