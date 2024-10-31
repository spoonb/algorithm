package leetcode.editor.cn;

import java.util.Arrays;

public class PLCP_18_TwoVYnGI {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int i = 0, j = drinks.length - 1;
        int res = 0;
        while (i < staple.length && j >= 0) {
            if (staple[i] + drinks[j] > x) {
                j --;
            } else {
                res = (res + j + 1) % 1000000007;
                i ++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}