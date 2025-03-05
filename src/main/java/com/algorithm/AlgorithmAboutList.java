package com.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 集合类的算法类
 */
public class AlgorithmAboutList {

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
        int[] height = {1,5,6,7,5,4,3};
        int area = calcAreaByHeighArrByDs(height);
        System.out.println(area);

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
