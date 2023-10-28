import java.util.ArrayList;
import java.util.List;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        isAnagram("1111", ":222");
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        List<Character> sRes = new ArrayList<>();
        List<Character> tRes = new ArrayList<>();
        if (sChars.length != tChars.length) {
            return false;
        }
        for (int index = 0; index < sChars.length; index++) {
            sRes.add(sChars[index]);
            tRes.add(tChars[index]);
        }
        String stringRes  = sRes.stream().sorted().toList().toString();
        String stringTres  = tRes.stream().sorted().toList().toString();
        if (stringRes.equals(stringTres)) {
            return true;
        }
        return false;
    }
}
