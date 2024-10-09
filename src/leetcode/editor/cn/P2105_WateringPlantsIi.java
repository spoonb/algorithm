package leetcode.editor.cn;

public class P2105_WateringPlantsIi {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int l = 0, r = plants.length - 1;
        int a = capacityA, b = capacityB;
        int res = 0;
        while (l < r) {
            if (plants[l] > a) {
                a = capacityA;
                res ++;
            }
            if (plants[r] > b) {
                b = capacityB;
                res ++;
            }
            a -= plants[l];
            b -= plants[r];
            l ++;
            r --;
        }
        if (l == r) {
            if (a >= b) {
                if (plants[l] > a) {
                    res ++;
                }
            } else {
                if (plants[l] > b) {
                    res ++;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}