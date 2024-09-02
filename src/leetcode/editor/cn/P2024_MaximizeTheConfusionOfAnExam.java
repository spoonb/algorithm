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
        int cnt = 0, res = 0;
        while (r < key.length()) {
            if (c != key.charAt(r)) {
                while (cnt == k) {
                    if (c != key.charAt(l ++)) {
                        cnt --;
                    }
                }
                cnt ++;
            }
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}