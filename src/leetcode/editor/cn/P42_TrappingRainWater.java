package leetcode.editor.cn;

public class P42_TrappingRainWater {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int maxL = 0, maxR = 0;
        int res = 0;
        while (l < r) {
            maxL = Math.max(maxL, height[l]);
            maxR = Math.max(maxR, height[r]);
            res += maxL - height[l] + maxR - height[r];
            if (maxL <= maxR)
                l ++;
            else
                r --;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}