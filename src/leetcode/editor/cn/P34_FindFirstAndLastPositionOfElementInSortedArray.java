package leetcode.editor.cn;

public class P34_FindFirstAndLastPositionOfElementInSortedArray {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1,-1};
        int l = left(nums, target);
        int r = right(nums, target);
        return new int[]{l, r};
    }

    private int left(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        if (nums[l] != target) return -1;
        return l;
    }

    private int right(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (nums[mid] <= target)
                l = mid;
            else
                r = mid - 1;
        }
        if (nums[l] != target) return -1;
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}