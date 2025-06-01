package com.algorithm;

import java.util.Arrays;

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
        System.out.println(ac.removeElement(new int[]{3,2,2,3},3));
        System.out.println(ac.removeElement(new int[]{0,1,2,2,3,0,4,2},2));



    }


    /**
     * 27.移除元素
     * @param nums {3,2,2,3}
     * @param val 3
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
     * @param nums1 1,2,3,0,0,0
     * @param m 3
     * @param nums2 2,5,6
     * @param n 3
     *          1,2,2,3,5,6
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
