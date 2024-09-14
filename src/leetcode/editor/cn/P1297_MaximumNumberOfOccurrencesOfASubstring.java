package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P1297_MaximumNumberOfOccurrencesOfASubstring {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = minSize; i <= s.length(); i ++) {
            String sub = s.substring(i - minSize, i);
            if (count(sub) <= maxLetters) {
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                res = Math.max(res, map.get(sub));
            }
        }
        return res;
    }

    private int count(String sub) {
        Set<Character> set = new HashSet<>();
        for (char c : sub.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}