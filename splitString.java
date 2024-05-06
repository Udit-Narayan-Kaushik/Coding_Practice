public class splitString {
    // Function to reverse words in a given string.
    public static String reverseWords(String S) {
        // code here

        String[] words = S.split("\\.");
        // This will split the string S into an array of words wherever there's a dot.

        StringBuilder sb = new StringBuilder(); // new stringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            if (i > 0) {
                sb.append(words[i]);
                sb.append(".");
            } else
                sb.append(words[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String str = "the.sky.is.blue";
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
