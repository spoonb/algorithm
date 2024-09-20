package leetcode.editor.cn;

import java.util.HashMap;

public class P3090_MaximumLengthSubstringWithTwoOccurrences {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0, r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        while (r < s.length()) {
            char cr = s.charAt(r);
            while (map.getOrDefault(cr, 0) >= 2) {
                char cl = s.charAt(l ++);
                map.put(cl, map.get(cl) - 1);
            }
            map.put(cr, map.getOrDefault(cr, 0) + 1);
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}