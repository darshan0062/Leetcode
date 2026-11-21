import java.util.*;

class Solution {
    public String removeStars(String s) {
        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                ss.deleteCharAt(ss.length() - 1);
            } else {
                ss.append(ch);
            }
        }

        return ss.toString();
    }
}