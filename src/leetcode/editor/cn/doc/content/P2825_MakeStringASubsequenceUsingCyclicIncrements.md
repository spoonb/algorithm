<p>给你一个下标从 <strong>0</strong>&nbsp;开始的字符串&nbsp;<code>str1</code> 和&nbsp;<code>str2</code>&nbsp;。</p>

<p>一次操作中，你选择&nbsp;<code>str1</code>&nbsp;中的若干下标。对于选中的每一个下标&nbsp;<code>i</code>&nbsp;，你将&nbsp;<code>str1[i]</code>&nbsp;<strong>循环</strong>&nbsp;递增，变成下一个字符。也就是说&nbsp;<code>'a'</code>&nbsp;变成&nbsp;<code>'b'</code>&nbsp;，<code>'b'</code> 变成&nbsp;<code>'c'</code>&nbsp;，以此类推，<code>'z'</code> 变成&nbsp;<code>'a'</code>&nbsp;。</p>

<p>如果执行以上操作 <strong>至多一次</strong>&nbsp;，可以让 <code>str2</code>&nbsp;成为 <code>str1</code>&nbsp;的子序列，请你返回 <code>true</code>&nbsp;，否则返回 <code>false</code>&nbsp;。</p>

<p><b>注意：</b>一个字符串的子序列指的是从原字符串中删除一些（可以一个字符也不删）字符后，剩下字符按照原本先后顺序组成的新字符串。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<pre>
<b>输入：</b>str1 = "abc", str2 = "ad"
<b>输出：</b>true
<b>解释：</b>选择 str1 中的下标 2 。
将 str1[2] 循环递增，得到 'd' 。
因此，str1 变成 "abd" 且 str2 现在是一个子序列。所以返回 true 。</pre>

<p><strong class="example">示例 2：</strong></p>

<pre>
<b>输入：</b>str1 = "zc", str2 = "ad"
<b>输出：</b>true
<b>解释：</b>选择 str1 中的下标 0 和 1 。
将 str1[0] 循环递增得到 'a' 。
将 str1[1] 循环递增得到 'd' 。
因此，str1 变成 "ad" 且 str2 现在是一个子序列。所以返回 true 。</pre>

<p><strong class="example">示例 3：</strong></p>

<pre>
<b>输入：</b>str1 = "ab", str2 = "d"
<b>输出：</b>false
<b>解释：</b>这个例子中，没法在执行一次操作的前提下，将 str2 变为 str1 的子序列。
所以返回 false 。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= str1.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>1 &lt;= str2.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>str1</code>&nbsp;和&nbsp;<code>str2</code>&nbsp;只包含小写英文字母。</li> 
</ul>

<div><div>Related Topics</div><div><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 13</li><li>👎 0</li></div>