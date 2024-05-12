public class caseCount {

    public static String checkCase(String str) {
        int UppCount = 0;
        int LowCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                UppCount++;
            } else if (Character.isLowerCase(ch)) {
                LowCount++;
            }
        }
        if (UppCount > LowCount) {
            return str.toUpperCase();
        }
        if (UppCount == LowCount)
            return str;

        return str.toLowerCase();
    }

    public static void main(String[] args) {
        // String str = "HelloWorld123";
        // checkCase(str);
        String str = "HELLOWOrld";
        // String result = checkCase(str);
        System.out.println(checkCase(str));
    }
}
