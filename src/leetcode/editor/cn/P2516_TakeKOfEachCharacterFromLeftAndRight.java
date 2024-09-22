package leetcode.editor.cn;

public class P2516_TakeKOfEachCharacterFromLeftAndRight {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int takeCharacters(String s, int k) {
        int[] total = new int[3];
        for (char c : s.toCharArray()) {
            total[c - 'a'] ++;
        }
        for (int i : total) {
            if (i < k) return -1;
        }
        int l = 0, r = 0, res = 0;
        int[] cur = new int[3];
        while (r < s.length()) {
            cur[s.charAt(r) - 'a'] ++;
            while (cur[s.charAt(r) - 'a'] > total[s.charAt(r) - 'a'] - k) {
                cur[s.charAt(l) - 'a'] --;
                l ++;
            }
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}