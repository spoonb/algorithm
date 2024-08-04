package leetcode.editor.cn;

public class P275_HIndexIi {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hIndex(int[] cits) {
        int len = cits.length;
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (cits[mid] >= len - mid)
                r = mid;
            else
                l = mid + 1;
        }
        return Math.min(cits[l], len - l);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}