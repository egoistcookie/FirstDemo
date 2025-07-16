package com.algorithm;

import java.util.*;

public class AlgorithmAboutCollection150 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        AlgorithmAboutCollection150 ac = new AlgorithmAboutCollection150();

        // 88.合并两个有序数组
        // 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
        // 解法：从后往前的双指针遍历
        // ac.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

        // 27.移除元素
        // 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
        // 解法：双指针法
        // System.out.println(ac.removeElement(new int[]{3,2,2,3},3));
        // System.out.println(ac.removeElement(new int[]{0,1,2,2,3,0,4,2},2));

        // 26.删除有序数组中的重复项
        // 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
        // 解法：双指针法，按序遍历
        // System.out.println(ac.removeDuplicates(new int[]{1,1,2}));
        // System.out.println(ac.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        // 80.删除有序数组中的重复项
        // 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
        // 解法：双指针
        // System.out.println(ac.removeDuplicates(new int[]{1,1,1,2,2,3}));
        // System.out.println(ac.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));

        // 274.H指数
        // 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
        // 一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
        // 解法：计数排序法，额外数组统计引用次数分布。
        // System.out.println(ac.hIndex(new int[]{3,0,6,1,5}));
        // System.out.println(ac.hIndex(new int[]{1,3,1}));

        // 122.买卖股票的最佳时机2
        // 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
        // 解法：贪心算法
        // System.out.println(ac.maxProfit(new int[]{7,1,5,3,6,4}));
        // System.out.println(ac.maxProfit(new int[]{1,2,3,4,5}));
        // System.out.println(ac.maxProfit(new int[]{7,6,4,3,1}));

        // 134.加油站
        // 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
        // 从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
        // 如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。
        // 解法：贪心算法
        // System.out.println(ac.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
        // System.out.println(ac.canCompleteCircuit(new int[]{2,3,4},new int[]{3,4,3}));

        // 135.分发糖果
        // n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
        // 解法：正序倒序两次贪心算法
        // System.out.println(ac.candy(new int[]{1,3,2,2,1}));
        // System.out.println(ac.candy(new int[]{1}));
        // System.out.println(ac.candy(new int[]{1,0,2}));

        // 13.罗马数字转整数
        // 给定一个罗马数字，将其转换成整数。
        // 解法：一次遍历，map存映射
        // System.out.println(ac.romanToInt("III"));
        // System.out.println(ac.romanToInt("IV"));
        // System.out.println(ac.romanToInt("IX"));
        // System.out.println(ac.romanToInt("LVIII"));
        // System.out.println(ac.romanToInt("MCMXCIV"));

        // 12.整数转罗马数字
        // 给定一个整数，将其转换为罗马数字。
        // 解法：贪心算法，LinkedHashMap保持键值对的插入顺序（从大到小）
        // System.out.println(ac.intToRoman(3749));

        // 58.最后一个单词的长度
        // 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
        // 解法：倒序遍历
        // System.out.println(ac.lengthOfLastWord("World"));
        // System.out.println(ac.lengthOfLastWord("   fly me   to   the moon  "));
        // System.out.println(ac.lengthOfLastWord("luffy is still joyboy"));

        // 14.最长公共前缀
        // 编写一个函数来查找字符串数组中的最长公共前缀。
        // 解法：纵向扫描：逐列比较所有字符串的同一位置字符，直到出现不匹配或某字符串结束
        // System.out.println(ac.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        // System.out.println(ac.longestCommonPrefix(new String[]{"dog","racecar","car"}));

        // 151.反转字符串中的单词
        // 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
        // 解法：遍历+栈存单词。或者双指针反转。
        // System.out.println(ac.reverseWords("the sky is blue"));
        // System.out.println(ac.reverseWords("  hello world  "));
        // System.out.println(ac.reverseWords("a good   example"));

        // 28.找出字符串中第一个匹配项的下标
        // 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
        // 如果 needle 不是 haystack 的一部分，则返回  -1 。
        // 解法：indexOf
        // System.out.println(ac.strStr("sadbutsad","sad"));
        // System.out.println(ac.strStr("leetcode","leeto"));

        // 68.文本左右对齐
        // 给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
        // 尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充。
        // 尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
        // 解法：贪心算法，均匀分配空格和最后一行特殊处理
        // List<String> fullRe = ac.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        // List<String> fullRe = ac.fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16);
        // // List<String> fullRe = ac.fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20);
        // for (String str : fullRe) {
        //     System.out.println(str);
        // }

        // 125.验证回文串
        // 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
        // 解法：双指针
        // System.out.println(ac.isPalindrome("A man, a plan, a canal: Panama"));
        // System.out.println(ac.isPalindrome("race a car"));
        // System.out.println(ac.isPalindrome(" "));

        // 392.判断子序列
        // 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
        // 解法：双指针
        // System.out.println(ac.isSubsequence("abc","ahbgdc"));
        // System.out.println(ac.isSubsequence("axc","ahbgdc"));

        // 209.长度最小的连续子数组
        // 给定一个含有 n 个正整数的数组和一个正整数 target 。
        // 找出该数组中满足其总和大于等于 target 的长度最小的 子数组
        // 解法：滑动窗口
        // System.out.println(ac.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        // System.out.println(ac.minSubArrayLen(4,new int[]{1,4,4}));
        // System.out.println(ac.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));

        // 383.赎金信
        // 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
        // 如果可以，返回 true ；否则返回 false 。
        // 解法：数组保存字母出现次数
        // System.out.println(ac.canConstruct("a","b"));
        // System.out.println(ac.canConstruct("aa","ab"));
        // System.out.println(ac.canConstruct("aa","aab"));

        // 205.同构字符串
        // 给定两个字符串 s 和 t ，判断它们是否是同构的。
        // 解法：以两个hashmap保存各自结构做对比
        // System.out.println(ac.isIsomorphic("badc","baba"));

        // 290.单词规律
        // 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
        // 解法：两个hashmap双向映射char与string，a代表dog，cat代表b
        // System.out.println(ac.wordPattern("abba","dog cat cat dog"));
        // System.out.println(ac.wordPattern("abba","dog cat cat fish"));
        // System.out.println(ac.wordPattern("aaaa","dog cat cat fish"));
        // System.out.println(ac.wordPattern("abba","dog dog dog dog"));

        // 104.二叉树的最大深度
        // 给定一个二叉树 root ，返回其最大深度。
        // 解法：递归左右树
        // TreeNode root = new TreeNode(3);
        // root.left = new TreeNode(9);
        // root.right = new TreeNode(20);
        // root.right.left = new TreeNode(15);
        // root.right.right = new TreeNode(7);
        // System.out.println(ac.maxDepth(root));

        // 100.相同的树
        // 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
        // 解法：递归
        // TreeNode p = new TreeNode(1);
        // p.left = new TreeNode(2);
        // p.right = new TreeNode(3);
        // TreeNode q = new TreeNode(1);
        // q.left = new TreeNode(2);
        // q.right = new TreeNode(3);
        // System.out.println(ac.isSameTree(p,q));

        // 226.翻转二叉树
        // 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
        // 解法：递归
        // TreeNode p = new TreeNode(2);
        // p.left = new TreeNode(1);
        // p.right = new TreeNode(3);
        // System.out.println(ac.invertTree(p).left.val);

        // 36.有效的数组
        // 请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
        // 解法：hashmap记录每行每列每个3x3
        // System.out.println(ac.isValidSudoku(new char[][]{{1,1},{2,2},{3,3}}));

        // 228.汇总区间
        // 给定一个  无重复元素 的 有序 整数数组 nums 。
        // 区间 [a,b] 是从 a 到 b（包含）的所有整数的集合。
        // 解法：一次遍历
        // System.out.println(ac.summaryRanges(new int[]{0,1,2,4,5,7}));

        // 56.合并区间
        // 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
        // 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
        // 解法：先排序再遍历合并
        // int[][] re = ac.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        // System.out.println(re[0][1]);

        // 17.电话号码的排列组合
        // 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
        // 解法：递归回溯
        // List<String> ret = ac.letterCombinations("23");
        // for(String str : ret){
        //     System.out.println(str + " ");
        // }

        // 167.两数之和
        // 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。
        // 如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
        // 解法:双指针法
        // int[] ret = ac.twoSum(new int[]{1,3,4,5,6,7,11,15},9);
        // System.out.println(ret[0] + ":" +ret[1]);

        // 71.简化路径
        // 给你一个字符串 path ，表示指向某一文件或目录的 Unix 风格 绝对路径 （以 '/' 开头），请你将其转化为 更加简洁的规范路径。
        // 解法：ArrayDeque来模拟栈
        // System.out.println(ac.simplifyPath("/.../a/../b/c/../d/./"));

        // 67.二进制求和
        // 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
        // 解法：循环与进位
        // System.out.println(ac.addBinary("11","1"));
        // System.out.println(ac.addBinary("1010","1011"));

        // 150.逆波兰表达式求值
        // 给你一个字符串数组 tokens ，表示一个根据 逆波兰表示法 表示的算术表达式。
        // 请你计算该表达式。返回一个表示表达式值的整数。
        // 解法：ArrayDeque模拟栈
        // System.out.println(ac.evalRPN(new String[]{"2","1","+","3","*"}));
        // System.out.println(ac.evalRPN(new String[]{"4","13","5","/","+"}));
        // System.out.println(ac.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));

        // 155.最小栈
        // 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
        // 解法：自定义Node，存储最小值
        // MinStack minStack = new MinStack();
        // minStack.push(-2);
        // minStack.push(0);
        // minStack.push(-3);
        // System.out.println(minStack.getMin());
        // minStack.pop();
        // System.out.println(minStack.top());
        // System.out.println(minStack.getMin());

        // 120.三角形最小路径和
        // 给定一个三角形 triangle ，找出自顶向下的最小路径和。
        // 解法：二维动态规划，计划每个未知的最小路径和
        // List<Integer> l1 = new ArrayList<>();
        // l1.add(2);
        // List<Integer> l2 = new ArrayList<>();
        // l2.add(3);
        // l2.add(4);
        // List<Integer> l3 = new ArrayList<>();
        // l3.add(6);
        // l3.add(5);
        // l3.add(7);
        // List<Integer> l4 = new ArrayList<>();
        // l4.add(4);
        // l4.add(1);
        // l4.add(8);
        // l4.add(3);
        // List<List<Integer>> list = new ArrayList<>();
        // list.add(l1);list.add(l2);list.add(l3);list.add(l4);
        // System.out.println(ac.minimumTotal(list));
        // List<List<Integer>> list1 = new ArrayList<>();
        // List<Integer> l11 = new ArrayList<>();
        // l11.add(-11);list1.add(l11);
        // System.out.println(ac.minimumTotal(list1));

        // 3.无重复字符的最长子串
        // 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
        // 解法：滑动窗口+哈希表,存该字符上次出现的位置
        // System.out.println(ac.lengthOfLongestSubstring("abcabcbb"));
        // System.out.println(ac.lengthOfLongestSubstring("bbbbb"));
        // System.out.println(ac.lengthOfLongestSubstring("pwwkew"));

        // 105.从前序和中序遍历序列构建二叉树
        // 给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
        // 解法：哈希存中序序列+递归组装
        // System.out.println(ac.buildTree(new int[]{3,9,20,15,7},new int []{9,3,15,20,7}).val);

        // 106.从中序和后序遍历序列构建二叉树
        // 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回这颗 二叉树 。
        // 解法：哈希存中序序列+递归组装
        // System.out.println(ac.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3}).val);

        // 373.查找和最小的k对数字
        // 给定两个以 非递减顺序排列 的整数数组 nums1 和 nums2 , 以及一个整数 k 。
        // 请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
        // 解法：优先队列+lambda自定义比较器
        // List<List<Integer>> ret = ac.kSmallestPairs(new int[]{1,7,11},new int[]{2,4,6},4);
        // for(List<Integer> list : ret){
        //     System.out.println(list.get(0)+" "+list.get(1));
        // }

        // 215.数组中的第k个最大元素
        // 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
        // 解法：默认优先队列
        // System.out.println(ac.findKthLargest(new int[]{3,2,1,5,6,4},2));

        // 909.蛇梯棋
        // 给你一个大小为 n x n 的整数矩阵 board ，方格按从 1 到 n2 编号，编号遵循 转行交替方式 ，从左下角开始 （即，从 board[n - 1][0] 开始）的每一行改变方向。
        // 你一开始位于棋盘上的方格  1。每一回合，玩家需要从当前方格 curr 开始出发，
        // 返回达到编号为 n2 的方格所需的最少掷骰次数，如果不可能，则返回 -1。
        // 解法：二维矩阵转一维数组+广度搜索
        // System.out.println(ac.snakesAndLadders(new int[][]{{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1}
        //         ,{-1,35,-1,-1,13,-1},{-1,-1,-1,-1,-1,-1},{-1,15,-1,-1,-1,-1}}));

        // 433.最小基因变化
        // 基因序列可以表示为一条由 8 个字符组成的字符串，其中每个字符都是 'A'、'C'、'G' 和 'T' 之一。
        // 假设我们需要调查从基因序列 start 变为 end 所发生的基因变化。一次基因变化就意味着这个基因序列中的一个字符发生了变化。
        // 给你两个基因序列 start 和 end ，以及一个基因库 bank ，请你找出并返回能够使 start 变化为 end 所需的最少变化次数。如果无法完成此基因变化，返回 -1 。
        // 解法：广度搜索，探索所有可能的单字符变化路径
        // System.out.println(ac.minMutation("AACCGGTT","AACCGGTA",new String[]{"AACCGGTA"}));
        // System.out.println(ac.minMutation("AACCGGTT","AAACGGTA",new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"}));
        // System.out.println(ac.minMutation("AAAAACCC","AACCCCCC",new String[]{"AAAACCCC","AAACCCCC","AACCCCCC"}));


        // 127.单词接龙
        // 给你两个单词 beginWord 和 endWord 和一个字典 wordList ，返回 从 beginWord 到 endWord 的 最短转换序列 中的 单词数目 。如果不存在这样的转换序列，返回 0 。
        // 解法：广度搜索，每次每位遍历24字母
        // List<String> wordList = new ArrayList<>();
        // wordList.add("hot");wordList.add("dot");wordList.add("dog");
        // wordList.add("lot");wordList.add("log");wordList.add("cog");
        // System.out.println(ac.ladderLength("hit","cog",wordList));


        // 130.被环绕的区域
        // 给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' 组成，捕获 所有 被围绕的区域：
        // 通过 原地 将输入矩阵中的所有 'O' 替换为 'X' 来 捕获被围绕的区域。你不需要返回任何值。
        // 解法：DFS深度搜索，先把接触边缘的O全部替换为T
        // char[][] charArray = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        // ac.solve(charArray);
        // for(int i =0;i<charArray.length;i++){
        //     for(int j=0;j<charArray[0].length;j++){
        //         System.out.print(charArray[i][j]);
        //     }
        //     System.out.println();
        // }


        // 133.克隆图
        // 给你无向 连通 图中一个节点的引用，请你返回该图的 深拷贝（克隆）。
        // 解法：哈希防重 + 深度搜索 DFS
        Node node = new Node(2);
        System.out.println(ac.cloneGraph(node).val);


    }


    /**
     * 133.克隆图
     * @param node
     * @return
     */
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // 如果该节点已经被访问过，则直接从哈希表中取出对应的克隆节点返回
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // 克隆节点，注意为了简单，先不克隆邻居节点
        Node cloneNode = new Node(node.val, new ArrayList<>());
        // 哈希表存储
        visited.put(node, cloneNode);

        // 遍历该节点的邻居节点并更新克隆节点的邻居列表
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }
    private Map<Node, Node> visited = new HashMap<>();

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    /**
     * 130.被环绕的区域
     * @param board
     */
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;

        // 处理第一列和最后一列
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {
                dfs(board, i, n - 1);
            }
        }

        // 处理第一行和最后一行
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                dfs(board, m - 1, j);
            }
        }

        // 遍历整个矩阵，将'O'改为'X'，将'T'改回'O'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'T'; // 标记为临时字符

        // 向四个方向递归
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }

    /**
     * 127.单词接龙
     * @param beginWord "hit"
     * @param endWord "cog"
     * @param wordList ["hot","dot","dog","lot","log","cog"]
     * @return
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;

        Set<String> wordSet = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        visited.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                if (curr.equals(endWord)) return level;

                char[] chars = curr.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char original = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;
                        chars[j] = c;
                        String next = new String(chars);
                        if (wordSet.contains(next) && !visited.contains(next)) {
                            queue.offer(next);
                            visited.add(next);
                        }
                    }
                    chars[j] = original;
                }
            }
            level++;
        }
        return 0;
    }

    /**
     * 433.最小基因变化
     * @param startGene "AACCGGTT"
     * @param endGene "AAACGGTA"
     * @param bank ["AACCGGTA","AACCGCTA","AAACGGTA"]
     * @return 2
     */
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(endGene)) return -1;

        char[] genes = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(startGene);
        visited.add(startGene);
        int mutations = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(endGene)) return mutations;

                // 尝试改变每一个字符
                for (int j = 0; j < current.length(); j++) {
                    char[] chars = current.toCharArray();
                    for (char g : genes) {
                        if (chars[j] == g) continue;
                        chars[j] = g;
                        String next = new String(chars);
                        if (bankSet.contains(next) && !visited.contains(next)) {
                            queue.offer(next);
                            visited.add(next);
                        }
                    }
                }
            }
            mutations++;
        }
        return -1;
    }

    /**
     * 909.蛇梯棋
     * @param board
     * @return
     */
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int target = n * n;
        // 将二维坐标转换为一维编号
        Map<Integer, Integer> jumpMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = getBoardNumber(n, i, j);
                if (board[i][j] != -1) {
                    jumpMap.put(num, board[i][j]);
                }
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(1);
        visited.add(1);
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == target) {
                    return steps;
                }
                // 尝试所有可能的骰子点数
                for (int dice = 1; dice <= 6; dice++) {
                    int next = current + dice;
                    if (next > target) {
                        continue;
                    }
                    // 检查是否有蛇或梯子
                    if (jumpMap.containsKey(next)) {
                        next = jumpMap.get(next);
                    }

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
            steps++;
        }
        return -1; // 无法到达终点
    }
    // 根据行列获取棋盘编号
    private int getBoardNumber(int n, int row, int col) {
        // 棋盘编号从左下角开始，蛇形排列
        int base = (n - 1 - row) * n;
        if ((n - 1 - row) % 2 == 0) { // 从左到右
            return base + col + 1;
        } else { // 从右到左
            return base + (n - col);
        }
    }

    /**
     * 215.数组中的第k个最大元素
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
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
     * 373.查找和最小的k对数字
     * @param nums1 1,7,11
     * @param nums2 2,4,6
     * @param k 3
     * @return [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return result;
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            heap.offer(new int[]{nums1[i], nums2[0], 0});
        }

        while (k-- > 0 && !heap.isEmpty()) {
            int[] current = heap.poll();
            result.add(Arrays.asList(current[0], current[1]));
            if (current[2] + 1 < nums2.length) {
                heap.offer(new int[]{current[0], nums2[current[2] + 1], current[2] + 1});
            }
        }

        return result;
    }

    /**
     * 106.从中序和后序遍历序列构建二叉树
     * @param inorder [9,3,15,20,7]
     * @param postorder [9,15,7,20,3]
     * @return [3,9,20,null,null,15,7]
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrderMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            inOrderMap.put(inorder[i],i);
        }
        return buildSubTree(postorder,0,postorder.length-1,0,inorder.length-1);
    }
    public static Map<Integer,Integer> inOrderMap;
    public static TreeNode buildSubTree(int[] postorder,int postStart,int postEnd,int inStart,int inEnd) {
        if(postStart>postEnd || inStart>inEnd){
            return null;
        }
        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = inOrderMap.get(rootValue);
        int leftLength = rootIndex - inStart;
        root.left = buildSubTree(postorder,postStart,postStart+leftLength-1,inStart,rootIndex-1);
        root.right = buildSubTree(postorder,postStart+leftLength,postEnd-1,rootIndex + 1,inEnd);
        return root;
    }

    /**
     * 105.从前序和中序遍历序列构建二叉树
     * @param preorder
     * @param inorder
     * @return
     */
    // public TreeNode buildTree(int[] preorder, int[] inorder) {
    //     inOrderMap = new HashMap<>();
    //     for(int i=0;i<inorder.length;i++){
    //         inOrderMap.put(inorder[i],i);
    //     }
    //     return buildSubTree(preorder,0,preorder.length-1,0,inorder.length-1);
    // }
    // public static TreeNode buildSubTree(int[] int rootValue = preorder[preStart];preorder,int preStart,int preEnd,int inStart,int inEnd){
    //     if(preStart > preEnd || inStart > inEnd){
    //         return null;
    //     }
    //     // 根节点是前序遍历的第一个元素
    //
    //     TreeNode root = new TreeNode(rootValue);
    //     // 在中序遍历中找到根节点的位置
    //     int rootIndex = inOrderMap.get(rootValue);
    //     int subSize = rootIndex - inStart;
    //     root.left = buildSubTree(preorder,preStart+1,preStart + subSize,inStart,rootIndex-1);
    //     root.right = buildSubTree(preorder,preStart+subSize+1,preEnd,rootIndex+1,inEnd);
    //     return root;
    // }


    /**
     * 3.无重复字符的最长子串
     * @param s abcabcbb
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if(map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    /**
     * 120.三角形最小路径和
     * @param triangle [[2],[3,4],[6,5,7],[4,1,8,3]]
     * @return 2 + 3 + 5 + 1 = 11
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) return 0;
        int n = triangle.size();
        int[] dp = new int[n];
        // 初始化最后一行
        for (int j = 0; j < triangle.get(n-1).size(); j++) {
            dp[j] = triangle.get(n-1).get(j);
        }
        // 自底向上递推
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }


    /**
     * 155.最小栈
     */
    static class MinStack {

        private static class Node {
            int val;
            int min;
            Node next;

            public Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }

        private Node head;

        public MinStack() {
            head = null;
        }

        public void push(int val) {
            if (head == null) {
                head = new Node(val, val, null);
            } else {
                head = new Node(val, Math.min(val, head.min), head);
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }
    }


    /**
     * 150.逆波兰表达式求值
     * @param tokens {"2","1","+","3","*"}
     * @return
     */
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "-": int num2 = stack.pop(), num1 = stack.pop(); stack.push(num1 - num2); break;
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "/": num2 = stack.pop(); num1 = stack.pop(); stack.push(num1 / num2); break;
                default: stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    /**
     * 67.二进制求和
     * @param a "11"
     * @param b "1"
     * @return "100"
     */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }


    /**
     * 71.简化路径
     * @param path "/.../a/../b/c/../d/./"
     * @return "/.../b/d"
     */
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else {
                stack.addLast(part);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollFirst());
        }
        return sb.toString();
    }


    /**
     * 167.两数之和
     * @param numbers {1,2,3,4,5,6,11,15}
     * @param target 9
     * @return {1,2}
     */
    public int[] twoSum(int[] numbers, int target) {

        int left = 0,right = numbers.length-1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                break;
            }else{
                if(numbers[right] > target-numbers[left]){
                    right --;
                }else{
                    left ++;
                }
            }
        }
        return new int[]{left+1,right+1};
    }

    /**
     * 17.电话号码的排列组合
     * @param digits "23"
     * @return ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     */
    // 数字到字母的映射表
    private static final String[] MAPPING = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current,
                           String digits, int index) {
        // 终止条件：当前组合长度等于输入数字长度
        if (current.length() == digits.length()) {
            result.add(current.toString());
            return;
        }

        // 获取当前数字对应的字母集合
        String letters = MAPPING[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);  // 选择当前字母
            backtrack(result, current, digits, index + 1);  // 递归处理下一个数字
            current.deleteCharAt(current.length() - 1);  // 回溯，撤销选择
        }
    }

    /**
     * 56.合并区间
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        // 1. 按区间起始点排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        // 2. 合并重叠区间
        for (int i = 1; i < intervals.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] current = intervals[i];
            if (current[0] <= last[1]) {
                // 合并区间，更新结束点
                last[1] = Math.max(last[1], current[1]);
            } else {
                merged.add(current);
            }
        }
        // 3. 转换List到二维数组
        return merged.toArray(new int[merged.size()][]);
    }


    /**
     * 228.汇总区间
     * @param nums
     * @return
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1] + 1) {
                // 区间结束
                if (nums[i-1] == start) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i-1]);
                }
                start = nums[i];
            }
        }

        // 处理最后一个区间
        if (nums[nums.length-1] == start) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length-1]);
        }

        return result;
    }

    /**
     * 36.有效的数组
     */
    public boolean isValidSudoku(char[][] board) {
        // 检查每行
        for (int i = 0; i < 9; i++) {
            int[] rowCount = new int[10]; // 记录每行数字出现次数
            int[] colCount = new int[10]; // 记录每列数字出现次数
            for (int j = 0; j < 9; j++) {
                // 检查行
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0'; // 将字符转换为数字(1-9)
                    if (rowCount[num]++ > 0) {
                        return false;
                    }
                }
                // 检查列
                if (board[j][i] != '.') {
                    int num = board[j][i] - '0';
                    if (colCount[num]++ > 0) {
                        return false;
                    }
                }
            }
        }

        // 检查3x3子方格
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] subBoxCount = new int[10];
                // 遍历当前3x3子方格
                for (int p = i; p < i + 3; p++) {
                    for (int q = j; q < j + 3; q++) {
                        if (board[p][q] != '.') {
                            int num = board[p][q] - '0';
                            if (subBoxCount[num]++ > 0) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    /**
     * 226.翻转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    /**
     * 100.相同的树
     * @param p [1,2,3]
     * @param q [1,2,3]
     * @return true
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 两个节点都为空
        if (p == null && q == null) {
            return true;
        }
        // 只有一个节点为空
        if (p == null || q == null) {
            return false;
        }
        // 节点值不相等
        if (p.val != q.val) {
            return false;
        }
        // 递归比较左右子树
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    /**
     * 104.二叉树的最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    /**
     * 290.单词规律
     * @param pattern "abba"
     * @param s "dog cat cat dog"
     * @return true
     */
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // 检查字符→单词的映射是否一致
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) return false;
            } else {
                charToWord.put(c, word);
            }
            // 检查单词→字符的映射是否一致
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) return false;
            } else {
                wordToChar.put(word, c);
            }
        }
        return true;
    }

    /**
     * 205.同构字符串
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,String> retMap = new HashMap<>();
        HashMap<Character,String> retMapT = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            char chr = s.charAt(i);
            char chrT = t.charAt(i);
            if(retMap.containsKey(chr)){
                if(!retMapT.containsKey(chrT)){
                    return false;
                }
                String indexStr = retMap.get(chr);
                String indexStrT = retMapT.get(chrT);
                if(!indexStr.equals(indexStrT)){
                    return false;
                }
                retMap.put(chr,indexStr+i );
                retMapT.put(chrT,indexStrT+i );
            }else{
                if(retMapT.containsKey(chrT)){
                    return false;
                }
                retMap.put(chr,i+"");
                retMapT.put(chrT,i+"");
            }
        }
        return true;

    }

    /**
     * 383.赎金信
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) count[c - 'a']++;
        for (char c : ransomNote.toCharArray()) {
            if (--count[c - 'a'] < 0) return false;
        }
        return true;
    }


    /**
     * 209.长度最小的子数组
     * @param target 7
     * @param nums {2,3,1,2,4,3}
     * @return 2
     */
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, sum = 0, minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right]; // 扩展窗口，加入当前元素

            // 窗口内的和大于等于 target 时，尝试缩小窗口
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left]; // 移动左指针，缩小窗口
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    /**
     * 392.判断子序列
     * @param s "abc"
     * @param t "ahbgdc"
     * @return true
     */
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true; // 处理空串
        int fast = 0, slow = 0;
        while (fast < t.length()) {
            if (s.charAt(slow) == t.charAt(fast)) {
                slow++;
                if (slow == s.length()) { // 全部匹配完成
                    return true;
                }
            }
            fast++;
        }
        return false;
    }

    /**
     * 125.验证回文串
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0,right=str.length()-1;
        boolean isPalindrome = true;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    /**
     * 68.文本左右对齐
     *
     * @param words    {"This", "is", "an", "example", "of", "text", "justification."}
     * @param maxWidth 16
     * @return "This    is    an",
            * "example  of text",
            * "justification.  "
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLength = 0;

        for (String word : words) {
            if (currentLength + currentLine.size() + word.length() > maxWidth) {
                // 处理非最后一行
                int totalSpaces = maxWidth - currentLength;
                StringBuilder line = new StringBuilder();
                if (currentLine.size() == 1) {
                    line.append(currentLine.get(0));
                    line.append(" ".repeat(totalSpaces));
                } else {
                    int baseSpaces = totalSpaces / (currentLine.size() - 1);
                    int extraSpaces = totalSpaces % (currentLine.size() - 1);
                    for (int i = 0; i < currentLine.size(); i++) {
                        line.append(currentLine.get(i));
                        if (i < currentLine.size() - 1) {
                            int spaces = baseSpaces + (i < extraSpaces ? 1 : 0);
                            line.append(" ".repeat(spaces));
                        }
                    }
                }
                result.add(line.toString());
                currentLine.clear();
                currentLength = 0;
            }
            currentLine.add(word);
            currentLength += word.length();
        }

        // 处理最后一行（左对齐）
        if (!currentLine.isEmpty()) {
            String lastLine = String.join(" ", currentLine);
            lastLine += " ".repeat(maxWidth - lastLine.length());
            result.add(lastLine);
        }

        return result;
    }

    /**
     * 28.找出字符串中第一个匹配项的下标
     *
     * @param haystack "sadbutsad"
     * @param needle   "sad"
     * @return 0
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * 151.反转字符串中的单词
     *
     * @param s "the sky is blue"
     * @return "blue is sky the"
     */
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String subStr = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i <= s.length(); i++) {
            char chr = i == s.length() ? ' ' : s.charAt(i);
            if (chr != ' ') {
                subStr += chr;
            } else {
                if (!subStr.isEmpty()) {
                    stack.push(subStr);
                    subStr = "";
                }
            }
        }
        while (!stack.isEmpty()) {
            str.append(stack.pop() + " ");
        }
        return str.toString().trim();
    }

    /**
     * 14.最长公共前缀
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    /**
     * 58.最后一个单词的长度
     *
     * @param s "Hello World"
     * @return 5
     */
    public int lengthOfLastWord(String s) {
        int result = 0;
        boolean existWord = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char chr = s.charAt(i);
            if (chr != ' ') {
                result++;
                existWord = true;
            } else if (existWord) {
                break;
            }
        }
        return result;
    }

    /**
     * 12.整数转罗马数字
     *
     * @param num 3749
     * @return "MMMDCCXLIX"
     */
    public String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder roman = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (num >= value) {
                roman.append(symbol);
                num -= value;
            }
        }

        return roman.toString();

    }

    /**
     * 13.罗马数字转整数
     *
     * @param s "MCMXCIV"
     * @return 1994
     */
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                ans += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                ans += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return ans;
    }

    /**
     * 135.分发糖果s
     *
     * @param ratings 1,0,2
     * @return 2+1+2 =5
     */
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        // 从左到右
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        // 从右到左
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        // 统计总数
        int total = 0;
        for (int num : candies) total += num;
        return total;
    }

    /**
     * 134.加油站
     *
     * @param gas  {1,2,3,4,5}
     * @param cost {3,4,5,1,2}
     * @return 3
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) return -1;

        int currentGas = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }
        return start;
    }

    /**
     * 122.买卖股票的最佳时机2
     *
     * @param prices {7,1,5,3,6,4}
     * @return 4+3 = 7
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxP = 0;
        int subN = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                subN = prices[i] - prices[i - 1];
                maxP += subN;
            }
        }
        return maxP;

    }

    /**
     * 274.H指数
     *
     * @param citations {3,0,6,1,5}
     * @return 3
     */
    public int hIndex(int[] citations) {

        int n = citations.length;
        int[] count = new int[n + 1];
        for (int c : citations) {
            count[Math.min(c, n)]++;
        }
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }
        return 0;

    }


    /**
     * 80.删除有序数组中的重复项
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            } else if (slow == 0 || nums[slow - 1] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    /**
     * 26.删除有序数组中的重复项
     * @param nums {1,1,2}
     * @return 2
     */
    // public int removeDuplicates(int[] nums) {
    //     if (nums.length == 0) return 0;
    //     int slow = 0;
    //     for (int fast = 1; fast < nums.length; fast++) {
    //         if (nums[fast] != nums[slow]) {
    //             slow++;
    //             nums[slow] = nums[fast];
    //         }
    //     }
    //     return slow + 1;
    // }

    /**
     * 27.移除元素
     *
     * @param nums {3,2,2,3}
     * @param val  3
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    /**
     * 合并两个有序数组
     *
     * @param nums1 1,2,3,0,0,0
     * @param m     3
     * @param nums2 2,5,6
     * @param n     3
     *              1,2,2,3,5,6
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur1 = m - 1, cur2 = n - 1, i = m + n - 1;
        while (cur1 >= 0 && cur2 >= 0) {
            nums1[i--] = (nums1[cur1] > nums2[cur2]) ? nums1[cur1--] : nums2[cur2--];
        }
        while (cur2 >= 0) {
            nums1[i--] = nums2[cur2--];
        }
    }


}
