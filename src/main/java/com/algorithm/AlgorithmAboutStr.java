package com.algorithm;

import java.util.*;

/**
 * 字符类的算法类
 */
public class AlgorithmAboutStr {

    public static void main(String[] args) {

        // 力扣算法3.找一个字符串中最长不重复子串的长度
        // String str1 = "dadv";
        // System.out.println(getMaxChildStrLength(str1));

        // 力扣算法5.找到字符串中最长的 回文 子串。（回文：正序逆序都一样）
        // String str = "cbabad";
        // String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        // String reStr = getManacher(str);
        // System.out.println(reStr);

        // 力扣算法8.字符串转换为整数
        // String str = " -42";
        // System.out.println(myAtoiByDs("42"));          // 输出: 42
        // System.out.println(myAtoiByDs("   -42"));      // 输出: -42
        // System.out.println(myAtoiByDs("4193 with words")); // 输出: 4193
        // System.out.println(myAtoiByDs("+-12"));   // 仅识别第一个有效符号 输出: 0
        // System.out.println(myAtoiByDs("-91283472332"));    // 输出: -2147483648（溢出）

        // 力扣算法20.有效括号 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
        // stack初接触，原来jdk1.0就有了这种数据结构，先入后出结构，push为压入，pop为取出
        // System.out.println(judgeIsRightStr("()"));
        // System.out.println(judgeIsRightStr("()[]{}"));
        // System.out.println(judgeIsRightStr("(]"));
        // System.out.println(judgeIsRightStr("([])"));
        // System.out.println(judgeIsRightStr("([)]"));

        // 力扣算法394.字符串解码
        // 给定一个经过编码的字符串，返回它解码后的字符串。
        // 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
        // 解法：两个栈，一个装重复字符的数量，一个装重复字符的内容，比较坑的地方在于其数量可能不止一位
        // System.out.println(decodeString("3[a]2[bc]"));
        // System.out.println(decodeString("3[a2[c]]"));
        // System.out.println(decodeString("2[abc]3[cd]ef"));
        // System.out.println(decodeString("abc3[cd]xyz"));
        // System.out.println(decodeString("100[leetcode]"));

        // 算法6.Z字型变幻
        // 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
        // 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
        // P   A   H   N
        // A P L S I I G
        // Y   I   R
        // 输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 PINALSIGYAHRPI
        // 解法：逐个元素添加到对应行，有多少行数就建多少个StringBuffer，行数趋势初始为增大，遇到顶端就变为减小，遇到下一个顶端再变为增大，多次for循环也为On
        // System.out.println(convert("PAYPALISHIRING",3));
        // System.out.println(convert("PAYPALISHIRING",4));
        // System.out.println(convert("A",1));
        // System.out.println(convert("A",2));
        // System.out.println(convert("",0));

        // 10.正则表达式匹配
        // 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
        // '.' 匹配任意单个字符
        // '*' 匹配零个或多个前面的那一个元素
        // 解法：动态规划或者递归回溯
        // System.out.println(isMatch("aaaa","a*"));
        // System.out.println(isMatch("aa","a"));
        // System.out.println(isMatch("aa",".*"));

        // 17.电话号码的字母组合
        // 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
        // 解法：递归+回溯
        // List<String> rel1 = letterCombinations("234");
        // List<String> rel = letterCombinations("");
        // for(String s : rel){
        //     System.out.println(s);
        // }

        // 560.和为k的子数组
        // 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。子数组是数组中元素的连续非空序列。
        // 解法：递归+回溯，比较低效，时间复杂度为n的阶乘
        // 用前缀和+哈希表，复杂度仅为On，前缀和算法主要是针对连续序列
        // System.out.println(subarraySum(new int[]{1,1,1},2));
        // System.out.println(subarraySum(new int[]{1,2,3},3));

        // 76.最小覆盖子串
        // 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
        // 解法：统计字符频率+双指针滑动窗口
        // System.out.println(minWindow("ADOBECODEBANC","ABC"));
        // System.out.println(minWindow("a","a"));
        // System.out.println(minWindow("a","aa"));

        AlgorithmAboutStr as = new AlgorithmAboutStr();
        // 131.分割回文串
        // 给你一个字符串 s，请你将 s 分割成一些 子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
        as.partition("aab");



    }


    /**
     * 给你一个字符串 s，请你将 s 分割成一些 子串，使每个子串都是 回文串 。
     * @param s "aab"
     * @return ["a","a","b"],["aa","b"]
     */
    public List<List<String>> partition(String s) {
        int start =0,end = 0;
        subPartition(s,start,end);

        return partitionList;
    }
    private void subPartition(String s, int start, int end) {

        String subStr = s.substring(start,end);
        if(subStr.length()==1){
            List<String> subList = new ArrayList<>();
            subList.add(subStr);
            partitionList.add(subList);
        }

    }

