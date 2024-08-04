package leetcode.editor.cn;

public class P786_KThSmallestPrimeFraction {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double l = 0.0, r = 1.0;
        while (true) {
            double mid = (l + r) / 2;
            int cnt = 0;
            int x = 0, y = 1;
            for (int i = 0, j = 1; j < arr.length; j ++) {
                while ((double) arr[i] / arr[j] < mid) {
                    if (arr[i] * y > arr[j] * x) {
                        x = arr[i];
                        y = arr[j];
                    }
                    i ++;
                }
                cnt += i;
            }
            if (cnt == k)
                return new int[]{x, y};
            else if (cnt < k)
                l = mid;
            else
                r = mid;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}