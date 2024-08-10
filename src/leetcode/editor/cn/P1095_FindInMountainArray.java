package leetcode.editor.cn;

public class P1095_FindInMountainArray {
    
//leetcode submit region begin(Prohibit modification and deletion)

// This is MountainArray's API interface.
// You should not implement it, or speculate about its implementation
interface MountainArray {
    public int get(int index);
    public int length();
}
// 上述interface提交时请注释(只是为了不编译报错而已)

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int i = 0, j = topMountain(mountainArr), k = mountainArr.length() - 1;
        while (i < j) {
            int mid = i + j >> 1;
            if (mountainArr.get(mid) >= target)
                j = mid;
            else
                i = mid + 1;
        }
        while (j < k) {
            int mid = j + k >> 1;
            if (mountainArr.get(mid) <= target)
                k = mid;
            else
                j = mid + 1;
        }
        if (mountainArr.get(i) == target)
            return i;
        else if (mountainArr.get(j) == target)
            return j;
        return -1;
    }

    private int topMountain(MountainArray mountainArr) {
        int l = 0, r = mountainArr.length() - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}