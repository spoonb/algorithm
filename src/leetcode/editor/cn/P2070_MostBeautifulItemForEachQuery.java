package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2070_MostBeautifulItemForEachQuery {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        for (int i = 1; i < items.length; i ++) {
            items[i][1] = Math.max(items[i - 1][1], items[i][1]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i ++) {
            int target = queries[i];
            int l = 0, r = items.length - 1;
            while (l < r) {
                int m = (l + r + 1) >> 1;
                if (items[m][0] <= target)
                    l = m;
                else
                    r = m - 1;
            }
            if (items[l][0] <= target)
                result.add(items[l][1]);
            else
                result.add(0);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}