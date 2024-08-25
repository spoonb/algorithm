package leetcode.editor.cn;

import java.util.*;

public class P438_FindAllAnagramsInAString {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) {
            return res;
        }
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for (int i = 0; i < pLen; i++) {
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sArr, pArr)) {
            res.add(0);
        }
        for (int i = 0; i < sLen - pLen; i++) {
            sArr[s.charAt(i) - 'a']--;
            sArr[s.charAt(i + pLen) - 'a']++;
            if (Arrays.equals(sArr, pArr)) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}