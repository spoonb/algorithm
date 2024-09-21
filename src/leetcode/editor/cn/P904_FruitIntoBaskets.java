package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class P904_FruitIntoBaskets {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0)
                    map.remove(fruits[l]);
                l ++;
            }
            res = Math.max(res, r - l + 1);
            r ++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}