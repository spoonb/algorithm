package leetcode.editor.cn;

public class P172_FactorialTrailingZeroes {
    
//leetcode submit region begin(Prohibit modification and deletion)
/*
方法二：
解析见
https://leetcode.cn/problems/factorial-trailing-zeroes/solutions/1360892/jie-cheng-hou-de-ling-by-leetcode-soluti-1egk/
中的【方法二：优化计算】
 */
class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while ((n /= 5) > 0)
            cnt += n;
        return cnt;
    }
}

/*
方法一：本质就是从1到n计算每个数可以除尽多少个5
为啥是5？因为只有质因子中的2和5可以组合成10，
因数中存在10才会是的数的末尾存在0，因数中10的数量即为尾0的数量
那么为啥是5而不是2呢？因为在1到n中，5的倍数的数量为n/5(下取整),
而2的倍数则是n/2,2<5所以n/2>n/5，所以使用5来计算尾零

详情见
https://leetcode.cn/problems/factorial-trailing-zeroes/solutions/1360892/jie-cheng-hou-de-ling-by-leetcode-soluti-1egk/
中的【方法一：数学】
 */
//class Solution {
//    public int trailingZeroes(int n) {
//        int l = 5, r = n;
//        int cnt = 0;
//        while (l <= r) {
//            int tmp = l;
//            while (tmp % 5 == 0) {
//                tmp /= 5;
//                cnt ++;
//            }
//            l ++;
//        }
//        return cnt;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

}