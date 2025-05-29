package com.algorithm;

import java.util.*;

/**
 * 集合类的算法类
 */
public class AlgorithmAboutCollection {

    public static void main(String[] args) {

        // 力扣算法 4：两个正序数组的合并数组的中位数
        // int[] numArr1 = {1,4};
        // int[] numArr2 = {2,3,6};
        // System.out.println(getMidNumFromTwoArray(numArr1,numArr2));

        // 力扣算法 2.0：两个倒序整数链表求和
        // 创建第一个链表表示数字 342
        // LinkedList<Integer> l1 = new LinkedList<>();
        // l1.add(2);
        // l1.add(4);
        // l1.add(3);
        // // 创建第二个链表表示数字 4465
        // LinkedList<Integer> l2 = new LinkedList<>();
        // l2.add(5);
        // l2.add(6);
        // l2.add(4);
        // l2.add(4);
        // LinkedList<Integer> result = addTwoNumbers(l1, l2);
        // // 打印结果链表
        // for (int num : result) {
        //     System.out.print(num + " ");
        // }
        // 力扣算法 2.1：两个倒序整数自定义链表求和
        // 自定义链表1
        // ListNode ln1 = new ListNode(3);
        // ListNode curr = ln1;
        // curr.next = new ListNode(2);
        // // 移动指针，在链表最后添加元素
        // curr = curr.next;
        // curr.next = new ListNode(2);
        // // 自定义链表2
        // ListNode ln2 = new ListNode(4);
        // curr = ln2;
        // curr.next = new ListNode(8);
        // // 移动指针，在链表最后添加元素
        // curr = curr.next;
        // curr.next = new ListNode(1);
        // // 求两个倒序自定义链表之和
        // ListNode resultNode = addTwoNumbers(ln1,ln2);
        // // 打印结果链表内容
        // while(resultNode!=null){
        //     System.out.print(resultNode.val + " ");
        //     resultNode = resultNode.next;
        // }

        // 力扣算法.11 盛最多水的容器
        // int[] height = {1,5,6,7,5,4,3};
        // int area = calcAreaByHeighArrByDs(height);
        // System.out.println(area);

        // 力扣算法.15 三数之和
        // int[] intArr = {-1,0,1,2,-1,-4};
        // List<List<Integer>> resArr = getZeroArrByArrByDs(intArr);

        // 力扣算法.53 最大子数组和
        // 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
        // System.out.println(getMaxTotalFromIntArr(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        // 力扣算法.56 合并区间
        // 传入一个二维数组，内层数组都是两个整数元素，且内层数组的第一个整数元素都比第二个元素大，此为区间数组
        // 返回一个二维数组，为内层数组覆盖部分合并起来
        // int[][] reArr = mergeIntervalArr(new int[][]{{1,3},{2,6},{8,10}});
        // int[][] reArr = mergeIntervalArr(new int[][]{{1,10},{2,3},{4,5}});
        // for(int[] a:reArr){
        //     for(int b :a){
        //         System.out.print(b+" ");
        //     }
        //     System.out.println();
        // }

        // 力扣算法.83-1 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
        // LinkedList<Integer> l1 = new LinkedList<>();
        // l1.add(1);
        // l1.add(1);
        // l1.add(2);
        // l1.add(3);
        // l1.add(3);
        // LinkedList<Integer> reLi = deleteDuplicateItemFromList(l1);
        // for(int i:reLi){
        //     System.out.print(i+" ");
        // }
        // 力扣算法.83-2 改为自定义链表1
        // ListNode ln1 = new ListNode(1);
        // ListNode ln2 = new ListNode();
        // ListNode curr = ln1;
        // curr.next = new ListNode(1);
        // curr = curr.next;
        // curr.next = new ListNode(2);
        // curr = curr.next;
        // curr.next = new ListNode(3);
        // curr = curr.next;
        // curr.next = new ListNode(3);
        // curr = deleteDuplicateItemFromListNode(ln2);
        // System.out.println(curr.val);
        // while(curr.next != null){
        //     System.out.print(curr.next.val+" ");
        //     curr = curr.next;
        // }

        // 力扣算法206. 反转链表：自定义链表，通过构造方法迭代，或者通过递归
        // ListNode ln1 = new ListNode(2);
        // ListNode curr = ln1;
        // curr.next = new ListNode(1);
        // curr = curr.next;
        // curr.next = new ListNode(2);
        // curr = curr.next;
        // curr.next = new ListNode(3);
        // curr = curr.next;
        // curr.next = new ListNode(3);
        // curr = reverseList(ln1);
        // while(curr!=null){
        //     System.out.print(curr.val+" ");
        //     curr = curr.next;
        // }

        // 力扣算法283.给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
        // 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
        // 解法：不复制数组，限制不能用list存储非零元素，但是可以用双指针，一个遍历数组，一个记录非零元素下标，只需要把非零元素前移，后面全部零即可
        // moveZeroes(new int[]{1,3,2,0,0,14,0,3});
        // moveZeroes(new int[]{0,1,0,3,12});
        // moveZeroes(new int[]{0,0,0,1});

        // 力扣算法238.除自身以外数组的乘积
        // 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
        // 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
        // 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
        // 解法：使用 前缀积 和 后缀积 的方法，遍历两次n，时间复杂度为O(2N)，忽略常数2，仍然是O(N)复杂度！
        // int[] answer = productExceptSelf(new int[] {1,3,4,5});
        //
        // for (int j : answer) {
        //     System.out.print(j + " ");
        // }

        // 力扣算法207.课程表
        // 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
        // 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
        // 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
        // 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
        // 解法：广度优先搜索，通过维护节点的入度表，逐步移除入度为0的节点（即无前置依赖的课程），若最终所有节点均被移除，则无环；否则存在环
        // boolean canF = canFinish(2,new int[][]{{1,2},{2,3},{3,4}});
        // boolean canF = canFinish(2,new int[][]{{1,0}});
        // boolean canF = canFinishByBFS(7,new int[][]{{1,0},{0,3},{0,2},{3,2},{2,5},{4,5},{5,6},{2,4}});
        // System.out.println(canF);

        // 力扣算法200.岛屿数量
        // 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
        // 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
        // 此外，你可以假设该网格的四条边均被水包围。
        // 使用深度优先搜索：遍历网格中的每个单元格，递归访问上下左右四个方向的单元格，若单元格是陆地，则改为水，避免重复访问！
        // 广度优先搜索：依然是使用queue+while循环，访问所有相连陆地的方式不同，但是同样要把访问过的单元格改为水；
        // char [][] grid1 = {
        //     {'1','1','1','1','0'},
        //     {'1','1','0','1','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','0','0','0'}
        // };
        // char [][] grid2 = {
        //         {'1','1','1','1','0'},
        //         {'1','1','0','1','0'},
        //         {'0','0','1','0','0'},
        //         {'0','0','0','1','1'}
        // };
        // int nums = numIslands(grid2);
        // System.out.println(nums);

        // 算法994.腐烂的橘子
        // 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
        // 值 0 代表空单元格；   1 代表新鲜橘子； 值 2 代表腐烂的橘子。
        // 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
        // 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
        // 解法：广度优先搜索，以腐烂橘子入队，每遍历一次所有腐烂橘子，时间就+1
        // 注意：for (int j = 0; j < size; j++) { //size不能直接改写成 queue.size()，如果for循环里有用offer，那这个size就一直会增加。。。
        // int result1 = orangesRottingByMyself(new int[][]{
        //     {2,1,1},
        //     {1,1,1},
        //     {0,1,2}
        // });
        // int result2 = orangesRotting(new int[][]{
        //     {2,1,1},
        //     {1,1,0},
        //     {1,0,0}
        // });
        // System.out.println(result1);

        // 算法46.全排列
        // 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
        // 解法：递归+回溯 回溯：每次到尽头就remove最后一位
        // List<List<Integer>> list = permute(new int[]{1,3,5});
        // for (List<Integer> li : list){
        //     for(Integer i : li){
        //         System.out.print(i+"");
        //     }
        //     System.out.println();
        // }

        // 算法78.子集
        // 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
        // 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
        // 解法：递归+回溯，与全排列解法不同之处在于：子集的长度不定，且都是有序数组
        // List<List<Integer>> result2 = subsets(new int[]{1,2,3});
        // for(List<Integer> li : result2){
        //     for(int i : li){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // 力扣算法169.多数元素
        // 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        // int re = majorityElement(new int[]{2,2,1,1,1,2,2});
        // 解法：一个计数hashmap搞定，arrylist的排序加取中间数更简单。
        // int re = majorityElement(new int[]{1});
        // System.out.println(re);

        // 算法48.旋转图像
        // 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
        // 解法：不依赖辅助数组的情况下，需要一次水平翻转和一次对角线翻转解决。
        // rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        // 算法240.搜索二维矩阵
        // 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。
        // 解法：Z字形查找，以右上角为初始比对基准，每次迭代，要么减少列数，要么增加行数，最多进行 m + n 次迭代。
        // boolean result1 = searchMatrix(new int[][]{
        //     {1,4,7,11,15},
        //     {2,5,8,12,19},
        //     {3,6,9,16,22},
        //     {10,13,14,17,24},
        //     {18,21,23,26,30}
        // },23);
        // System.out.println(result1);

        // 算法435.无重叠区间
        // 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。返回 需要移除区间的最小数量，使剩余区间互不重叠 。
        // 注意 只在一点上接触的区间是 不重叠的。例如 [1, 2] 和 [2, 3] 是不重叠的。
        // 解法：贪心策略：优先选择结束时间最早的区间，这样可以为后续区间留出更多空间，从而减少重叠的可能性。数组按结束时间排序。
        // System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
        // System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{1,2},{1,2}}));
        // System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{2,3}}));
        // System.out.println(eraseOverlapIntervals(new int[][]{{1,100},{11,22},{1,11},{2,12}}));

        // 算法49.字母异位词分组
        // 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
        // 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
        // 解法：将数组中每一个元素都排序，然后用hashmap判断是否该元素已存在。。。
        // List<List<String>> relist = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        // for(List<String> list : relist){
        //     for(String s : list){
        //         System.out.print(s);
        //     }
        //     System.out.println();
        // }

        // 算法160.相交链表
        // 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
        // 解法：hashmap能解，但空间复杂度为m（hashmap大小），双指针法更简单，没有新建数据结构，空间复杂度仅为1，核心要点在于拼接两个链表，
        // ListNode commNode = new ListNode(8);
        // commNode.next = new ListNode(4);
        // commNode.next.next = new ListNode(5);
        // ListNode lna = new ListNode(4);
        // lna.next = new ListNode(1);
        // lna.next.next = commNode;
        // ListNode lnb = new ListNode(5);
        // lnb.next = new ListNode(6);
        // lnb.next.next = new ListNode(1);
        // lnb.next.next.next = commNode;
        // ListNode firstCommNode = getIntersectionNode(lna,lnb);
        // System.out.println(firstCommNode.val);

        // 70.爬楼梯
        // 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
        // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
        // 解法：递归+回溯可解，但时间复杂度为n的阶乘，动态规划最优解，到n阶的方法数为到n-1阶的方法数加上到n-2阶的方法数，此为核心
        // System.out.println(climbStairs(0));

        // 121.买卖股票的最佳时机
        // 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
        // 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
        // 解法：贪心算法，局部求最优解，不回溯，不一定是全局最优，但此题中复杂度比动态规划更低
        // System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        // System.out.println(maxProfit(new int[]{7,6,4,8,1}));

        // 215.数组中的第k个最大元素
        // 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
        // 解法：数组排序时间复杂度 nlogn，堆处理为 n，offer为压入，poll为取出最小值，peek为只查不取出最小值
        // System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
        // System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));

        // 118.杨辉三角
        // 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
        // 解法：递推，隐含动态规划，由底向上推
        // List<List<Integer>> re = generate(5);
        // for (List<Integer> reL : re){
        //     for(Integer i : reL){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // 35.搜索插入位置
        // 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
        // 解法：二分解法：时间复杂度Ologn
        // System.out.println(searchInsert(new int[]{1,3,5,6},8));

        // 198.打家劫舍
        // 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
        // 解法：动态规划，局部最优解：每次偷窃实际只有两种选择，需比较此次对象与t-2和数之和，与t-1和数的大小，取其大者。
        // System.out.println(rob(new int[]{2,7,9,3,1}));
        // System.out.println(rob(new int[]{1,2,3,1}));
        // System.out.println(rob(new int[]{2,1,1,2}));

        // 141.环形链表
        // 给你一个链表的头节点 head ，判断链表中是否有环。
        // 解法：用Set结构比HashMap更适合，因为只需要判断key是否出现过，不需要存储key。快慢指针能降空间复杂度为1，但算法只能针对环形链表。
        // ListNode commNode = new ListNode(3);
        // commNode.next = new ListNode(2);
        // commNode.next.next = new ListNode(0);
        // commNode.next.next.next = new ListNode(-4);
        // commNode.next.next.next.next = commNode.next;
        // System.out.println(hasCycle(commNode));

        // 142.环形链表2
        // 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
        // 解法：快慢指针+数组推导（让 slow 回到 head，fast 留在相遇点，同步走 a 步，必然在环入口相遇。）
        // ListNode commNode = new ListNode(3);
        // commNode.next = new ListNode(2);
        // commNode.next.next = new ListNode(0);
        // commNode.next.next.next = new ListNode(-4);
        // commNode.next.next.next.next = commNode.next;
        // System.out.println(detectCycle(commNode).val);

        // 297.完全平方数
        // 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
        // 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
        // 解法：动态规划，构建一个 表示和为i的完全平方数的最少数量 的 数组。
        // System.out.println(numSquares(12));

        // 322.零钱兑换
        // 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
        // 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
        // 解法：动态规划，构建表示凑成金额i所需的最少硬币数 的数组
        // System.out.println(coinChange(new int[]{1,2,5},11));

        // 62.不同路径
        // 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
        // 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
        // 问总共有多少条不同的路径？
        // 解法：动态规划
        // System.out.println(uniquePaths(3,7));
        // System.out.println(uniquePaths(3,2));
        // System.out.println(uniquePaths(3,3));
        // System.out.println(uniquePaths(7,3));

        // 39.组合总和
        // 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。
        // 解法：递归回溯+剪枝
        // List<List<Integer>> re = combinationSum(new int[]{2,3,6,7},7);
        // for(List<Integer> rel : re){
        //     for(int i : rel){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // System.out.println(combinationSum(new int[]{2,3,6,7},7));

        // 74.检查二维矩阵
        // 给你一个满足下述两条属性的 m x n 整数矩阵：给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
        // 解法：Z字查找：从右上角开始，根据当前元素与 target 的大小关系向左或向下移动。时间复杂度：O(m+n)
        // System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3));

        // 136.只出现一次的数字
        // 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
        // 解法：异或位运算（XOR），时间复杂度O1，且不使用额外空间，比 HashSet 更快
        // 两个规律：任何数与自身异或结果为 0 ；任何数与 0 异或结果为自身
        // System.out.println(singleNumber(new int[]{2,2,1,1}));

        // 51.N皇后
        // n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
        // 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
        // 解法：递归+回溯
        // System.out.println(solveNQueens(4));

        // 55.跳跃游戏
        // 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
        // 解法：贪心算法获取最大达到位置
        // System.out.println(canJump(new int[]{2,3,1,1,4}));
        // System.out.println(canJump(new int[]{3,2,1,0,4}));

        // 75.颜色分类
        // 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地 对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
        // 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
        // 解法：两次遍历，双指针法可以一次遍历
        // sortColors(new int[]{2,0,2,1,1,0});
        // sortColors(new int[]{2,0,1});

        // 239.滑动窗口最大值
        // 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
        // int[] re = maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
        // // 解法：暴力破解，或者双端队列法，时间复杂度 O(n)，通过维护一个单调递减队列，队首始终是当前窗口的最大值
        // // int[] re = maxSlidingWindow(new int[]{1},1);
        // for (int i : re){
        //     System.out.print(i+" ");
        // }

        // 347.前k个高频元素
        // 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。.
        // 解法：最小堆（优先队列），hashMap转list排序也可以
        // int[] re = topKFrequent(new int[]{1,1,1,2,2,3},2);
        // for(int i : re ){
        //     System.out.print(i+" ");
        // }

        // 64.最小路径和
        // 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
        // 解法：标准的动态规划
        // System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
        // System.out.println(minPathSum(new int[][]{{1,2,3},{4,5,6}}));

        // 128.最长连续序列
        // 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
        // 解法：哈希集合保存和判断：for里有while，也是On，只要总次数不超过n即可。test
        // System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        // System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        // System.out.println(longestConsecutive(new int[]{1,0,1,2}));

        // 42.接雨水
        // 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
        // 解法：双指针法，记录左右两侧的最高柱
        // System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        // System.out.println(trap(new int[]{4,2,0,3,2,5}));

        // 21.合并两个有序链表
        // 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
        // 解法：迭代，新链表遍历两个旧链表
        // ListNode commNode = new ListNode(1);
        // commNode.next = new ListNode(2);
        // commNode.next.next = new ListNode(4);
        // ListNode commNode2 = new ListNode(1);
        // commNode2.next = new ListNode(3);
        // commNode2.next.next = new ListNode(4);
        // ListNode mergeN = mergeTwoLists(commNode,commNode2);
        // while(mergeN != null){
        //     System.out.print(mergeN.val+" ");
        //     mergeN = mergeN.next;
        // }

        // 19.删除链表的倒数第N个节点
        // 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
        // 解法：快慢双指针，快指针先走n步
        // ListNode commNode = new ListNode(1);
        // commNode.next = new ListNode(2);
        // commNode.next.next = new ListNode(3);
        // commNode.next.next.next = new ListNode(4);
        // commNode.next.next.next.next = new ListNode(5);
        // ListNode commNode1 = new ListNode(1);
        // commNode1.next = new ListNode(2);
        // ListNode ret = removeNthFromEnd(commNode,2);
        // while(ret != null){
        //     System.out.print(ret.val+" ");
        //     ret = ret.next;
        // }

        // 139.单词拆分
        // 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。如果可以利用字典中出现的一个或多个单词拼接出 s 则返回 true。
        // 解法：动态规划，数组表示字符串前i位能否被拆分
        // List<String> wordDict = new ArrayList<>();
        // wordDict.add("leet");
        // wordDict.add("code");
        // System.out.println(wordBreak("codeleet",wordDict));
        // List<String> wordDict1 = new ArrayList<>();
        // wordDict1.add("apple");
        // wordDict1.add("pen");
        // System.out.println(wordBreak("applepenapple",wordDict1));
        // List<String> wordDict2 = new ArrayList<>();
        // wordDict2.add("cats");
        // wordDict2.add("dog");
        // wordDict2.add("sand");
        // wordDict2.add("and");
        // wordDict2.add("cat");
        // System.out.println(wordBreak("catsandog",wordDict2));
        // List<String> wordDict3 = new ArrayList<>();
        // wordDict3.add("aa");
        // wordDict3.add("aaa");
        // System.out.println(wordBreak("aaaaaaa",wordDict3));

        // 34.在排序数组中查找元素出现的第一个和最后一个位置
        // 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
        // 解法：两次二分查找，第一次找到左边界，第二次找到右边界
        // int[] re = searchRange(new int[]{5,7,7,8,8,9},8);
        // System.out.println(re[0]+" "+re[1]);

        // 24.两两交换链表中的节点
        // 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
        // 解法：迭代，新建节点再交换
        // ListNode commNode = new ListNode(1);
        // commNode.next = new ListNode(2);
        // commNode.next.next = new ListNode(3);
        // commNode.next.next.next = new ListNode(4);
        // commNode = swapPairs(commNode);
        // while(commNode != null){
        //     System.out.print(commNode.val+" ");
        //     commNode = commNode.next;
        // }

        // 300.最长递增子序列
        // 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
        // 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
        // 解法：动态规划，获取每个位置的最大子序列长度
        // System.out.print(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        // System.out.print(lengthOfLIS(new int[]{0,1,0,3,2,3}));
        // System.out.print(lengthOfLIS(new int[]{}));

        // 189.轮转数组
        // 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
        // 解法：遍历塞到新数组
        // rotate(new int[]{1,2,3,4,5,6,7},3);

        // 25.K个一组翻转链表
        // 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
        // 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
        // 解法：头插法构建新链，分组三指针翻转最优
        // ListNode commNode = new ListNode(1);
        // commNode.next = new ListNode(2);
        // commNode.next.next = new ListNode(3);
        // commNode.next.next.next = new ListNode(4);
        // commNode.next.next.next.next = new ListNode(5);
        // ListNode re = reverseKGroup(commNode,2);
        // while(re !=null){
        //     System.out.println(" "+re.val);
        //     re = re.next;
        // }
        // re = reverseKGroup(commNode,3);
        // while(re !=null){
        //     System.out.println(" "+re.val);
        //     re = re.next;
        // }

        // 438.字符串中所有异位词
        // 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
        // 解法:滑动窗口,设置两个能存26位字母的数组用来比较,比tempStr替换法效率高.
        // List<Integer> re = findAnagrams("cbaebabacd","abc");
        // for(int i : re){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // re = findAnagrams("abab","ab");
        // for(int i : re){
        //     System.out.print(i+" ");
        // }

        // 22.括号生成
        // 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
        // 解法：递归回溯，对比左右括号数量
        // List<String> reLi = generateParenthesis(3);
        // for(String s:reLi){
        //     System.out.print(s+" ");
        // }

        // 73.矩阵置零
        // 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
        // 解法：两个hashset存行列状态
        // int[][] initArray = {{1,1,1},{1,0,1},{1,1,1}};
        // int[][] initArray1 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // setZeroes(initArray1);
        // for(int i=0;i<initArray1.length;i++){
        //     for(int j=0;j<initArray1[0].length;j++){
        //         System.out.print(initArray1[i][j]+"");
        //     }
        //     System.out.println();
        // }

        // 54.螺旋矩阵
        // 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
        // 解法：边界模拟法
        // int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        // List<Integer> spi = spiralOrder(matrix);
        // for(int i : spi){
        //     System.out.println(i+" ");
        // }

        // 152.乘积最大子数组
        // 给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续 子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
        // 解法：动态规划，注意最小负数也需要保存，可能遇到负数乘为正数
        // System.out.println(maxProduct(new int[]{2,3,-2,4}));
        // System.out.println(maxProduct(new int[]{-2,0,-1}));
        // System.out.println(maxProduct(new int[]{2,3,-2,4,5}));

        // 79.单词搜索
        // 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
        // 解法：递归+回溯，确定true和false和继续三种情况。
        // System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
        // System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"SEE"));
        // System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB"));

        // 739.每日温度
        // 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。
        // 如果气温在这之后都不会升高，请在该位置用 0 来代替。
        // 解法：单调栈，从后向前遍历，维护一个递减的序列。
        // int[] re = dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        // for(int i:re){
        //     System.out.print(i+" ");
        // }

        // 31.下一个排列
        // 整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。
        // 给你一个整数数组 nums ，找出 nums 的下一个排列。
        // 解法：找降序点、找交换点、反转右侧
        // nextPermutation(new int[]{1,2,3});
        // nextPermutation(new int[]{3,2,1});
        // nextPermutation(new int[]{1,1,5});

        // 33.搜索旋转排序数组
        // 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
        // 解法：二分法查找基础上，加一个判断左右半侧是否有序
        // System.out.println(search(new int[]{4,5,6,7,0,1,2},0));

        // 1143.最长公共子序列
        // 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。
        // 解法：动态规划，理解状态转移方程
        // System.out.println(longestCommonSubsequence("abcde","ace"));
        // System.out.println(longestCommonSubsequence("abc","abc"));
        // System.out.println(longestCommonSubsequence("oxcpqrsvwf","shmtulqrypy"));

        // 45.跳跃游戏2
        // 给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。每个元素 nums[i] 表示从索引 i 向后跳转的最大长度。
        // 返回到达 nums[n - 1] 的最小跳跃次数。
        // 解法：贪心算法，达到最大边界就跳跃一次
        // System.out.println(jump(new int[]{2,3,1,1,4}));
        // System.out.println(jump(new int[]{2,3,0,1,4}));
        // System.out.println(jump(new int[]{0}));

        // 763.划分字母区间
        // 给你一个字符串 s 。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。
        // 解法：贪心算法。预处理获取每个字符的最后出现位置，会比在循环里用lastIndexOf效率更高
        // partitionLabels("ababcbacadefegdehijhklij");

        // 41.缺失的第一个整数
        // 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
        // 解法：重新按序放置数组
        // System.out.println(firstMissingPositive(new int[]{100000, 3, 4000, 2, 15, 1, 99999}));
        // System.out.println(firstMissingPositive(new int[]{2,1}));
        // System.out.println(firstMissingPositive(new int[]{7,8,9,11,12}));

        // 148.排序链表
        // 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
        // 解法：循环到list后排序
        // ListNode node = new ListNode(4);
        // node.next = new ListNode(2);
        // node.next.next = new ListNode(1);
        // node.next.next.next = new ListNode(3);
        // node = sortList(node);
        // while(node!=null){
        //     System.out.println(node.val);
        //     node = node.next;
        // }

        // 23.合并k个升序链表
        // 给你一个链表数组，每个链表都已经按升序排列。
        // 请你将所有链表合并到一个升序链表中，返回合并后的链表。
        // 解法：优先队列-最小堆（默认）
        // ListNode node1 = new ListNode(1);
        // node1.next = new ListNode(4);
        // node1.next.next = new ListNode(5);
        // ListNode node2 = new ListNode(1);
        // node2.next = new ListNode(3);
        // node2.next.next = new ListNode(4);
        // ListNode node3 = new ListNode(2);
        // node3.next = new ListNode(6);
        // ListNode[] ls = new ListNode[3];
        // ls[0]=node1;ls[1]=node2;ls[2]=node3;
        // ListNode ret = mergeKLists(ls);
        // while(ret != null){
        //     System.out.print(ret.val+" ");
        //     ret = ret.next;
        // }

        AlgorithmAboutCollection ac = new AlgorithmAboutCollection();
        // 153.寻找旋转排序数组中的最小值
        // 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
        // 解法：二分查找，时间复杂度为logn
        // System.out.println(ac.findMin(new int[]{3,4,5,1,2}));
        // System.out.println(ac.findMin(new int[]{4,5,6,7,0,1,2}));
        // System.out.println(ac.findMin(new int[]{3,4,5,1,2}));

        // 84.柱状图中最大的矩形
        // 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
        // 求在该柱状图中，能够勾勒出来的矩形的最大面积。
        // 解法：单调栈，首尾补0预处理
        // System.out.println(ac.largestRectangleArea(new int[]{2,1,5,6,2,3}));
        // System.out.println(ac.largestRectangleArea(new int[]{2,4}));

        // 416.分割等和子集
        // 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
        // 解法：求有没有和为数组总和一半的子集即可，动态规划优于回溯
        // System.out.println(ac.canPartition(new int[]{1,5,11,5}));
        // System.out.println(ac.canPartition(new int[]{1,2,3,5}));

        // 32.最长有效括号
        // 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
        // 解法：栈，栈存储未匹配括号的索引。
        // System.out.println(ac.longestValidParentheses(")()())"));

        // 72.编辑距离
        // 给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数。
        // 解法：动态规划，替换、删除、插入各占一个原状态位置
        System.out.println(ac.minDistance("horse","ros"));






    }


