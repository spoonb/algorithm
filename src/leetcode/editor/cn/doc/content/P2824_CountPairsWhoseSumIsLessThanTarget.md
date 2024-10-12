给你一个下标从 <strong>0</strong>&nbsp;开始长度为 <code>n</code>&nbsp;的整数数组&nbsp;<code>nums</code>&nbsp;和一个整数&nbsp;<code>target</code>&nbsp;，请你返回满足&nbsp;<code>0 &lt;= i &lt; j &lt; n</code> 且 <code>nums[i] + nums[j] &lt; target</code>&nbsp;的下标对&nbsp;<code>(i, j)</code>&nbsp;的数目。

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<pre>
<b>输入：</b>nums = [-1,1,2,3,1], target = 2
<b>输出：</b>3
<b>解释：</b>总共有 3 个下标对满足题目描述：
- (0, 1) ，0 &lt; 1 且 nums[0] + nums[1] = 0 &lt; target
- (0, 2) ，0 &lt; 2 且 nums[0] + nums[2] = 1 &lt; target 
- (0, 4) ，0 &lt; 4 且 nums[0] + nums[4] = 0 &lt; target
注意 (0, 3) 不计入答案因为 nums[0] + nums[3] 不是严格小于 target 。
</pre>

<p><strong class="example">示例 2：</strong></p>

<pre>
<b>输入：</b>nums = [-6,2,5,-2,-7,-1,3], target = -2
<b>输出：</b>10
<b>解释：</b>总共有 10 个下标对满足题目描述：
- (0, 1) ，0 &lt; 1 且 nums[0] + nums[1] = -4 &lt; target
- (0, 3) ，0 &lt; 3 且 nums[0] + nums[3] = -8 &lt; target
- (0, 4) ，0 &lt; 4 且 nums[0] + nums[4] = -13 &lt; target
- (0, 5) ，0 &lt; 5 且 nums[0] + nums[5] = -7 &lt; target
- (0, 6) ，0 &lt; 6 且 nums[0] + nums[6] = -3 &lt; target
- (1, 4) ，1 &lt; 4 且 nums[1] + nums[4] = -5 &lt; target
- (3, 4) ，3 &lt; 4 且 nums[3] + nums[4] = -9 &lt; target
- (3, 5) ，3 &lt; 5 且 nums[3] + nums[5] = -3 &lt; target
- (4, 5) ，4 &lt; 5 且 nums[4] + nums[5] = -8 &lt; target
- (4, 6) ，4 &lt; 6 且 nums[4] + nums[6] = -4 &lt; target
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length == n &lt;= 50</code></li> 
 <li><code>-50 &lt;= nums[i], target &lt;= 50</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>二分查找</li><li>排序</li></div></div><br><div><li>👍 62</li><li>👎 0</li></div>