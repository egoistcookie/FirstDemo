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
        // 解法：不复制数组，限制不能用list存储非零元素，但是可以用双指针，一个遍历数组，一个记录非零元素下标，只需要把非零元素前移，后面全部零即可
        // moveZeroes(new int[]{1,3,2,0,0,14,0,3});
        // moveZeroes(new int[]{0,1,0,3,12});
        // moveZeroes(new int[]{0,0,0,1});

        // 力扣算法238.除自身以外数组的乘积
        // 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
        // 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
        // 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
        // 解法：使用 前缀积 和 后缀积 的方法，遍历两次n，时间复杂度为O(2N)，忽略常数2，仍然是O(N)复杂度！
        // int[] answer = productExceptSelf(new int[] {1,3,4,5});
        //
        // for (int j : answer) {
        //     System.out.print(j + " ");
        // }

        // 力扣算法207.课程表
        // 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
        // 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
        // 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
        // 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
        // 解法：广度优先搜索，通过维护节点的入度表，逐步移除入度为0的节点（即无前置依赖的课程），若最终所有节点均被移除，则无环；否则存在环
        // boolean canF = canFinish(2,new int[][]{{1,2},{2,3},{3,4}});
        // boolean canF = canFinish(2,new int[][]{{1,0}});
        // boolean canF = canFinishByBFS(7,new int[][]{{1,0},{0,3},{0,2},{3,2},{2,5},{4,5},{5,6},{2,4}});
        // System.out.println(canF);

        // 力扣算法200.岛屿数量
        // 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
        // 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
        // 此外，你可以假设该网格的四条边均被水包围。
        // 使用深度优先搜索：遍历网格中的每个单元格，递归访问上下左右四个方向的单元格，若单元格是陆地，则改为水，避免重复访问！
        // 广度优先搜索：依然是使用queue+while循环，访问所有相连陆地的方式不同，但是同样要把访问过的单元格改为水；
        // char [][] grid1 = {
        //     {'1','1','1','1','0'},
        //     {'1','1','0','1','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','0','0','0'}
        // };
        // char [][] grid2 = {
        //         {'1','1','1','1','0'},
        //         {'1','1','0','1','0'},
        //         {'0','0','1','0','0'},
        //         {'0','0','0','1','1'}
        // };
        // int nums = numIslands(grid2);
        // System.out.println(nums);

        // 算法994.腐烂的橘子
        // 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
        // 值 0 代表空单元格；   1 代表新鲜橘子； 值 2 代表腐烂的橘子。
        // 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
        // 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
        // 解法：广度优先搜索，以腐烂橘子入队，每遍历一次所有腐烂橘子，时间就+1
        // 注意：for (int j = 0; j < size; j++) { //size不能直接改写成 queue.size()，如果for循环里有用offer，那这个size就一直会增加。。。
        // int result1 = orangesRottingByMyself(new int[][]{
        //     {2,1,1},
        //     {1,1,1},
        //     {0,1,2}
        // });
        // int result2 = orangesRotting(new int[][]{
        //     {2,1,1},
        //     {1,1,0},
        //     {1,0,0}
        // });
        // System.out.println(result1);

        // 算法46.全排列
        // 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
        // 解法：递归+回溯 回溯：每次到尽头就remove最后一位
        // List<List<Integer>> list = permute(new int[]{1,3,5});
        // for (List<Integer> li : list){
        //     for(Integer i : li){
        //         System.out.print(i+"");
        //     }
        //     System.out.println();
        // }

        // 算法78.子集
        // 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
        // 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
        // 解法：递归+回溯，与全排列解法不同之处在于：子集的长度不定，且都是有序数组
        // List<List<Integer>> result2 = subsets(new int[]{1,2,3});
        // for(List<Integer> li : result2){
        //     for(int i : li){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // 力扣算法169.多数元素
        // 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        // int re = majorityElement(new int[]{2,2,1,1,1,2,2});
        // 解法：一个计数hashmap搞定，arrylist的排序加取中间数更简单。
        // int re = majorityElement(new int[]{1});
        // System.out.println(re);

        // 算法48.旋转图像
        // 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
        // 解法：不依赖辅助数组的情况下，需要一次水平翻转和一次对角线翻转解决。
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }

    /**
     * 两次翻转，先水平翻转，再对角线翻转，即可旋转90度
     * @param matrix n × n 的二维矩阵
     */
    static public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
        // 主对角线翻转（转置）
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     *  辅助数组来旋转
     * @param matrix n x n 二维矩阵
     */
    static public void rotateByMySelf(int[][] matrix) {
        int l = matrix.length;
        int[][] res = new int[l][l];
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < l; j++) {
                int temp = matrix[i][j];
                // res[i][j] = matrix[j][l-i-1];
                res[j][l-i-1] = temp;
            }
        }
    }

    /**
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。
     * @param nums {2,2,1,1,1,2,2}
     * @return 2
     */
    static public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int re =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])!=null){
                int count =hm.get(nums[i]);
                count++;
                hm.put(nums[i],count);
                if(count > nums.length/2){
                    re = nums[i];
                    break;
                }
            }else{
                hm.put(nums[i],1);
            }
        }
        return re;
    }

    /**
     * 返回该数组所有可能的子集
     * @param nums [1,2,3]
     * @return [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     */
    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reList = new ArrayList<>();
        // 先加一个空数组
        List<Integer> firstList = new ArrayList<>();
        reList.add(firstList);
        for (int i= nums.length;i>0;i--){
            addNumsToList(reList,new ArrayList<>(),nums,i);
        }
        return  reList;
    }
    private static void addNumsToList(List<List<Integer>> reList, List<Integer> li, int[] nums, int i) {
        if(li.size()==i){
            reList.add(new ArrayList<>(li));
        }else{
            for (int num : nums) {
                // 与求全排列不同的地方在于，此为有序数组，不能后面元素大于前面元素
                if (li.contains(num) || (!li.isEmpty() && li.get(li.size()-1)>num)) {
                    continue;
                }
                li.add(num);
                addNumsToList(reList, li, nums, i);
                // 回溯
                li.remove(li.size()-1);
            }
        }
    }

    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列
     * @param nums 不含重复数字的数组 {1,3,5}
     * @return 所有可能的全排列 {1,3,5}/{1,5,3}/{3,5,1}/{3,1,5}/{5,3,1}/{5,1,3}
     */
    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    // 递归+回溯算法
    static private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // 如果当前排列的长度等于数组的长度，说明已经找到一个完整的排列
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // 跳过已经存在于当前排列中的元素
                if (tempList.contains(nums[i])) {
                    continue;
                }
                // 将当前元素添加到排列中
                tempList.add(nums[i]);
                // 继续递归生成下一个元素的排列
                backtrack(result, tempList, nums);
                // 回溯，移除最后一个元素，尝试其他可能性
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列
     * @param nums 不含重复数字的数组 {1,3,5}
     * @return 所有可能的全排列 {1,3,5}/{1,5,3}/{3,5,1}/{3,1,5}/{5,3,1}/{5,1,3}
     */
    static public List<List<Integer>> permuteBySelf(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        List<Integer> fromL = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            fromL.add(nums[i]);
        }

        if(nums.length == 0){
            return list;
        }else if (nums.length == 1){
            li.add(nums[0]);
            list.add(li);
            return list;
        }

        addNumToList(fromL,list);

        list.add(li);


        return list;
    }

    private static void addNumToList( List<Integer> fromL, List<List<Integer>> list) {

        List<Integer> li = new ArrayList<>();
        for(int i=0;i<fromL.size();i++){
            li.add(fromL.get(i));
        }
        list.add(li);
        if(!fromL.isEmpty()){
            fromL.remove(0);
            addNumToList(fromL,list);
        }

    }

    // 解法：广度优先搜索，以腐烂橘子入队，每遍历一次所有腐烂橘子，时间就+1
    // 注意：for (int j = 0; j < size; j++) { //size不能直接改写成 queue.size()，如果for循环里有用offer，那这个size就一直会增加。。。
    static public int orangesRottingByMyself(int[][] grid){
        Queue<int[]> badOrange = new LinkedList<>();
        int minus =0;
        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
        int freshOrangeCount =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    badOrange.offer(new int[]{i,j});
                }else if (grid[i][j]==1){
                    freshOrangeCount ++;
                }
            }
        }
        // 特判：没有新鲜橘子直接返回0
        if (freshOrangeCount == 0) return 0;

        while (!badOrange.isEmpty() && freshOrangeCount > 0) {
            int size = badOrange.size();
            // 分层处理当前所有腐烂橘子
            for (int j = 0; j < size; j++) {

                int[] index = badOrange.poll();
                for(int[] i : direction){
                    int targetX = index[0] + i[0];
                    int targetY = index[1] + i[1];
                    if(targetX==grid.length || targetX<0 || targetY==grid[0].length || targetY<0
                            || grid[targetX][targetY]==0 || grid[targetX][targetY]==2){
                        continue;
                    }else{
                        grid[targetX][targetY] = 2;
                        badOrange.offer(new int[]{targetX,targetY});
                        freshOrangeCount --;
                    }
                }
            }
            minus ++;


        }
        return freshOrangeCount == 0 ? minus : -1;
    }

    //解法：广度优先搜索，以腐烂橘子入队，每遍历一次所有腐烂橘子，时间就+1
    static public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int fresh = 0;

        // 初始化：统计新鲜橘子，腐烂橘子入队
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) queue.offer(new int[]{i, j});
            }
        }

        // 特判：没有新鲜橘子直接返回0
        if (fresh == 0) return 0;

        int minutes = 0;
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            // 分层处理当前所有腐烂橘子
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                // 向四个方向扩散
                for (int[] dir : DIRECTIONS) {
                    int x = pos[0] + dir[0];
                    int y = pos[1] + dir[1];
                    // 检查边界条件及是否为新鲜橘子
                    if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == 1) {
                        grid[x][y] = 2; // 标记为腐烂
                        queue.offer(new int[]{x, y});
                        fresh--; // 减少新鲜橘子计数
                    }
                }
            }
            minutes++; // 每处理完一层，时间+1
        }

        // 最终判断是否仍有剩余新鲜橘子
        return fresh == 0 ? minutes : -1;
    }

    /**
     * 腐烂扩散
     * @param grid 整个网格
     * @param i x坐标
     * @param j y坐标
     * @param minus 分钟数
     */
    private static void expandBad(int[][] grid, int i, int j, int minus) {
        // // 到达边界，停止扩散
        // if(i>grid.length || i<0 || j>grid[0].length || j<0 || grid[i][j] == 0){
        //     return;
        // }
        // 状态由新鲜改为腐烂
        // if(grid[i][j] == 1){
        //     grid[i][j] = 2;
        // }
        Queue<int[]> qu = new LinkedList<>();
        qu.offer(new int[]{i,j});
        while(!qu.isEmpty()){
            int[] fromIteam = qu.poll();
            int[][] direactionArr = {{fromIteam[0]+1,j},{fromIteam[0]-1,j},{i,fromIteam[1]+1},{i,fromIteam[j]-1}};
            for(int[] arr : direactionArr){
                // 到达边界，停止扩散
                if(arr[0]>grid.length-1 || arr[0]<0 || arr[1]>grid[0].length-1 || arr[1]<0
                        || grid[arr[0]][arr[1]] == 0){
                    continue;
                }else{
                    // 状态由新鲜改为腐烂
                    if(grid[arr[0]][arr[1]] == 1){
                        grid[i][j] = 2;
                    }
                }
                qu.offer(arr);
            }
            minus ++;

        }
        // 朝四个方向扩散
        // expandBad(grid,i+1,j,minus);
        // expandBad(grid,i-1,j,minus);
        // expandBad(grid,i,j+1,minus);
        // expandBad(grid,i,j-1,minus);

    }

    /**
     * 计算岛屿数量
     * @param grid 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格
     * @return 网格中岛屿的数量（岛屿总是被水包围）（网格的四条边均被水包围）
     */
    static public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // 遍历网格中的每个单元格
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 如果当前单元格是陆地（'1'），则启动DFS
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j); // 标记整个岛屿
                }
            }
        }
        return numIslands;
    }

    // 深度优先搜索函数
    static private void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // 检查边界条件：如果超出网格范围或当前单元格是水（'0'），则返回
        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0') {
            return;
        }

        // 将当前单元格标记为水（'0'），避免重复访问，good！
        grid[row][col] = '0';

        // 递归访问上下左右四个方向的单元格
        dfs(grid, row - 1, col); // 上
        dfs(grid, row + 1, col); // 下
        dfs(grid, row, col - 1); // 左
        dfs(grid, row, col + 1); // 右
    }

    // 广度优先搜索（BFS）——拓扑排序
    // 通过维护节点的入度表，逐步移除入度为0的节点（即无前置依赖的课程），若最终所有节点均被移除，则无环；否则存在环
    static public boolean canFinishByBFS(int numCourses, int[][] prerequisites) {
        // 邻接表：记录每个课程的后续课程
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        // 入度数组：记录每个课程的依赖数量
        int[] inDegree = new int[numCourses];

        // 构建邻接表和入度数组
        for (int[] pre : prerequisites) {
            int ai = pre[0], bi = pre[1];
            adj.get(bi).add(ai);
            inDegree[ai]++;
        }

        // 初始化队列：入度为0的课程入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0; // 已完成的课程数
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int next : adj.get(course)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        return count == numCourses;
    }

    // 深度优先搜索（DFS）——环检测
    // 通过递归遍历图中的节点，若在递归路径中遇到正在访问的节点，则存在环
    static List<List<Integer>> adj;
    static int[] visited; // 0:未访问, 1:访问中, 2:已访问
    static boolean hasCycle = false;
    static public boolean canFinishByDFS(int numCourses, int[][] prerequisites) {
        adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int ai = pre[0], bi = pre[1];
            adj.get(bi).add(ai);
        }

        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                dfs(i);
                if (hasCycle) return false;
            }
        }
        return true;
    }
    static private void dfs(int course) {
        visited[course] = 1; // 标记为正在访问
        for (int next : adj.get(course)) {
            if (visited[next] == 0) {
                dfs(next);
            } else if (visited[next] == 1) {
                hasCycle = true; // 发现环
                return;
            }
        }
        visited[course] = 2; // 标记为已访问
    }

    /**
     * 请你判断是否可能完成所有课程的学习
     * @param numCourses 课程数量
     * @param prerequisites 课程修习条件数组
     * @return 能够完成所有课程学习
     */
    static public boolean canFinishBySelf(int numCourses, int[][] prerequisites) {
        if(prerequisites==null || prerequisites.length==0){
            return true;
        }
        boolean canFinish = true;

        for(int i=0;i<prerequisites.length;i++){
            // 条件链
            List<Integer> reLi = new ArrayList<>();
            reLi.add(prerequisites[i][0]);
            boolean hasTop = hasTop(reLi,prerequisites[i][1],prerequisites);
            if(!hasTop){
                canFinish = false;
                break;
            }
        }

        return canFinish;
    }

    private static boolean hasTop(List<Integer> reLi, int prerequisite, int[][] prerequisites) {
        reLi.add(prerequisite);

        for(int[] i : prerequisites){
            if(i[0] == prerequisite){
                int requClass =  i[1];
                // 条件链中如果出现重复，则不可能完成所有课程学习
                if(reLi.contains(requClass)){
                    return false;
                }
                if(!hasTop(reLi,requClass,prerequisites)){
                    return false;
                }
            }
        }
        return true;

    }

    /**
     * 力扣算法238.除自身以外数组的乘积 使用 前缀积 和 后缀积 的方法，遍历两次n，时间复杂度为O(2N)，忽略常数2，仍然是O(N)复杂度！
     * @param nums 整数数组
     * @return 各元素的乘积
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // 计算前缀积
        answer[0] = 1; // 第一个元素没有前缀，所以前缀积为 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        // 计算后缀积并直接与前缀积相乘
        int suffix = 1; // 最后一个元素没有后缀，所以后缀积初始为 1
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; // 将前缀积与后缀积相乘
            suffix *= nums[i]; // 更新后缀积
        }
        return answer;
    }
    public static int[] productExceptSelfByMyself(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            answer[i]= selfMul(nums,i);
        }

        return answer;
    }

    private static int selfMul(int[] nums, int i) {
        int mulNum = 1;
        for(int j=0;j<nums.length;j++){
            if(j!=i){
                mulNum= mulNum*nums[j];
            }
        }
        return mulNum;

    }

    /**
     * 力扣算法283.给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums 整数数组
     */
    public static void moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length; i++ ){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        if (nums == null || nums.length == 0) {
            return;
        }

        int j = 0; // j 指向下一个非零元素应该放置的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // 将 j 之后的所有元素置为 0
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }

        for(int i = 0; i < nums.length; i++ ){
            System.out.print(nums[i]+" ");
        }

    }

    private static void moveZero(int[] nums, int i) {

        for (int j =i;j< nums.length-1;j++){

            int cur = nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=cur;

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
