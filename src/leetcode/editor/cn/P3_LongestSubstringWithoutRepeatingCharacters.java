package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class P3_LongestSubstringWithoutRepeatingCharacters {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        Set<Object> exist = new HashSet<>();
        int res = 0;
        while (r < s.length()) {
            while (exist.contains(s.charAt(r))) {
                exist.remove(s.charAt(l ++));
            }
            exist.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}