import java.util.HashMap;
import java.util.Map;

public class one_freq {

    public static int findOnce(int arr[]) {
        // Complete this function
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(findOnce(arr)); // Output: 2
    }

}
