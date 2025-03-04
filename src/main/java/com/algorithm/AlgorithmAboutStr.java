package com.algorithm;

/**
 * 字符类的算法类
 */
public class AlgorithmAboutStr {

    public static void main(String[] args) {

        // 力扣算法3.找一个字符串中最长不重复子串的长度
        String str1 = "dadv";
        System.out.println(getMaxChildStrLength(str1));


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
