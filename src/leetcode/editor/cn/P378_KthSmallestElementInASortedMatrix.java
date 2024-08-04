package leetcode.editor.cn;

public class P378_KthSmallestElementInASortedMatrix {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int kthSmallest(int[][] nums, int k) {
        int n = nums.length;
        int len = n * n;
        int l = nums[0][0], r = nums[n-1][n-1];
        while (l < r) {
            int mid = l + r >> 1;
            int cnt = 0;
            for (int i = 0; i < len; i ++)
                if (nums[i/n][i%n] <= mid)
                    cnt ++;
            if (cnt >= k)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}