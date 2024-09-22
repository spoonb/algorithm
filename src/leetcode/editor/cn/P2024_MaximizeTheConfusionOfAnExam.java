package leetcode.editor.cn;

public class P2024_MaximizeTheConfusionOfAnExam {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxConsecutiveAnswers(String key, int k) {
        return Math.max(
                maxContinuousChar(key, k, 'T'),
                maxContinuousChar(key, k, 'F')
        );
    }

    private int maxContinuousChar(String key, int k, char c) {
        int l = 0, r = 0;
        int res = 0;
        while (r < key.length()) {
            char rc = key.charAt(r);
            if (rc != c) k --;
            while (k < 0) {
                char lc = key.charAt(l);
                if (lc != c) k ++;
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