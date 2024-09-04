package leetcode.editor.cn;

public class P1343_NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0, sum = 0;
        for (int i = 0; i < k; i ++)
            sum += arr[i];
        if (sum / k >= threshold) cnt ++;
        for (int i = k; i < arr.length; i ++) {
            sum += arr[i] - arr[i - k];
            if (sum / k >= threshold)
                cnt ++;
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}