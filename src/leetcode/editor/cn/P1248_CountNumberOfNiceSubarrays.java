package leetcode.editor.cn;

public class P1248_CountNumberOfNiceSubarrays {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l = 0, r = 0;
        int res = 0, cnt = 0;
        while (r < nums.length) {
            if ((nums[r ++] & 1) == 1) {
                cnt ++;
            }
            if (cnt == k) {
                int cntR = 0; // 统计窗口右边到下一个奇数之间偶数的个数
                while (r < nums.length && (nums[r] & 1) == 0) {
                    r ++;
                    cntR ++;
                }
                int cntL = 0; // 统计窗口左边到下一个奇数之间偶数的个数
                while (l <= r && (nums[l] & 1) == 0) {
                    l ++;
                    cntL ++;
                }
                res += (cntR + 1) * (cntL + 1);
                l ++; // 从窗口中移除第一个奇数
                cnt --;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}