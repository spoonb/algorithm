package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P986_IntervalListIntersections {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0)
            return new int[0][0];
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            int[] first = firstList[i];
            int[] second = secondList[j];
            if (first[1] < second[0]) {
                i ++;
            } else if (second[1] < first[0]) {
                j ++;
            } else if (first[1] >= second[0] && first[1] <= second[1]) {
                if (first[0] >= second[0] && first[0] <= second[1]) {
                    result.add(new int[] {first[0], first[1]});
                } else {
                    result.add(new int[] {second[0], first[1]});
                }
                i ++;
            } else if (second[1] >= first[0] && second[1] <= first[1]) {
                if (second[0] >= first[0] && second[0] <= first[1]) {
                    result.add(new int[] {second[0], second[1]});
                } else {
                    result.add(new int[] {first[0], second[1]});
                }
                j ++;
            }
        }
        return result.toArray(new int[0][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}