package leetcode.editor.cn;

public class P162_FindPeakElement {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + r >> 1;
            if (mid <= 0 || nums[mid] > nums[mid -  1])
                if (mid >= len - 1 || nums[mid] > nums[mid + 1])
                    return mid;
                else
                    l = mid + 1;
            else if (mid >= len - 1 || nums[mid] > nums[mid + 1])
                if (mid <= 0 || nums[mid] > nums[mid - 1])
                    return mid;
                else
                    r = mid - 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}