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
            /*
                使用移动小的那个
                原因：l+1或者r-1有可能更大，虽然r-l变小，但h'(min[l,r])*(r-l)会更大。
                例如：3*7 < 4*6
             */
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