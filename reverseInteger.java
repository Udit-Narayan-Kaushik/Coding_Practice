public class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int temp;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reverse;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.reverse(123));          // Output: 321
        System.out.println(solution.reverse(-123));         // Output: -321
        System.out.println(solution.reverse(120));          // Output: 21
        System.out.println(solution.reverse(0));            // Output: 0
        System.out.println(solution.reverse(1534236469));   // Output: 0 (overflow case)
        System.out.println(solution.reverse(-2147483648));  // Output: 0 (overflow case)
        System.out.println(solution.reverse(1000000003));   // Output: 0 (overflow case)
    }
}
