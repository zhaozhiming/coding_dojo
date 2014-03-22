package coding.dojo.warp.string;

public class WrapString {
    public static String wrap(String str, int len) {
        String result = "";
        String[] words = str.split(" ");
        for (String word : words) {
            while (word.length() > len) {
                String lenString = word.substring(0, len);
                result += lenString + "\n";
                word = word.substring(len, word.length());
            }

            result += word + "\n";
        }

        return result.substring(0, result.length() - 1);
    }
}
