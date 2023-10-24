import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 // 1768. Merge Strings Alternately
public class MergeStringsAlternately {
   
    /*
     * You are given two strings word1 and word2.
     *  Merge the strings by adding letters in alternating order, 
     * starting with word1. 
     * If a string is longer than the other, 
     * append the additional letters onto the end of the merged string.
     * Return the merged string.
     * 
     * 解决思路：
     * 1.比较两个字符串长度并切成单独字符，然后for循环逐个加入
     * 2.把较长的留下的长字符串“尾巴”直接接入最后的结果
     */
    public static String mergeAlternately(String word1, String word2) {
        char [] wordChar1 = word1.toCharArray();
        char [] wordChar2 = word2.toCharArray();
        List<Character> result= new ArrayList<>();
        if (word1.length() <= word2.length()) {
            for (int index = 0; index < word1.length(); index++) {
                result.add(wordChar1[index]);
                result.add(wordChar2[index]);
            }
            for (int index = word1.length(); index < word2.length(); index++) {
                result.add(wordChar2[index]);
            }
        } else {
            for (int index = 0; index < word2.length(); index++) {
                result.add(wordChar1[index]);
                result.add(wordChar2[index]);
            }
            for (int index = word2.length(); index < word1.length(); index++) {
                result.add(wordChar1[index]);
            }
        }
        return result.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
