package leetcode.editor.cn;

public class P2079_WateringPlants {
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int i = 0, cur = capacity, res = 0;
        while (i < plants.length) {
            if (plants[i] > cur) {
                cur = capacity;
                res += 2 * i + 1;
            } else {
                res ++;
            }
            cur -= plants[i ++];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}