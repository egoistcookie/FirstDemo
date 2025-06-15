package com.algorithm;

import java.util.*;

public class AlgorithmAboutCollection150 {

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
        List<String> fullRe = ac.fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16);
        // List<String> fullRe = ac.fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20);
        for (String str : fullRe) {
            System.out.println(str);
        }


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
