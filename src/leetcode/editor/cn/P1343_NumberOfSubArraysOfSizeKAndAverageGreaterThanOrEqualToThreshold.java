package leetcode.editor.cn;

public class P1343_NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0, sum = 0;
        for (int i = 0; i < arr.length; i ++) {
            sum += arr[i];
            if (i < k - 1) continue;
            if (sum / k >= threshold)
                cnt ++;
            sum -= arr[i - k + 1];
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}