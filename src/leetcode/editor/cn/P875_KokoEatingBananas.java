package leetcode.editor.cn;

import java.util.Arrays;

public class P875_KokoEatingBananas {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        while (l < r) {
            int mid = (l + r) / 2;
            if (eat(piles, mid) <= h)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int eat(int[] piles, int mid) {
        int cnt = 0;
        for (int pile : piles) {
            cnt += (pile - 1) / mid + 1;
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}