package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P1237_FindPositiveIntegerSolutionForAGivenEquation {
    
//leetcode submit region begin(Prohibit modification and deletion)
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 */

interface CustomFunction {
    // Returns f(x, y) for any given positive integers x and y.
    // Note that f(x, y) is increasing with respect to both x and y.
    // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
    int f(int x, int y);
};


class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int x = 1; x <= 1000; x ++) {
            int l = 1, r = 1000;
            while (l < r) {
                int mid = l + r >> 1;
                if (customfunction.f(x, mid) >= z)
                    r = mid;
                else
                    l = mid + 1;
            }
            if (customfunction.f(x, l) == z)
                res.add(List.of(x, l));
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}