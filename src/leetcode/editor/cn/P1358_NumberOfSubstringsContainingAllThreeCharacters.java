package leetcode.editor.cn;

import java.util.HashMap;

public class P1358_NumberOfSubstringsContainingAllThreeCharacters {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char cr = s.charAt(r);
            map.put(cr, map.getOrDefault(cr, 0) + 1);
            while (map.get(s.charAt(l)) > 1) {
                char cl = s.charAt(l);
                map.put(cl, map.get(cl) - 1);
                if (map.get(cl) == 0)
                    map.remove(cl);
                l ++;
            }
            if (map.size() == 3)
                res += l + 1;
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}