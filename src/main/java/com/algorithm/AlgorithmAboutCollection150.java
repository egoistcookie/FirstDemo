package com.algorithm;

import java.util.Arrays;
import java.util.HashSet;

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
        System.out.println(ac.removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(ac.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));




    }


    /**
     * 80.删除有序数组中的重复项
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow =0;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow ++;
                nums[slow] = nums[fast];
            }else if(slow==0 || nums[slow-1]!=nums[fast]){
                slow ++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
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