    /**
     * 给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。
     * @param word1 "horse"
     * @param word2 "ros"
     * @return 3
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        // 初始化边界条件
        for (int i = 0; i <= m; i++) dp[i][0] = i;  // 删除所有字符
        for (int j = 0; j <= n; j++) dp[0][j] = j;  // 插入所有字符

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];  // 字符匹配，无需操作
                } else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j - 1] + 1,    // 替换
                            Math.min(
                                    dp[i - 1][j] + 1,    // 删除
                                    dp[i][j - 1] + 1     // 插入
                            )
                    );
                }
            }
        }
        return dp[m][n];
    }


    /**
     * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
     * @param s (() )()())
     * @return 2 4
     */
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // 初始边界
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i); // 更新边界
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }

    /**
     * 416.分割等和子集
     * @param nums {1,5,11,5}
     * @return true
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 如果总和是奇数，不能平分
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // 和为0总是能做到（空集合）

        for (int num : nums) {
            // 从后往前更新dp数组
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }

    /**
     * 84.柱状图中最大的矩形
     * @param heights [2,1,5,6,2,3]
     * @return 10
     */
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] newHeights = new int[heights.length + 2];
        System.arraycopy(heights, 0, newHeights, 1, heights.length); // 首尾补0
        int maxArea = 0;

         for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[stack.peek()] > newHeights[i]) {
                int h = newHeights[stack.pop()];
                int w = i - stack.peek() - 1; // 宽度计算关键
                maxArea = Math.max(maxArea, h * w);
            }
            stack.push(i);
        }
        return maxArea;
    }

    /**
     * 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
     * @param nums {3,4,5,1,2}
     * @return 1
     */
    static public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }





    /**
     * 请你将所有链表合并到一个升序链表中
     * @param lists [[1,4,5],[1,3,4],[2,6]]
     * @return [1,1,2,3,4,4,5,6]
     */
    static public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode node : lists) {
            if (node != null) pq.offer(node);
        }

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) pq.offer(minNode.next);
        }
        return dummy.next;

    }

    /**
     * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
     * @param head [4,2,1,3]
     * @return [1,2,3,4]
     */
    static public ListNode sortList(ListNode head) {
        ListNode virtual = new ListNode(-1);
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list); // 升序
        cur = virtual;
        for(int i : list){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return virtual.next;
    }

    /**
     * 缺失的第一个整数
     * @param nums {1,2,0} {3,4,-1,1} {100000, 3, 4000, 2, 15, 1, 99999}
     * @return 3 2
     */
    static public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // 将数字放到正确位置
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        // 检查第一个不满足条件的位置
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    static public List<Integer> partitionLabels(String s) {
        // 1. 预处理字符最后位置
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        // 2. 划分区间
        List<Integer> result = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) { // 当前片段结束
                result.add(end - start + 1);
                start = end + 1;
            }
        }
        return result;
    }


    static public List<Integer> partitionLabelsByMySelf(String s) {

        List<Integer> re = new ArrayList<>();
        char startChar;
        int left =0;
        int right = 0;
        while(left<s.length()){
            startChar = s.charAt(left);
            right = s.lastIndexOf(startChar);
            for(int i=left;i<right+1;i++){
                right = Math.max(s.lastIndexOf(s.charAt(i)),right);
            }
            re.add(right-left+1);
            left = right+1;
        }
        return re;


    }

    /**
     * 给定一个长度为 n 的 0 索引整数数组 nums。返回到达 nums[n - 1] 的最小跳跃次数。
     * @param nums {2,3,1,1,4}
     * @return 2
     */
    static public int jump(int[] nums) {
        int step = 0, end = 0, maxReach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == end) {
                step++;
                end = maxReach;
            }
        }
        return step;
    }

    /**
     * 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。
     * @param text1 "abcde"
     * @param text2 "ace"
     * @return 3
     */
    static public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    /**
     * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
     * @param nums {4,5,6,7,0,1,2}
     * @param target 0
     * @return
     */
    static public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 左半部分有序
            if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // 在左半部分查找
                } else {
                    left = mid + 1; // 在右半部分查找
                }
            } else { // 右半部分有序
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // 在右半部分查找
                } else {
                    right = mid - 1; // 在左半部分查找
                }
            }
        }
        return -1;
    }

    /**
     * 给你一个整数数组 nums ，找出 nums 的下一个排列。
     * @param nums {1,2,3} >> {1,3,2}
     *             {3,2,1} >> {1,2,3}
     */
    static public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。
     * @param temperatures {73,74,75,71,69,72,76,73}
     * @return {1,1,4,2,1,1,0,0}
     */
    static public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;

    }


    /**
     * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
     * @param board {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}
     * @param word "ABCCED"
     * @return true
     */
    static public boolean exist(char[][] board, String word) {
        isExist = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((board[i][j]+"").equals(word.substring(0,1))){
                    StringBuilder initStr = new StringBuilder();
                    searchDig(board,i,j,0,word,initStr);
                }
            }
        }
        return isExist;
    }

    private static boolean isExist = false;

    private static boolean searchDig(char[][] board, int i,int j,int from ,String word, StringBuilder initStr) {
        if(i<0 || j<0 || i==board.length || j==board[0].length){
            return false;
        }
        initStr.append(board[i][j]);
        if(word.startsWith(initStr.toString())){
            if(word.contentEquals(initStr)){
                isExist = true;
                return true;
            }
        }else{
            // 回溯
            initStr.deleteCharAt(initStr.length()-1);
            return false;
        }
        // 继续，但不能走回头路
        if(from!=2 && searchDig(board,i+1,j,1,word,initStr))return true;
        if(from!=1 && searchDig(board,i-1,j,2,word,initStr))return true;
        if(from!=4 && searchDig(board,i,j+1,3,word,initStr))return true;
        if(from!=3 && searchDig(board,i,j-1,4,word,initStr))return true;

        return false;

    }


    /**
     * 给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续 子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
     * @param nums {2,3,-2,4}
     * @return 子数组 [2,3]  最大乘积 6
     */
    static public int maxProduct(int[] nums) {
        // cur_min:以当前元素结尾的子数组的最小乘积（用于处理负数）
        int max = nums[0], cur_max = nums[0], cur_min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp_max = cur_max; // 保存前一个状态
            cur_max = Math.max(Math.max(cur_max * nums[i], cur_min * nums[i]), nums[i]);
            cur_min = Math.min(Math.min(temp_max * nums[i], cur_min * nums[i]), nums[i]);
            max = Math.max(max, cur_max);
        }
        return max;
    }


    /**
     * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
     * @param matrix [[1,2,3],[4,5,6],[7,8,9]]
     * @return [1,2,3,6,9,8,7,4,5]
     */
    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. 从左到右遍历上边界
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // 2. 从上到下遍历右边界
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // 3. 从右到左遍历下边界（需检查是否还有剩余行）
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4. 从下到上遍历左边界（需检查是否还有剩余列）
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    private static void addNodeSpial(int[][] matrix, int i, int j, int target,List<Integer> spi) {
        if(matrix[i][j] == -1){
            return;
        }
        spi.add(matrix[i][j]);
        System.out.println(matrix[i][j]);
        matrix[i][j]=-1;
        if(target==0 && j+1<matrix[0].length && matrix[i][j+1]!=-1){
            addNodeSpial(matrix,i,j+1,0,spi);
        }else if(target==0 && (j+1>=matrix[0].length || matrix[i][j+1]==-1)){
            addNodeSpial(matrix,i+1,j,1,spi);
        }else if(target==1 && i+1<matrix.length && matrix[i+1][j]!=-1){
            addNodeSpial(matrix,i+1,j,1,spi);
        }else if(target==1 && (i+1>=matrix.length || matrix[i+1][j]==-1)){
            addNodeSpial(matrix,i,j-1,2,spi);
        }else if(target==2 && j-1>0 && matrix[i][j-1]!=-1){
            addNodeSpial(matrix,i,j-1,2,spi);
        }else if(target==2 && (j-1<=0 || matrix[i][j-1]==-1)){
            addNodeSpial(matrix,i,j-1,3,spi);
        }else if(target==3 && i-1>0 && matrix[i-1][j]!=-1){
            addNodeSpial(matrix,i-1,j,3,spi);
        }else if(target==3 && (i-1<=0 || matrix[i-1][j]==-1)){
            addNodeSpial(matrix,i,j+1,0,spi);
        }


    }

    /**
     * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。
     * @param matrix {{1,1,1},{1,0,1},{1,1,1}}
     */
    static public void setZeroes(int[][] matrix) {
        // 有0的列
        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> rows = new HashSet<>();
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    cols.add(j);
                    rows.add(i);
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(cols.contains(j) || rows.contains(i)){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    /**
     * 用于能够生成所有可能的并且 有效的 括号组合。
     * @param n 3
     * @return ["((()))","(()())","(())()","()(())","()()()"]
     */
    static public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) return result;
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder current,
                                  int leftCount, int rightCount, int max) {
        // 终止条件：当前组合长度达到2n
        if (current.length() == 2 * max) {
            result.add(current.toString());
            return;
        }

        // 添加左括号的条件：左括号数量未达n
        if (leftCount < max) {
            current.append('(');
            backtrack(result, current, leftCount + 1, rightCount, max);
            current.deleteCharAt(current.length() - 1); // 回溯
        }

        // 添加右括号的条件：右括号数量小于左括号
        if (rightCount < leftCount) {
            current.append(')');
            backtrack(result, current, leftCount, rightCount + 1, max);
            current.deleteCharAt(current.length() - 1); // 回溯
        }
    }

    /**
     * 字符串中所有异位词
     * @param s "cbaebabacd"
     * @param p "abc"
     * @return [0,6]
     */
    static public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for (char c : p.toCharArray()) pCount[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            windowCount[s.charAt(i) - 'a']++;
            if (i >= p.length())
                windowCount[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(windowCount, pCount))
                result.add(i - p.length() + 1);
        }
        return result;
    }

    /**
     * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
     * @param head [1,2,3,4,5]
     * @param k 2
     * @return [2,1,4,3,5]
     */
    static public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0, head);
        ListNode prevGroupEnd = dummy;
        ListNode curr = head;
        while (true) {
            ListNode groupStart = curr;
            int count = 0;
            // 检测剩余节点是否足够k个
            while (curr != null && count < k) {
                curr = curr.next;
                count++;
            }
            if (count < k) break; // 不足k个，退出

            // 翻转当前组
            ListNode prev = curr; // 当前组翻转后应连接的下一个节点
            ListNode node = groupStart;
            for (int i = 0; i < k; i++) {
                ListNode next = node.next;
                node.next = prev;
                prev = node;
                node = next;
            }
            // 连接上一组和当前组
            prevGroupEnd.next = prev;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }

    /**
     * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * @param nums {1,2,3,4,5,6,7}
     * @param k 3
     *          [5,6,7,1,2,3,4]
     */
    static public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length; // 处理k超过数组长度的情况
        int[] re = new int[length];
        for (int i = 0; i < length; i++) {
            re[(i + k) % length] = nums[i]; // 直接计算新位置
        }
        System.arraycopy(re, 0, nums, 0, length); // 将结果复制回原数组
    }

    /**
     * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
     * @param nums {10,9,2,5,1,2,101,18}  {0,1,0,3,2,3}
     * @return 4 4
     */
    static public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int[] re = new int[nums.length];
        Arrays.fill(re,1);
        int maxLen = 1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j]){
                    re[i] = Math.max(re[i],re[j]+1);
                }
            }
            maxLen = Math.max(maxLen, re[i]); // 更新最大值
        }
        return maxLen;
    }


    /**
     * 两两交换链表中的节点
     * @param head [1,2,3,4]
     * @return [2,1,4,3]
     */
    static public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0); // 虚拟头节点
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // 执行交换
            first.next = second.next;
            current.next = second;
            second.next = first;

            current = first; // 移动指针到下一组的前驱节点
        }
        return dummy.next;

    }

    /**
     * 在排序数组中查找元素出现的第一个和最后一个位置
     * @param nums {5,7,7,8,8,10}
     * @param target 8
     * @return [3,4]
     */
    static public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findFirst(nums, target + 1) - 1;
        if (first <= last && last < nums.length) {
            return new int[]{first, last};
        }
        return new int[]{-1, -1};
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    /**
     * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。如果可以利用字典中出现的一个或多个单词拼接出 s 则返回 true。
     * @param s leetcode
     * @param wordDict ["leet", "code"]
     * @return true
     */
    static public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true; // 空字符串可拆分
        Set<String> wordSet = new HashSet<>(wordDict);

        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(dp[j] && wordSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     * @param head [1,2,3,4,5]
     * @param n 2
     * @return [1,2,3,5]
     */
    static public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        // 快指针先走n+1步
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // 同步移动至快指针到末尾
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 删除倒数第N个节点
        slow.next = slow.next.next;
        return dummy.next;
    }

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * @param list1 [1,2,4]
     * @param list2 [1,3,4]
     * @return [1,1,2,3,4,4]
     */
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1); // 虚拟头节点
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = (list1 != null) ? list1 : list2; // 处理剩余节点
        return dummy.next;

    }

    /**
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     * @param height {0,1,0,2,1,0,1,3,2,1,2,1}
     * @return 6
     */
    static public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int result = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }

    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列
     * @param nums
     * @return
     */
    static public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num); // 去重

        int maxLength = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // 仅处理起点
                int currentNum = num;
                int currentLength = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }


    /**
     * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     * @param grid
     * @return
     */
    static public int minPathSum(int[][] grid) {

        int[][] re = new int[grid.length][grid[0].length];

        re[0][0] = grid[0][0];

        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid[i].length;j++){

                int lastMin =0;
                if(i > 0 && j > 0){
                    lastMin = Math.min(re[i-1][j] , re[i][j-1]);
                }else if(i == 0 && j>0){
                    lastMin = re[i][j-1];
                }else if(i>0){
                    lastMin = re[i-1][j];
                }
                re[i][j] = lastMin + grid[i][j];

            }

        }

        return re[grid.length-1][grid[0].length-1];

    }

    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。
     * @param nums {1,1,1,2,2,3}
     * @param k 2
     * @return {1,2}
     */
    static public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i:nums){
            if(countMap.containsKey(i)){
                int count =countMap.get(i);
                countMap.put(i,++count);
            }else{
                countMap.put(i,1);
            }
        }

        // 转换为List并排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countMap.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue())); // 升序

        int[] re = new int[k];
        for(int j=0;j<k;j++){
            re[j]=list.get(j).getKey();
        }
        return re;
    }

    /**
     * 最小堆（优先队列）解法
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequentByDeepSeek(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // 移除频率最小的元素
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }

    /**
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * @param nums {1,3,-1,-3,5,3,6,7}
     * @param k 3
     * @return {3,3,5,5,6,7}
     */
    static public int[] maxSlidingWindow(int[] nums, int k) {
        // 双端队列法
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            // 移除不在窗口内的元素
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            // 移除比当前元素小的元素
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            // 记录窗口最大值
            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;

        // 暴力破解
        // if (nums.length == 0 || k == 0) return new int[0];
        // int[] re = new int[nums.length-k+1];
        // for(int i=0;i<nums.length-k+1;i++){
        //     int max=nums[i];
        //     for(int j=i;j<i+k;j++){
        //         max = Math.max(nums[j],max);
        //     }
        //     re[i]=max;
        // }
        // return re;
    }

    /**
     * 数组排序
     * @param nums {2,0,2,1,1,0}
     *             {0,0,1,1,2,2}
     */
    static public void sortColors(int[] nums) {

        int num0 = 0,num1=0;
        for(int i:nums){
            if(i==0){
                num0++;
            }else if(i==1){
                num1++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<num0){
                nums[i]=0;
            }else if(i<num0+num1){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }
    }

    /**
     * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * @param nums
     * @return
     */
    static public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i=0;i<nums.length;i++){
            if(maxReach<i) return false;
            maxReach = Math.max(maxReach,i+nums[i]);
            if(maxReach>=nums.length) return true;
        }
        return true;
    }

    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] queens = new int[n]; // queens[i]表示第i行皇后所在的列
        backtrack(solutions, queens, 0, n);
        return solutions;
    }

    static private void backtrack(List<List<String>> solutions, int[] queens, int row, int n) {
        if (row == n) {
            solutions.add(generateBoard(queens, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col;
                backtrack(solutions, queens, row + 1, n);
            }
        }
    }

    static private boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            // 检查是否同列或同对角线
            if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }
        return true;
    }

    static private List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }

    /**
     * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
     * @param n 4
     * @return [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
     */
    static public List<List<String>> solveNQueensMySelf(int n) {
        List<List<String>> retList = new ArrayList<>();
        List<List<Integer>> qLocal = new ArrayList<>();
        int[][] retArr = new int[n][n];
        // for(int i=0;i<n;i++){
            setQueen(retArr,n,qLocal);
        // }
        for(int j=0;j<qLocal.size();j++){
            System.out.println("qLocal"+ j +" X:"+qLocal.get(j).get(0) + " Y:" +qLocal.get(j).get(1));
        }

        return retList;
    }

    private static void setQueen(int[][] retArr, int i,List<List<Integer>> qLocal) {
        if(i ==0){
            return;
        }
        int setNum =0;
        for(int j=0;j<retArr.length;j++){
            for(int k=0;k<retArr[0].length;k++){
                // 备份一下
                int[][] tempLocal = new int[retArr.length][];
                for (int a = 0; a < retArr.length; a++) {
                    tempLocal[a] = retArr[a].clone();  // 或 Arrays.copyOf(original[i], original[i].length)
                }
                //未被触及的区域才能放置皇后
                if(retArr[j][k] != 1){

                    // retArr[j][k] =2;
                    List<Integer> ql = new ArrayList<>();
                    ql.add(j);ql.add(k);
                    qLocal.add(ql);
                    // 放置数+1
                    setNum++;
                    // 朝八个方向攻击
                    for(int t=1;t<=8;t++){
                        attatck(retArr,j,k,t,1);
                    }
                    i--;
                    setQueen(retArr,i,qLocal);
                }

                // 达到最后一位仍未放置n个皇后，开始回溯
                if(j==retArr.length-1 && k==retArr[0].length-1 && i>0){
                    // 取最后一个皇后
                    List<Integer> last = qLocal.get(qLocal.size()-1);

                    retArr = tempLocal;
                    // 释放八个方向的锁定
                    // for(int t=1;t<=8;t++){
                    //     attatck(retArr,last.get(0),last.get(1),t,0);
                    // }
                    // 删掉最后一位皇后
                    qLocal.remove(qLocal.size()-1);
                    // 如果达到行最后一列
                    if(last.get(1)+1 == retArr[0].length){
                        // 去到下一行开头
                        j=last.get(0)+1;k=-1;
                    }else{
                        // 列+1
                        j=last.get(0);k=last.get(1);
                    }

                }
            }
        }
    }

    private static void attatck(int[][] retArr, int j, int k, int target, int color) {

        if(j<0 || k<0 || j>=retArr.length || k>=retArr[0].length){
            return;
        }
        retArr[j][k]=color;
        if(target==1){
            attatck(retArr,j,k+1,1,color);
        }else if(target==2){
            attatck(retArr,j,k-1,2,color);
        }else if(target==3){
            attatck(retArr,j+1,k,3,color);
        }else if(target==4){
            attatck(retArr,j-1,k,4,color);
        }else if(target==5){
            attatck(retArr,j+1,k+1,5,color);
        }else if(target==6){
            attatck(retArr,j+1,k-1,6,color);
        }else if(target==7){
            attatck(retArr,j-1,k+1,7,color);
        }else if(target==8) {
            attatck(retArr, j - 1, k - 1, 8,color);
        }

    }

    /**
     * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * @param nums {2,2,1}
     * @return 1
     */
    static public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    /**
     * 给你一个满足下述两条属性的 m x n 整数矩阵：给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
     * @param matrix {{1,3,5,7},{10,11,16,20},{23,30,34,60}}
     * @param target 7
     * @return true
     */
    static public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }

    /**
     * 找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合
     * @param candidates [2,3,6,7]
     * @param target 7
     * @return [[2,2,3],[7]]
     */
    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // 排序便于剪枝
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    static private void backtrack(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) { // 剪枝
                break;
            }
            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, temp, result); // 注意这里传入i而不是i+1，因为可以重复使用
            temp.remove(temp.size() - 1); // 回溯
        }
    }

    /**
     * 机器人从左上角到右下角，问总共有多少条不同的路径
     * @param m 二维数组行 3
     * @param n 二维数组列 7
     * @return 路径数 28
     */
    static public int uniquePaths(int m, int n) {
        if(m==1 ||n==1) return 1;
        int[][] re = new int[m][n];
        re[0][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    continue;
                }
                re[i][j] = (j==0?0:re[i][j-1]) + (i==0?0:re[i-1][j]);
            }
        }
        return re[m-1][n-1];
    }

    /**
     * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
     * @param coins [1, 2, 5]
     * @param amount 11
     * @return 3
     */
    static public int coinChange(int[] coins, int amount) {
        // 创建dp数组，dp[i]表示凑成金额i所需的最少硬币数
        int[] dp = new int[amount + 1];

        // 初始化dp数组，除dp[0]外都设为amount+1（表示不可达）
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; // 金额0需要0个硬币

        // 遍历每个金额从1到amount
        for (int i = 1; i <= amount; i++) {
            // 遍历每个硬币面额
            for (int coin : coins) {
                if (coin <= i) { // 当前硬币可以使用
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // 检查是否能够凑成目标金额
        return dp[amount] > amount ? -1 : dp[amount];

    }

    /**
     * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
     * @param n 12
     * @return 3 （4 + 4 + 4）
     */
    static public int numSquares(int n) {
        // 初始化dp数组，dp[i]表示和为i的完全平方数的最少数量
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // 初始化为最大值
        dp[0] = 0; // 基础情况：和为0不需要任何完全平方数

        // 遍历每个整数i，计算其最少平方数个数
        for (int i = 1; i <= n; i++) {
            // 遍历所有可能的平方数j*j（j*j <= i）
            for (int j = 1; j * j <= i; j++) {
                // 更新dp[i]为最小值
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    /**
     * 给你一个链表的头节点 head ，返回链表开始入环的第一个节点
     * @param head [3,2,0,-4,2]
     * @return [2]
     */
    static public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        // 快慢指针找相遇点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {  // 相遇
                // 数学推导：从头开始找环入口
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;  // 环的入口
            }
        }
        return null;  // 无环
    }

    /**
     * 给你一个链表的头节点 head ，判断链表中是否有环。
     * @param head [3,2,0,-4,2]
     * @return true
     */
    static public boolean hasCycle(ListNode head) {
        if (head == null) return false;  // 处理空链表
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     * @param nums [2,7,9,3,1] [2, 1, 1, 2]
     * @return 2+9+1=12 2+2=4
     */
    static public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            // 实际每次往后一位，都只有两种选择：要么选择上一个和数，要么选择上上个和数与当前数之和，取其大者。
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * @param nums {1,3,5,6}
     * @param target 5
     * @return 2
     */
    static public int searchInsert(int[] nums, int target) {

        // 二分解法：时间复杂度Ologn
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;


        // 遍历解法：时间复杂度On
        // int re = 0;
        // if(target <= nums[0]){
        //     re = 0;
        // }else if(target == nums[nums.length-1]){
        //     re = nums.length-1;
        // }else if(target > nums[nums.length-1]){
        //     re = nums.length;
        // }else{
        //     for(int i=0;i<nums.length;i++){
        //         if(target == nums[i]){
        //             re = i;
        //         }else if(i>0 && target>nums[i-1] && target<nums[i]){
        //             re = i;
        //         }
        //     }
        // }
        // return re;

    }

    /**
     * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
     * @param numRows 5
     * @return [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     */
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> re = new ArrayList<>(numRows);
        if (numRows == 0) return re;

        for(int i=0;i<numRows;i++){
            List<Integer> ite = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    ite.add(1);
                }else{
                    List<Integer> last = re.get(i-1);
                    // 递推，隐含动态规划，由底向上推
                    ite.add(last.get(j-1)+last.get(j));
                }
            }
            re.add(ite);
        }
        return re;

    }

    static public int findKthLargest(int[] nums, int k) {
        // 数组排序，双向快排，时间复杂度：O(nlogn)
        // Arrays.sort(nums);
        // return nums[nums.length-k];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n : nums){
            minHeap.offer(n);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();

    }

    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * @param prices 股票第 i 天的价格 {7,1,5,3,6,4}
     * @return 最大利润 6-1 = 5
     */
    static public int maxProfit(int[] prices) {
        // 差值
        int sub = 0;
        if(prices.length ==0){
            return sub;
        }
        // 当前最小数
        int curMin = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] < curMin){
                curMin = prices[i];
            }else{
                sub = Math.max(prices[i] - curMin,sub) ;
            }
        }

        return sub;
    }

    /**
     * 动态规划法，解爬楼梯
     * @param n 楼梯阶数
     * @return 方法数
     */
    static public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        // 如果只需n-1阶和n-2阶的方法数，数组都可以不要，只需要prev1和prev2就能解，空间复杂度降为o1
        int[] methodC = new int[n+1];
        // 到0阶的方法有一种，即不动
        methodC[0] = 1;
        // 到1阶的方法有一种
        methodC[1] = 1;

        for(int i=2;i<=n;i++){
            // 因为可以选择迈1阶或迈2阶，因此，到n阶的方法数，为到n-1阶的方法数（再迈1阶） 加上 到n-2阶的方法数（再迈2阶）
            methodC[i] = methodC[i-1] + methodC[i-2];
        }

        return methodC[n];
    }

    /**
     * 需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶
     * @param n 3
     * @return 3
     */
    static public int climbStairsByRecursion(int n) {
        if(n == 0){
            return  n;
        }
        mc = 0;
        mMap = new HashMap<>();
        String stepCount = "";
        int[] a = {1,2};
        int total = 0;
        climb(total,n,a,stepCount);
        return mc;
    }

    /**
     * 递归+回溯
     * @param total 当前总和
     * @param n 目标数
     * @param a 选择数组
     * @param stepCount 当前操作索引
     */
    private static void climb(int total, int n, int[] a, String stepCount) {

        if(total == n){
            // 不能重复添加
            if(mMap.containsKey(stepCount)){
                return;
            }
            mc ++;
            mMap.put(stepCount,total);
        }else{
            for(int i=0;i<a.length;i++){
                total += a[i];
                if(total > n){
                    continue;
                }
                stepCount += a[i]+"";
                climb(total,n,a,stepCount);
                stepCount = stepCount.substring(0,stepCount.length()-1);
                total = total - a[i];
            }
        }
    }

    static private int mc = 0;
    static private HashMap<String,Integer> mMap = null;


    /**
     * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
     * @param headA 4 1 8 4 5
     * @param headB 5 6 1 8 4 5
     * @return 8
     */
    static public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }

    static public ListNode getIntersectionNodeByMySelf(ListNode headA, ListNode headB) {

        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode curNode = headA;
        int depth =0;
        map.put(curNode,depth);
        while(curNode.next!=null){
            curNode = curNode.next;
            depth++;
            map.put(curNode,depth);
        }

        curNode = headB;
        while(curNode !=null){
            if(map.containsKey(curNode)){
                break;
            }
            curNode = curNode.next;
        }
        return curNode;

    }

    /**
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。
     * @param strs ["eat", "tea", "tan", "ate", "nat", "bat"]
     * @return [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    static public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 将字符串转换为字符数组并排序
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // 将排序后的字符串作为键，原字符串作为值
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }

        // 返回所有字母异位词组的列表
        return new ArrayList<>(map.values());
    }

    /**
     * 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。返回 需要移除区间的最小数量，使剩余区间互不重叠 。
     * @param intervals {1,100},{11,22},{1,11},{2,12}
     * @return 2
     */
    static public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // 按区间结束时间升序排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1; // 至少保留一个区间
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            if (currentStart >= prevEnd) {
                // 无重叠，保留当前区间
                count++;
                prevEnd = intervals[i][1];
            }
        }
        // 总区间数 - 保留的区间数 = 需要移除的数量
        return intervals.length - count;
    }

    /**
     * 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。返回 需要移除区间的最小数量，使剩余区间互不重叠 。
     * @param intervals [[1,2],[2,3],[3,4],[1,3]]
     * @return 1
     */
    static public int eraseOverlapIntervalsByMySelf(int[][] intervals) {
        int overCount = 0;
        Map<Integer,Integer> statusMap = new HashMap<>();
        for (int[] interval : intervals) {
            // 覆盖元素次数，大于1就是有重合
            int count = 0;
            int start = interval[0];
            int end = interval[1];
            for (int j = start; j <= end; j++) {
                if (statusMap.get(j) != null) {
                    count++;
                }
                if (count > 1) {
                    overCount++;
                    count = 0;
                    break;
                }
                statusMap.put(j, 1);
            }
        }
        return overCount;
    }

    /**
     *  m x n 矩阵 matrix 中的一个目标值
     *  解法：Z字形查找，以右上角为初始比对基准，每次迭代，要么减少列数，要么增加行数，最多进行 m + n 次迭代。
     * @param matrix [1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]
     * @param target 5
     * @return 是否存在
     */
    // static public boolean searchMatrix(int[][] matrix, int target) {
    //     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    //         return false;
    //     }
    //
    //     int m = matrix.length;    // 行数
    //     int n = matrix[0].length; // 列数
    //
    //     // 从矩阵的右上角开始搜索
    //     int row = 0;
    //     int col = n - 1;
    //
    //     while (row < m && col >= 0) {
    //         if (matrix[row][col] == target) {
    //             return true; // 找到目标值
    //         } else if (matrix[row][col] > target) {
    //             col--; // 目标值可能在当前列的左边
    //         } else {
    //             row++; // 目标值可能在当前行的下边
    //         }
    //     }
    //
    //     return false; // 未找到目标值
    // }

    /**
     * 两次翻转，先水平翻转，再对角线翻转，即可旋转90度
     * @param matrix n × n 的二维矩阵
     */
    static public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
        // 主对角线翻转（转置）
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     *  辅助数组来旋转
     * @param matrix n x n 二维矩阵
     */
    static public void rotateByMySelf(int[][] matrix) {
        int l = matrix.length;
        int[][] res = new int[l][l];
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < l; j++) {
                int temp = matrix[i][j];
                // res[i][j] = matrix[j][l-i-1];
                res[j][l-i-1] = temp;
            }
        }
    }

    /**
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。
     * @param nums {2,2,1,1,1,2,2}
     * @return 2
     */
    static public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int re =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])!=null){
                int count =hm.get(nums[i]);
                count++;
                hm.put(nums[i],count);
                if(count > nums.length/2){
                    re = nums[i];
                    break;
                }
            }else{
                hm.put(nums[i],1);
            }
        }
        return re;
    }

    /**
     * 返回该数组所有可能的子集
     * @param nums [1,2,3]
     * @return [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     */
    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reList = new ArrayList<>();
        // 先加一个空数组
        List<Integer> firstList = new ArrayList<>();
        reList.add(firstList);
        for (int i= nums.length;i>0;i--){
            addNumsToList(reList,new ArrayList<>(),nums,i);
        }
        return  reList;
    }
    private static void addNumsToList(List<List<Integer>> reList, List<Integer> li, int[] nums, int i) {
        if(li.size()==i){
            reList.add(new ArrayList<>(li));
        }else{
            for (int num : nums) {
                // 与求全排列不同的地方在于，此为有序数组，不能后面元素大于前面元素
                if (li.contains(num) || (!li.isEmpty() && li.get(li.size()-1)>num)) {
                    continue;
                }
                li.add(num);
                addNumsToList(reList, li, nums, i);
                // 回溯
                li.remove(li.size()-1);
            }
        }
    }

    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列
     * @param nums 不含重复数字的数组 {1,3,5}
     * @return 所有可能的全排列 {1,3,5}/{1,5,3}/{3,5,1}/{3,1,5}/{5,3,1}/{5,1,3}
     */
    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    // 递归+回溯算法
    static private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // 如果当前排列的长度等于数组的长度，说明已经找到一个完整的排列
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // 跳过已经存在于当前排列中的元素
                if (tempList.contains(nums[i])) {
                    continue;
                }
                // 将当前元素添加到排列中
                tempList.add(nums[i]);
                // 继续递归生成下一个元素的排列
                backtrack(result, tempList, nums);
                // 回溯，移除最后一个元素，尝试其他可能性
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列
     * @param nums 不含重复数字的数组 {1,3,5}
     * @return 所有可能的全排列 {1,3,5}/{1,5,3}/{3,5,1}/{3,1,5}/{5,3,1}/{5,1,3}
     */
    static public List<List<Integer>> permuteBySelf(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        List<Integer> fromL = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            fromL.add(nums[i]);
        }

        if(nums.length == 0){
            return list;
        }else if (nums.length == 1){
            li.add(nums[0]);
            list.add(li);
            return list;
        }

        addNumToList(fromL,list);

        list.add(li);


        return list;
    }

    private static void addNumToList( List<Integer> fromL, List<List<Integer>> list) {

        List<Integer> li = new ArrayList<>();
        for(int i=0;i<fromL.size();i++){
            li.add(fromL.get(i));
        }
        list.add(li);
        if(!fromL.isEmpty()){
            fromL.remove(0);
            addNumToList(fromL,list);
        }

    }

    // 解法：广度优先搜索，以腐烂橘子入队，每遍历一次所有腐烂橘子，时间就+1
    // 注意：for (int j = 0; j < size; j++) { //size不能直接改写成 queue.size()，如果for循环里有用offer，那这个size就一直会增加。。。
    static public int orangesRottingByMyself(int[][] grid){
        Queue<int[]> badOrange = new LinkedList<>();
        int minus =0;
        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
        int freshOrangeCount =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    badOrange.offer(new int[]{i,j});
                }else if (grid[i][j]==1){
                    freshOrangeCount ++;
                }
            }
        }
        // 特判：没有新鲜橘子直接返回0
        if (freshOrangeCount == 0) return 0;

        while (!badOrange.isEmpty() && freshOrangeCount > 0) {
            int size = badOrange.size();
            // 分层处理当前所有腐烂橘子
            for (int j = 0; j < size; j++) {

                int[] index = badOrange.poll();
                for(int[] i : direction){
                    int targetX = index[0] + i[0];
                    int targetY = index[1] + i[1];
                    if(targetX==grid.length || targetX<0 || targetY==grid[0].length || targetY<0
                            || grid[targetX][targetY]==0 || grid[targetX][targetY]==2){
                        continue;
                    }else{
                        grid[targetX][targetY] = 2;
                        badOrange.offer(new int[]{targetX,targetY});
                        freshOrangeCount --;
                    }
                }
            }
            minus ++;


        }
        return freshOrangeCount == 0 ? minus : -1;
    }

    //解法：广度优先搜索，以腐烂橘子入队，每遍历一次所有腐烂橘子，时间就+1
    static public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int fresh = 0;

        // 初始化：统计新鲜橘子，腐烂橘子入队
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) queue.offer(new int[]{i, j});
            }
        }

        // 特判：没有新鲜橘子直接返回0
        if (fresh == 0) return 0;

        int minutes = 0;
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            // 分层处理当前所有腐烂橘子
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                // 向四个方向扩散
                for (int[] dir : DIRECTIONS) {
                    int x = pos[0] + dir[0];
                    int y = pos[1] + dir[1];
                    // 检查边界条件及是否为新鲜橘子
                    if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == 1) {
                        grid[x][y] = 2; // 标记为腐烂
                        queue.offer(new int[]{x, y});
                        fresh--; // 减少新鲜橘子计数
                    }
                }
            }
            minutes++; // 每处理完一层，时间+1
        }

        // 最终判断是否仍有剩余新鲜橘子
        return fresh == 0 ? minutes : -1;
    }

    /**
     * 腐烂扩散
     * @param grid 整个网格
     * @param i x坐标
     * @param j y坐标
     * @param minus 分钟数
     */
    private static void expandBad(int[][] grid, int i, int j, int minus) {
        // // 到达边界，停止扩散
        // if(i>grid.length || i<0 || j>grid[0].length || j<0 || grid[i][j] == 0){
        //     return;
        // }
        // 状态由新鲜改为腐烂
        // if(grid[i][j] == 1){
        //     grid[i][j] = 2;
        // }
        Queue<int[]> qu = new LinkedList<>();
        qu.offer(new int[]{i,j});
        while(!qu.isEmpty()){
            int[] fromIteam = qu.poll();
            int[][] direactionArr = {{fromIteam[0]+1,j},{fromIteam[0]-1,j},{i,fromIteam[1]+1},{i,fromIteam[j]-1}};
            for(int[] arr : direactionArr){
                // 到达边界，停止扩散
                if(arr[0]>grid.length-1 || arr[0]<0 || arr[1]>grid[0].length-1 || arr[1]<0
                        || grid[arr[0]][arr[1]] == 0){
                    continue;
                }else{
                    // 状态由新鲜改为腐烂
                    if(grid[arr[0]][arr[1]] == 1){
                        grid[i][j] = 2;
                    }
                }
                qu.offer(arr);
            }
            minus ++;

        }
        // 朝四个方向扩散
        // expandBad(grid,i+1,j,minus);
        // expandBad(grid,i-1,j,minus);
        // expandBad(grid,i,j+1,minus);
        // expandBad(grid,i,j-1,minus);

    }

    /**
     * 计算岛屿数量
     * @param grid 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格
     * @return 网格中岛屿的数量（岛屿总是被水包围）（网格的四条边均被水包围）
     */
    static public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // 遍历网格中的每个单元格
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 如果当前单元格是陆地（'1'），则启动DFS
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j); // 标记整个岛屿
                }
            }
        }
        return numIslands;
    }

    // 深度优先搜索函数
    static private void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // 检查边界条件：如果超出网格范围或当前单元格是水（'0'），则返回
        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0') {
            return;
        }

        // 将当前单元格标记为水（'0'），避免重复访问，good！
        grid[row][col] = '0';

        // 递归访问上下左右四个方向的单元格
        dfs(grid, row - 1, col); // 上
        dfs(grid, row + 1, col); // 下
        dfs(grid, row, col - 1); // 左
        dfs(grid, row, col + 1); // 右
    }

    // 广度优先搜索（BFS）——拓扑排序
    // 通过维护节点的入度表，逐步移除入度为0的节点（即无前置依赖的课程），若最终所有节点均被移除，则无环；否则存在环
    static public boolean canFinishByBFS(int numCourses, int[][] prerequisites) {
        // 邻接表：记录每个课程的后续课程
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        // 入度数组：记录每个课程的依赖数量
        int[] inDegree = new int[numCourses];

        // 构建邻接表和入度数组
        for (int[] pre : prerequisites) {
            int ai = pre[0], bi = pre[1];
            adj.get(bi).add(ai);
            inDegree[ai]++;
        }

        // 初始化队列：入度为0的课程入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0; // 已完成的课程数
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int next : adj.get(course)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        return count == numCourses;
    }

    // 深度优先搜索（DFS）——环检测
    // 通过递归遍历图中的节点，若在递归路径中遇到正在访问的节点，则存在环
    static List<List<Integer>> adj;
    static int[] visited; // 0:未访问, 1:访问中, 2:已访问
    static boolean hasCycle = false;
    static public boolean canFinishByDFS(int numCourses, int[][] prerequisites) {
        adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int ai = pre[0], bi = pre[1];
            adj.get(bi).add(ai);
        }

        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                dfs(i);
                if (hasCycle) return false;
            }
        }
        return true;
    }
    static private void dfs(int course) {
        visited[course] = 1; // 标记为正在访问
        for (int next : adj.get(course)) {
            if (visited[next] == 0) {
                dfs(next);
            } else if (visited[next] == 1) {
                hasCycle = true; // 发现环
                return;
            }
        }
        visited[course] = 2; // 标记为已访问
    }

    /**
     * 请你判断是否可能完成所有课程的学习
     * @param numCourses 课程数量
     * @param prerequisites 课程修习条件数组
     * @return 能够完成所有课程学习
     */
    static public boolean canFinishBySelf(int numCourses, int[][] prerequisites) {
        if(prerequisites==null || prerequisites.length==0){
            return true;
        }
        boolean canFinish = true;

        for(int i=0;i<prerequisites.length;i++){
            // 条件链
            List<Integer> reLi = new ArrayList<>();
            reLi.add(prerequisites[i][0]);
            boolean hasTop = hasTop(reLi,prerequisites[i][1],prerequisites);
            if(!hasTop){
                canFinish = false;
                break;
            }
        }

        return canFinish;
    }

    private static boolean hasTop(List<Integer> reLi, int prerequisite, int[][] prerequisites) {
        reLi.add(prerequisite);

        for(int[] i : prerequisites){
            if(i[0] == prerequisite){
                int requClass =  i[1];
                // 条件链中如果出现重复，则不可能完成所有课程学习
                if(reLi.contains(requClass)){
                    return false;
                }
                if(!hasTop(reLi,requClass,prerequisites)){
                    return false;
                }
            }
        }
        return true;

    }

    /**
     * 力扣算法238.除自身以外数组的乘积 使用 前缀积 和 后缀积 的方法，遍历两次n，时间复杂度为O(2N)，忽略常数2，仍然是O(N)复杂度！
     * @param nums 整数数组
     * @return 各元素的乘积
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // 计算前缀积
        answer[0] = 1; // 第一个元素没有前缀，所以前缀积为 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        // 计算后缀积并直接与前缀积相乘
        int suffix = 1; // 最后一个元素没有后缀，所以后缀积初始为 1
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; // 将前缀积与后缀积相乘
            suffix *= nums[i]; // 更新后缀积
        }
        return answer;
    }
    public static int[] productExceptSelfByMyself(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            answer[i]= selfMul(nums,i);
        }

        return answer;
    }

    private static int selfMul(int[] nums, int i) {
        int mulNum = 1;
        for(int j=0;j<nums.length;j++){
            if(j!=i){
                mulNum= mulNum*nums[j];
            }
        }
        return mulNum;

    }

    /**
     * 力扣算法283.给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums 整数数组
     */
    public static void moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length; i++ ){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        if (nums == null || nums.length == 0) {
            return;
        }

        int j = 0; // j 指向下一个非零元素应该放置的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // 将 j 之后的所有元素置为 0
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }

        for(int i = 0; i < nums.length; i++ ){
            System.out.print(nums[i]+" ");
        }

    }

    private static void moveZero(int[] nums, int i) {

        for (int j =i;j< nums.length-1;j++){

            int cur = nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=cur;

        }

    }

    /**
     * 反转链表：自定义链表-官方解题法-递归
     * @param head 待处理链表
     * @return 反转后的链表
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 递归算法，需要思考1次和2次的运行情况-脑内模拟
        ListNode newHead = reverseList(head.next);
        // 这里的head.next却是和newHead指向同一个对象，等于是为newHead添加了next
        head.next.next = head;
        // 引用赋空，不伤及newHead，相当于挪移大法
        head.next = null;
        return newHead;
    }

    /**
     * 反转链表：自定义链表
     * @param head 待处理链表
     * @return 反转后的链表
     */
    private static ListNode reverseListDode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode resNode = new ListNode(head.val);
        while(head.next !=null){
            resNode = new ListNode(head.next.val,resNode);
            head = head.next;
        }
        return resNode;
    }

    /**
     * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
     * @param head 已排序的自定义链表的头 head [1,1,2,3,3]
     * @return 已排序的不重复链表 [1,2,3]
     */
    private static ListNode deleteDuplicateItemFromListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rl = new ListNode(head.val);
        ListNode cur = rl;
        int lastInt = head.val;
        while(head.next != null){
            if(head.next.val != lastInt){
                cur.next = new ListNode(head.next.val);
                cur = cur.next;
                lastInt = head.next.val;
            }
            head = head.next;
        }
        return rl;
    }
    /**
     * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
     * @param head 已排序的自定义链表的头 head [1,1,2,3,3]
     * @return 已排序的不重复链表 [1,2,3]
     */
    private static ListNode deleteDuplicateItemFromListNodeByDs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curNode = head;
        while (curNode.next != null) {
            if (curNode.val == curNode.next.val) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return head;
    }

    /**
     * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
     * @param l1 已排序的链表的头 head [1,1,2,3,3]
     * @return 已排序的不重复链表 [1,2,3]
     */
    private static LinkedList<Integer> deleteDuplicateItemFromList(LinkedList<Integer> l1) {

        LinkedList<Integer> reLi = new LinkedList<>();
        int lastInt = l1.get(0);
        reLi.add(lastInt);
        for(int i=1;i<l1.size();i++){
            if(l1.get(i) != lastInt){
                lastInt = l1.get(i);
                reLi.add(l1.get(i));
            }
        }

        return reLi;

    }

    /**
     * 合并二维数组中的区间内层数组
     * @param intervals 二维数组，内层数组都是两个整数元素，且内层数组的第一个整数元素都比第二个元素大，此为区间数组
     * @return 二维数组，将入参的内层数组覆盖部分合并起来
     */
    private static int[][] mergeIntervalArr(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }
        // 按照区间的左端点进行排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int lInt = intervals[0][0];
        int rInt = intervals[0][1];
        List<int[]> resList = new ArrayList<>();
        for(int i=0;i <intervals.length; i++){
            if(i+1 == intervals.length){
                resList.add(new int[]{lInt,rInt});
                break;
            }
            if(rInt < intervals[i+1][0]){
                resList.add(new int[]{lInt,rInt});
                // 从下一个区间数组开始继续等待闭合
                lInt = intervals[i+1][0];
            }
            rInt = Math.max(rInt,intervals[i+1][1]);
        }
        int[][]  reArr = new int[resList.size()][2];
        for(int j=0;j<resList.size();j++){
            reArr[j] = resList.get(j);
        }
        return reArr;
    }

    /**
     * 找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @param nums 数组
     * @return 最大和
     */
    private static int getMaxTotalFromIntArr(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int currentMax = nums[0]; // 当前子数组的最大和
        int globalMax = nums[0];  // 全局最大子数组和

        for (int i = 1; i < nums.length; i++) {
            // 更新当前子数组的最大和
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // 更新全局最大子数组和
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;

    }

    /**
     * 传入任意数组，返回所有和为零的三元数组
     * @param nums 整数数组
     * @return 所有三元数组
     */
    private static List<List<Integer>> getZeroArrByArrByDs(int[] nums) {
        Arrays.sort(nums); // 先对数组进行排序
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // 跳过重复的元素
            }

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++; // 跳过重复的元素
                    while (l < r && nums[r] == nums[r - 1]) r--; // 跳过重复的元素
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }

    /**
     * 传入任意数组，返回所有和为零的三元数组
     * @param intArr 整数数组
     * @return 所有三元数组
     */
    private static int[][] getZeroArrByArr(int[] intArr) {

        List<int[]> resList = new ArrayList<>();
        int resCount =0;
        List<Integer> zList = new ArrayList<>();
        List<Integer> fList = new ArrayList<>();
        int curZ=0,curF=0;

        Map<Integer,Integer> intMapZ = new HashMap<>();
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<intArr.length;i++){
            if(countMap.get(intArr[i])!=null){
                int count = countMap.get(intArr[i]);
                countMap.put(intArr[i],++count);
            }
            // key为值，value为数组下标
            intMapZ.put(intArr[i],i);
            if(intArr[i] >0){
                zList.add(intArr[i]);
                curZ ++;
            }else{
                fList.add(intArr[i]);
                curF ++;
            }
        }

        for(int j =0;j<curF;j++){
            int fNum = fList.get(j);
            for(int k=0;k<curZ;k++){
                int subNum = Math.abs(fNum) - zList.get(k);
                if(intMapZ.containsKey(subNum) && (subNum!=zList.get(k)
                        || (subNum==zList.get(k) && countMap.get(subNum)!=null && countMap.get(subNum)>1))
                    && !resList.contains(new int[]{fNum, zList.get(k), subNum})){
                    resList.add(new int[]{fNum, zList.get(k), subNum});
                    resCount++;
                }
            }
        }

        int[][] resArr = new int[resList.size()][3];
        for(int i=0;i<resList.size();i++){
            resArr[i] = resList.get(i);
        }


        return resArr;
    }


    /**
     * 根据传入的垂线高度数组，得出两条垂线与x轴组成的最大长方形的面积，双指针解法，复杂度n
     * @param height
     * @return
     */
    private static int calcAreaByHeighArrByDs(int[] height) {
        int left=0,right=height.length-1;
        int areaMax = 0;

        while(left < right){

            int heightAct = Math.min(height[left],height[right]);
            areaMax = Math.max(areaMax,heightAct*(right-left));
            // 移动短板
            if(height[left] > height[right]){
                right --;
            }else{
                left ++;
            }

        }

        return areaMax;
    }

    /**
     * 根据传入的垂线高度数组，得出两条垂线与x轴组成的最大长方形的面积，暴力解法
     * @param height
     * @return
     */
    private static int calcAreaByHeighArr(int[] height) {
        int area = 0;

        // 遍历高度数组，获取所有垂线之间的面积，n2
        for(int i =0; i < height.length;i++){
            for(int j =i ; j< height.length;j++){
                int heightI = height[i];
                int heightJ = height[j];
                // 实际高度取短板
                int heightAct = Math.min(heightI, heightJ);
                int areaIJ = heightAct*(j-i);
                if(areaIJ>area){
                    area = areaIJ;
                }
            }
        }

        return area;
    }

    /**
     * 两个正序数组的合并数组的中位数，算法时间复杂度为O（m+n）
     * @param numArr1 正序数组1 1 4
     * @param numArr2 正序数组2 2 3
     * @return 合并数组的中位数
     */
    private static float getMidNumFromTwoArray(int[] numArr1, int[] numArr2) {
        float midNum = 0 ;
        Map<Integer,Integer> numMap = new HashMap<>();

        int index =0;int cur1 = 0; int cur2=0;
        while(cur1<numArr1.length || cur2<numArr2.length){

            if(cur1 == numArr1.length){
                numMap.put(index,numArr2[cur2]);
                cur2++;
                continue;
            }

            if(cur2 == numArr2.length || numArr1[cur1] < numArr2[cur2]){
                numMap.put(index,numArr1[cur1]);
                cur1++;
            }else{
                numMap.put(index,numArr2[cur2]);
                cur2++;
            }
            index++;
        }
        // 打印合并的数组map
        for(int i=0; i< numMap.size(); i++){
            System.out.println(i+"value:"+numMap.get(i));
        }
        // 如果为偶数
        if(numMap.size()%2 ==0){
            midNum = (float) (numMap.get(numMap.size() / 2 - 1) + numMap.get(numMap.size() / 2)) /2;
        }else{
            // 如果为奇数，直接取中位数
            midNum = numMap.get(numMap.size()/2);
        }

        // 找到中位数：数组中间的位置

        return midNum;
    }

    /**
     * 两数之和
     * @param l1 非空链表1，表示非负整数，每位数字按照逆序存储
     * @param l2 非空链表2，表示非负整数，每位数字按照逆序存储
     * @return 表示和的链表
     */
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

