package leetcode.editor.cn;

public class P1300_SumOfMutatedArrayClosestToTarget {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findBestValue(int[] arr, int target) {
        int l = 0, r = 0;
        int res = 0;
        int diff = Integer.MAX_VALUE;
        for (int i : arr) {
            r = Math.max(r, i);
            res += i;
        }
        while (l <= r) {
            int mid = l + r >> 1;
            int sum = sumByValue(arr, mid);
            int abs = Math.abs(sum - target);
            if (abs < diff || (abs == diff && mid < res)){
                res = mid;
                diff = abs;
            }

            if (sum < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    private int sumByValue(int[] arr, int value) {
        int sum = 0;
        for (int i : arr) {
            sum += Math.min(i, value);
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}