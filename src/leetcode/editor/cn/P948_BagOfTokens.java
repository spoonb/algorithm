package leetcode.editor.cn;

import java.util.Arrays;

public class P948_BagOfTokens {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0, r = tokens.length - 1;
        int res = 0, cnt = 0;
        while (l <= r) {
            if (tokens[l] <= power) {
                power -= tokens[l ++];
                cnt ++;
            } else if (cnt > 0) {
                power += tokens[r --];
                cnt --;
            } else {
                break;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}