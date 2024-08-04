package leetcode.editor.cn;

public class P154_FindMinimumInRotatedSortedArrayIi {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] < nums[r])
                r = mid;
            else if (nums[mid] > nums[r])
                l = mid + 1;
            else
                r --;
        }
        return nums[l];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}