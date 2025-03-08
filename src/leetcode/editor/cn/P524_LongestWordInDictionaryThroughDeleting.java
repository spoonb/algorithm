package leetcode.editor.cn;

import java.util.Collections;
import java.util.List;

public class P524_LongestWordInDictionaryThroughDeleting {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        String res = "";
        for (int k = 0; k < dictionary.size(); k ++) {
            String cur = dictionary.get(k);
            if (cur.length() > s.length()) continue;
            if (cur.length() <= res.length()) continue;
            int i = 0, j = 0;
            while (i < cur.length() && j < s.length()) {
                if (cur.charAt(i) == s.charAt(j))
                    i ++;
                j ++;
            }
            if (i >= cur.length())
                res = cur;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}