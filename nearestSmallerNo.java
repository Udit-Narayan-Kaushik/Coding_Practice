
import java.util.Arrays;
import java.util.Stack;

public class nearestSmallerNo {
    public static int[] nearest(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current element is smaller than the
            // element at the top of the stack
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                // Update the nearest smaller element for the element at the top of the stack
                arr[stack.pop()] = arr[i];
            }
            // Push the index of the current element onto the stack
            stack.push(i);
        }

        // Elements remaining in the stack have no smaller element to the right
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 11, 7, 6, 5, 6, 1 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] result = nearest(arr);
        System.out.println("Array with Nearest Smaller Elements: " + Arrays.toString(result));
    }
}
