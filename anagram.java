import java.util.HashMap;

public class anagram {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                // If character doesn't exist in string a or its count becomes 0, it's not an
                // anagram
                return false;
            } else {
                // Decrease the count of the character in the map
                map.put(c, map.get(c) - 1);
            }
        }

        return true; // If all characters match and counts are correct, it's an anagram
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}
