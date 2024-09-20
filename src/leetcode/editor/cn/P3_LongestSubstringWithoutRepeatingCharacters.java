package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class P3_LongestSubstringWithoutRepeatingCharacters {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
            while (set.contains(s.charAt(r)))
                set.remove(s.charAt(l ++));
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}