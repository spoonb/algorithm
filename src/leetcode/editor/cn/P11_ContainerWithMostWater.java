package leetcode.editor.cn;

public class P11_ContainerWithMostWater {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            res = Math.max(res, h * (r - l));
            if (height[l] <= height[r])
                l ++;
            else
                r --;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}