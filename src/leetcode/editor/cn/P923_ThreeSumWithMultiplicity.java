package leetcode.editor.cn;

import java.util.Arrays;

public class P923_ThreeSumWithMultiplicity {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1, r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] < target) {
                    l ++;
                } else if (arr[i] + arr[l] + arr[r] > target) {
                    r --;
                } else {
                    if (arr[l] == arr[r]) {
                        res += (r - l + 1) * (r - l) / 2;
                        res %= 1000000007;
                        break;
                    }
                    int cntL = 0, cntR = 0;
                    int curL = arr[l], curR = arr[r];
                    while (curL == arr[l]) {
                        cntL++;
                        l ++;
                    }
                    while (curR == arr[r]) {
                        cntR++;
                        r --;
                    }
                    res += cntL * cntR;
                    res %= 1000000007;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}