//        while的写法
//        int i = 0;
//        // 同时遍历两个链表
//        while (i < l1.size() || i < l2.size()) {
//            int num1 = (i < l1.size()) ? l1.get(i) : 0;
//            int num2 = (i < l2.size()) ? l2.get(i) : 0;
//            int sum = num1 + num2 + carry;
//            carry = sum / 10;
//            result.add(sum % 10);
//            i++;
//        }
        // for的写法
        for (int i=0; i<l1.size() || i<l2.size() ;i++){
            int num1 = (i < l1.size()) ? l1.get(i) : 0;
            int num2 = (i < l2.size()) ? l2.get(i) : 0;
            int sum = num1+num2+carry;
            carry = sum / 10;
            // 余数入结果链表
            result.add(sum%10);
        }
        // 处理最后可能的进位
        if (carry > 0) {
            result.add(carry);
        }
        return result;
    }

    // 自定义链表
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 求两个倒序自定义链表之和
     * @param l1 自定义整数链表1
     * @param l2 自定义整数链表2
     * @return 结果链表
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // 哑节点简化边界处理
        ListNode current = dummyHead;         // 当前节点指针用于构建新链表
        int carry = 0;                         // 进位值

        // 遍历两个链表或处理剩余进位
        while (l1 != null || l2 != null || carry != 0) {
            // 获取当前节点的值，若链表已结束则用0代替
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // 计算当前位的和及新的进位
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            // 创建新节点并移动指针
            current.next = new ListNode(sum % 10);
            current = current.next;

            // 移动原链表指针（如果未到末尾）
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next; // 哑节点的next即为结果链表的头节点
    }

}
