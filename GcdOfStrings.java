public class GcdOfStrings {
    public static void main(String[] args) {
        gcdOfStrings("ABCABC", "ABC");
    }

    // 1071. Greatest Common Divisor of Strings
    // For two strings s and t, 
    // we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
    // Given two strings str1 and str2, 
    // return the largest string x such that x divides both str1 and str2.
    public static String gcdOfStrings(String str1, String str2) {
        if (str2.length() <= str1.length()) {
             if (str1.contains(str2)) {
                 str1 = str1.replace(str2, "");
                 if (str1.equals("")) {
                     return str2;
                 } else {
                    return str1;
                 }
             } 
              return "";
         } else {
             if (str2.contains(str1)) {
                 str2 = str2.replace(str1, "");
                 if (str2.equals("")) {
                     return str1;
                 } else {
                     return str2;
                 }
             } 
              return "";
         }
       
     }
}
