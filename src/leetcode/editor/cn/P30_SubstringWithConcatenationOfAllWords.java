package leetcode.editor.cn;

import java.util.*;

public class P30_SubstringWithConcatenationOfAllWords {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int sl = s.length(), m = words.length, n = words[0].length();
        for (int i = 0; i < n; i ++) {
            if (i + m * n > sl) break;
            Map<String, Integer> map = new HashMap<>();
            for (int j = i; j < i + m * n; j += n) {
                String str = s.substring(j, j + n);
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) - 1);
                if (map.get(word) == 0)
                    map.remove(word);
            }
            if (map.isEmpty()) res.add(i);
            for (int j = i + n; j <= sl - m * n; j += n) {
                String str = s.substring(j + (m - 1) * n, j + m * n);
                map.put(str, map.getOrDefault(str, 0) + 1);
                if (map.get(str) == 0) map.remove(str);
                str = s.substring(j - n, j);
                map.put(str, map.getOrDefault(str, 0) - 1);
                if (map.get(str) == 0) map.remove(str);
                if (map.isEmpty()) res.add(j);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}