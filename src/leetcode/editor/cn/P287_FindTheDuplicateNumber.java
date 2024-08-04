package leetcode.editor.cn;

public class P287_FindTheDuplicateNumber {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            int cnt = 0;
            for (int i = 0; i < nums.length; i ++)
                if (mid >= nums[i])
                    cnt ++;
            if (cnt > mid)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}