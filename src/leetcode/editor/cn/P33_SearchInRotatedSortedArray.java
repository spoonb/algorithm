package leetcode.editor.cn;

public class P33_SearchInRotatedSortedArray {

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int l = offSearch(nums); // 虚拟数列头（偏移后）
        int r = len - 1 + l; // 虚拟数列尾（偏移后）
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid % len] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        if (nums[l % len] != target) return -1;
        return l % len;
    }

    // 数列偏移量
    private int offSearch(int[] nums) {
        int val = nums.length - 1;
        int l = 0, r = val;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] < nums[val])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}