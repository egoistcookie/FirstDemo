package com.algorithm;

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
        String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String reStr = getManacher(str);
        System.out.println(reStr);

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
