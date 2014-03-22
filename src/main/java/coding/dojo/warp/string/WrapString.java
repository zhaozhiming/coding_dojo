package coding.dojo.warp.string;

public class WrapString {
    public static String wrap(String str, int len) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            while (word.length() > len) {
                String lenString = word.substring(0, len);
                result.append(lenString).append("\n");
                word = word.substring(len, word.length());
            }

            result.append(word).append("\n");
        }

        String wrapString = result.toString();
        return wrapString.substring(0, wrapString.length() - 1);
    }
}
