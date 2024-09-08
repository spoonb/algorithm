
package leetcode.editor.cn;

public class P2379_MinimumRecolorsToGetKConsecutiveBlackBlocks {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int cnt = 0, res = Integer.MAX_VALUE;
        for (int i = 0, j = 0; j < blocks.length(); j++) {
            if (blocks.charAt(j) == 'W') cnt ++;
            if (j < k - 1) continue;
            res = Math.min(res, cnt);
            if (blocks.charAt(i ++) == 'W') cnt --;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}