    private List<List<String>> partitionList = new ArrayList<>();



    static public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) map[c]++;
        int left = 0, right = 0, count = t.length(), minLen = Integer.MAX_VALUE, start = 0;
        while (right < s.length()) {
            if (map[s.charAt(right++)]-- > 0) count--;
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                if (map[s.charAt(left++)]++ == 0) count++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    /**
     * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
     * @param s "ADOBECODEBANC"
     * @param t "ABC"
     * @return "BANC"
     */
    static public String minWindowByMySelf(String s, String t) {
        String reStr = "";
        String temp = t;
        String tempRe = "";
        int nextIndex = 0;
        for(int i=0;i<s.length();i++){
            char chr = s.charAt(i);
            if(temp.indexOf(chr)!=-1){
                if(temp.length()==t.length()){
                    tempRe = chr+"";
                }
                // 记录第二次出现子串的位置，视为下一次计数的起点
                else if(temp.length()==t.length()-1){
                    nextIndex = i-1;
                    tempRe += chr;
                }else{
                    tempRe += chr;
                }
                temp = temp.replaceFirst(chr+"","");
                if(temp.isEmpty()){
                    temp = t;
                    reStr = tempRe.length()<reStr.length() || reStr.isEmpty() ? tempRe : reStr;
                    i = nextIndex;
                }
            }else{
                if(temp.length()!=t.length()){
                    tempRe += chr;
                }
            }
        }
        return reStr;
    }

    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
     * @param nums {1,2,3}
     * @param k 3
     * @return 2
     */
    static public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 使用哈希表记录前缀和出现的次数
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // 前缀和为0的情况出现一次

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;
            // 如果 prefixSum - k 存在于哈希表中，说明存在一个子数组的和为 k
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }
            // 更新当前前缀和的出现次数
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
     * @param nums {1,2,3}
     * @param k 3
     * @return 2
     */
    static public int subarraySumByMySelf(int[] nums, int k) {
        if(nums==null || nums.length==0 ){
            return 0;
        }
        // Arrays.sort(nums);
        subarraySumCount =0;
        int total =0;
        int depth = 0;
        String index = "";
        calcSum(total,index,depth,nums,k);

        return subarraySumCount;
    }

    private static void calcSum(int total,String index,int depth,int[] nums, int k) {

        if(total == k){
            // 防止重复添加
            subarraySumCount++;
        }else{
            for(int i=depth;i<nums.length;i++){
                int add = nums[i];
                if(add > k){
                    continue;
                }else{
                    total += add ;
                    depth++;
                    if(!index.isEmpty()){
                        int lastIndex = Integer.parseInt(index);
                        // 不连续
                        if(i > lastIndex+1 || i< lastIndex-1 || lastIndex>=i){
                            total = total - add ;
                            continue;
                        }
                    }
                    index = index + "" + i;
                    calcSum(total,index,depth,nums,k);
                    // 回溯
                    index = index.substring(0,index.length()-1);
                    total = total - add ;
                    depth--;
                }
            }
        }
    }

    private static int subarraySumCount =0;

    /**
     *
     * @param digits 23
     * @return ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     */
    static public List<String> letterCombinations(String digits) {
        rel = new ArrayList<>();
        if(digits.isEmpty()){
            return rel;
        }
        String[] stra = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> mid = new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            char c = digits.charAt(i);
            mid.add(stra[Integer.parseInt(c+"")]);
        }
        String str = "";
        addItem(str,mid,0);
        return rel;
    }

    static private List<String> rel ;

    private static void addItem(String str,List<String> mid,int i) {
        if(str.length() == mid.size()){
            rel.add(str);
        }else{
            String s =mid.get(i);
            i ++;//深度+1
            for(int j=0;j<s.length();j++){
                str = str + s.charAt(j);
                addItem(str,mid,i);
                // 回溯
                str = str.substring(0,i-1);
            }
        }
    }

    /**
     * 正则表达式匹配：动态规划
     * @param s aa      aa      aa
     * @param p a*      a       .*
     * @return  true    false   true
     */
    static public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 2; j <= n; j++) {
            dp[0][j] = p.charAt(j - 1) == '*' && dp[0][j - 2];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    dp[i][j] = dp[i][j - 2] || ((p.charAt(j - 2) == '.' || p.charAt(j - 2) == sc) && dp[i - 1][j]);
                }
            }
        }
        return dp[m][n];
    }

    /**
     * 正则表达式匹配
     * @param s aa      aa      aa
     * @param p a*      a       .*
     * @return  true    false   true
     */
    static public boolean isMatchByMySelf(String s, String p) {
        boolean isReg = false;
        if(s.length() != p.length() && p.indexOf('*')==-1){
            return isReg;
        }
        int curP =0;
        for(int i=0;i<s.length();i++){
            char fs = s.charAt(i);
            char ts = p.charAt(curP);
            if(fs != ts && ts != '.' && ts !='*'){
                isReg = false;
                break;
            }else if(ts == '*' && fs != p.charAt(curP-1) && p.charAt(curP-1) != '.'){
                isReg = false;
                break;
            }else if (ts == '*'){
                isReg = true;
            }else{
                curP ++;
                isReg = true;
            }
        }
        return isReg;
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s; // 如果只有一行，直接返回原字符串
        }

        // 创建每一行的 StringBuilder
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0; // 当前行
        boolean goingDown = false; // 方向标志，初始为 false

        // 遍历字符串，将字符添加到对应的行
        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown; // 改变方向
            }
            currentRow += goingDown ? 1 : -1; // 根据方向更新行号
        }

        // 将每一行的字符拼接成最终结果
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    static public String convertByMySelf(String s, int numRows) {
        if(numRows <= 1){
            return s;
        }
        String re = "";
        char[][] reA = new char[numRows][(s.length()*(numRows-1)/numRows)];

        int y = 0;
        boolean isSingle = false;
        for(int i=0;i<s.length();i++){

            int mut = 2*numRows -2;
            int yu = i%mut;
            // 上一个元素是否为单列单元素
            if(isSingle){
                y ++;
                isSingle = false;
            }
            int x = 0;
            if(yu < numRows){
                x = yu;
            }else if(yu >= numRows){
                x = 2*numRows - yu -2;
                y ++;
                isSingle = true;
            }

            reA[x][y]=s.charAt(i);
        }

        for(char[] ints:reA){
            for(char c : ints){
                if(c != '\u0000'){
                    re += c;
                }
            }
        }

        return re;
    }

    /**
     * 给定一个经过编码的字符串，返回它解码后的字符串。
     * @param s
     * @return
     */
    static public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>(); // 存储数字
        Stack<String> strStack = new Stack<>(); // 存储字符串
        StringBuilder currentStr = new StringBuilder(); // 当前字符串
        int currentNum = 0; // 当前数字

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // 处理多位数
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                // 遇到 '['，将当前数字和字符串压入栈
                numStack.push(currentNum);
                strStack.push(currentStr.toString());
                currentNum = 0; // 重置数字
                currentStr = new StringBuilder(); // 重置字符串
            } else if (ch == ']') {
                // 遇到 ']'，弹出栈顶数字和字符串，进行重复拼接
                int repeatTimes = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentStr);
                }
                currentStr = temp;
            } else {
                // 普通字符，直接加入当前字符串
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
    }

    /**
     * 给定一个经过编码的字符串，返回它解码后的字符串。
     * @param s "3[a2[c]]"
     * @return "accaccacc"
     */
    static public String decodeStringByMySelf(String s) {
        String re = "";
        boolean inArea = false;
        Map<Integer,String> deepMap = new HashMap<>();
        int deep = 0;

        Stack<String> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char index = s.charAt(i);
            if(index>='1' && index<='9'){
                deep ++ ;
                inArea = true;
                stack.push(index+"|"+i);
            }else if (index==']'){
                inArea = false;
                String deepStr = "";
                String a = stack.pop();
                String[] aA = a.split("\\|");
                int count = Integer.parseInt(aA[0]);
                int startI = Integer.parseInt(aA[1]);
                String mergeS = s.substring(startI+2,i);
                if(deepMap.get(deep) != null){
                    deepStr = deepMap.get(deep);
                }else{
                    deepStr = mergeS;
                }
                int startj = mergeS.lastIndexOf('[');
                int endj = mergeS.lastIndexOf(']');
                deepStr = mergeS.substring(0,startj==-1?0:startj-1) + deepStr + mergeS.substring(endj==-1?mergeS.length():endj+1);
                String reStr ="";
                for(int j = 0; j< count; j++){
                    reStr += deepStr;
                }
                deep--;
                deepMap.put(deep,reStr);
                if(deep == 0){
                    re += reStr;
                }
            }else if(index>='a' && index<='z' && !inArea){
                re += index;
            }
        }

        return re;
    }

    private static String getChar(String s) {

        String re = "";
        for(int i=0;i<s.length();i++){
            char index = s.charAt(i);
            if(index>='1' && index<='9'){
                int startI = s.indexOf('[')+1;
                int endI = s.lastIndexOf(']');
                int length = endI - startI;
                String a = getChar(s.substring(startI,endI));
                for(int j = 0; j< Integer.parseInt(String.valueOf(index)); j++){
                    re += a;
                }
                i += length+2;// 包含[和]两符号长度
            }else if(index>='a' && index<='z'){
                re += index;
            }
        }
        return re;
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * @param s 字符串 s
     * @return 判断字符串是否有效
     */
    private static boolean judgeIsRightStr(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * 字符串转换为整数
     * @param s 传入字符串
     * @return 返回整数
     */
    public static int myAtoiByDs(String s) {
        if (s == null || s.isEmpty()) return 0;
        int index = 0, sign = 1, result = 0;

        // 1. 跳过前导空格
        while (index < s.length() && s.charAt(index) == ' ') index++;
        if (index >= s.length()) return 0; // 全空格则直接返回0[1,4](@ref)

        // 2. 处理符号位
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // 3. 转换数字并处理溢出
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // 溢出检查：当前结果是否超过Integer的边界
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    /**
     * 字符串转换为整数：
     * 空格：读入字符串并丢弃无用的前导空格（" "）
     * 符号：检查下一个字符（假设还未到字符末尾）为 '-' 还是 '+'。如果两者都不存在，则假定结果为正。
     * 转换：通过跳过前置零来读取该整数，直到遇到非数字字符或到达字符串的结尾。如果没有读取数字，则结果为0。
     * 舍入：如果整数数超过 32 位有符号整数范围 [−2的31次方,  2的31次方 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −2的31次方 的整数应该被舍入为 −2的31次方 ，大于 2的31次方 − 1 的整数应该被舍入为 2的31次方 − 1 。
     * @param s 传入字符串
     * @return 返回整数
     */
    public static int myAtoi(String s) {
        int reInt =0;
        long reLong =0;
        String reStr ="";
        s= s.trim();
        boolean isZero =false;
        for(int i=0;i<s.length();i++){
            char chr = s.charAt(i);
            if((chr=='+' ||chr=='-')){
                if(isZero){
                    break;
                }
                continue;
            }
            if(chr=='0' && reStr.isEmpty()){
                isZero = true;
            }else if(chr >= '0' && chr <= '9'){
                isZero =false; reStr += chr;
            } else{
                break;
            }
        }
        if(reStr.isEmpty()){
            return reInt;
        }
        boolean isZ= !s.contains("-");
        if(isZ){
            reLong =Long.parseLong(reStr);
        }else{
            reLong = Long.parseLong(reStr)*-1;
        }
        if(reLong> Integer.MAX_VALUE){
            reInt = Integer.MAX_VALUE;
        }else if (reLong <Integer.MIN_VALUE){
            reInt = Integer.MIN_VALUE;
        }else{
            reInt = (int) reLong;
        }
        return reInt;
    }

    private static String getManacher(String s ){


        if (s == null || s.length() == 0) return "";

        StringBuilder sb = new StringBuilder();
        sb.append("^");
        for (int i = 0; i < s.length(); i++) {
            sb.append("#").append(s.charAt(i));
        }
        sb.append("#$");
        String T = sb.toString();
        int n = T.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, maxCenter = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (T.charAt(i + p[i] + 1) == T.charAt(i - p[i] - 1)) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;
        return s.substring(start, start + maxLen);

    }

    /**
     * 找到字符串中最长的 回文 子串
     * @param str 原字符
     * @return 回文字符
     */
    private static String getPalindromeStr(String str) {
        String palinStr = "";
        int palLength = 0;
        String reStr = "";
        for(int i=0;i<str.length();i++){

            char inChr = str.charAt(i);
            reStr += inChr;
            String palStr = "";
            System.out.println(reStr);
            for(int j=reStr.length() ; j>0; j--){
                palStr += reStr.charAt(j-1);
            }
            System.out.println("颠倒数："+palStr);
            if(reStr.equals(palStr)){
                System.out.println("为回文数："+reStr);
                if(reStr.length() > palLength){
                    palLength = reStr.length();
                    palinStr = reStr;
                }
            }
        }
        return palinStr;
    }

    /**
     * 找一个字符串中最长不重复子串的长度
     * @param s 传入字符串
     * @return 返回最长子串长度
     */
    public static int getMaxChildStrLength(String s) {
        int maxLength = 0;
        String currentSub = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = currentSub.indexOf(c);
            // 若该字符在子串中出现，则截断子串，从重复字符出现的位置往后截断
            if (index != -1) {
                currentSub = currentSub.substring(index + 1);
            }
            currentSub += c;
            if (currentSub.length() > maxLength) {
                maxLength = currentSub.length();
            }
        }
        return maxLength;
    }

}
