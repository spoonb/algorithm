package leetcode.editor.cn;

public class P35_SearchInsertPosition {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int last = nums.length - 1;
        int l = 0, r = last;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        if (l != last || nums[l] >= target)
            return l;
        return l + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}