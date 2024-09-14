package leetcode.editor.cn;

public class P1423_MaximumPointsYouCanObtainFromCards {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0, len = cardPoints.length;
        for (int cardPoint : cardPoints) {
            total += cardPoint;
        }
        int sum = 0;
        for (int i = 0; i < len - k; i ++) {
            sum += cardPoints[i];
        }
        int res = total - sum;
        for (int i = len - k; i < len; i ++) {
            sum += cardPoints[i] - cardPoints[i - (len - k)];
            res = Math.max(res, total - sum);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}