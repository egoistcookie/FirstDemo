package com.algorithm;

import java.util.*;

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
        moveZeroes(new int[]{1,3,2,0,0,14,0,3});



    }

    public static void moveZeroes(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int zeroNum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroNum++;
            }else{
                li.add(nums[i]);
            }
        }
        for(int i=0;i<zeroNum;i++){
            li.add(0);
        }
        // 将List<Integer>转换为Integer[]
        Integer[] integerArray = li.toArray(new Integer[0]);

        // 将Integer[]转换为int[]
        int[] result = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            result[i] = integerArray[i];
        }
        nums =result;

        for(int i = 0; i < nums.length; i++ ){
            System.out.println(nums[i]);
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
