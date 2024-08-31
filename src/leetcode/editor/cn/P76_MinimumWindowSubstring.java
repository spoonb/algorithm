package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P76_MinimumWindowSubstring {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> sMap = new HashMap<>();
        int start = -1, end = s.length();
        for (int i = 0, j = 0; j < s.length(); j++) {
            sMap.put(s.charAt(j), sMap.getOrDefault(s.charAt(j), 0) + 1);
            while (i <= j && check(tMap, sMap)) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) - 1);
                if (start == -1 || end - start + 1 > j - i + 1) {
                    start = i;
                    end = j;
                }
                i ++;
            }
        }
        return start == -1 ? "" : s.substring(start, end + 1);
    }

    // 用迭代器比使用t字符串循环匹配效率更高，不知道为啥。。。
    private boolean check(Map<Character, Integer> tMap, Map<Character, Integer> sMap) {
        Iterator<Map.Entry<Character, Integer>> iterator = tMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            Character key = next.getKey();
            Integer value = next.getValue();
            if (sMap.getOrDefault(key, 0) < value) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}