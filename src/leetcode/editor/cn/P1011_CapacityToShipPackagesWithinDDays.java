package leetcode.editor.cn;

public class P1011_CapacityToShipPackagesWithinDDays {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int weight : weights) {
            l = Math.max(l, weight);
            r += weight;
        }
        while (l < r) {
            int mid = l + r >> 1;
            if (cnt(weights, mid) <= days)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int cnt(int[] weights, int mid) {
        int count = 1;
        int sum = 0;
        for (int weight : weights) {
            if ((sum += weight) > mid) {
                count ++;
                sum = weight;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}