package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P1023_CamelcaseMatching {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for (int k = 0; k < queries.length; k ++) {
            String cur = queries[k];
            int i = 0, j = 0;
            while (i < cur.length() && j < pattern.length()) {
                if (cur.charAt(i) < 97) {
                    if (cur.charAt(i) != pattern.charAt(j))
                        break;
                    j ++;
                } else if (cur.charAt(i) == pattern.charAt(j))
                    j ++;
                i ++;
            }
            if (j < pattern.length())
                res.add(false);
            else {
                res.add(checkUpper(cur.substring(i)));
            }
        }
        return res;
    }

    private boolean checkUpper(String str) {
        char[] cs = str.toCharArray();
        for (char c : cs) {
            if (c < 97)
                return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}