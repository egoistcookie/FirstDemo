package com.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
        System.out.println(decodeString("abc3[cd]xyz"));
        System.out.println(decodeString("100[leetcode]"));


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
