package com.algorithm;

import java.util.*;

/**
 * 树形结构的算法类
 */
public class AlgorithmAboutTree {

    public static void main(String[] args) {

        // 算法94.二叉树的中序遍历
        // 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
        // root节点为层序遍历：即从上到下、从左到右的遍历方式
        // 中序遍历：先输出左节点、再输出根节点、再输出右节点
        // TreeNode rootTree1 = new TreeNode(1);
        // TreeNode cur = rootTree1;
        // rootTree1.right = new TreeNode(2);
        // cur = rootTree1.right;
        // cur.left = new TreeNode(3);
        // List<Integer> orderList = inOrderTraversal(rootTree1);
        // for(int i:orderList){
        //     System.out.println(i);
        // }

        // 算法236.二叉树的最近公共祖先
        // 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
        // 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
        // TreeNode rootTree1 = new TreeNode(3);
        // rootTree1.left = new TreeNode(5);
        // rootTree1.right = new TreeNode(1);
        // rootTree1.left.left = new TreeNode(6);
        // rootTree1.left.right = new TreeNode(2);
        // rootTree1.right.left = new TreeNode(0);
        // rootTree1.right.right = new TreeNode(8);
        // rootTree1.left.right.left = new TreeNode(7);
        // rootTree1.left.right.right = new TreeNode(4);
        // TreeNode cur = rootTree1;
        // rootTree1 = lowestCommonAncestor(rootTree1,new TreeNode(6),new TreeNode(5));
        // System.out.println(rootTree1.val);

        // 算法124.二叉树中的最大路径和
        // 二叉树中的 路径 被定义为一条节点序列，序列中每对相邻节点之间都存在一条边。
        // 同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
        // 给你一个二叉树的根节点 root ，返回其 最大路径和 。
        // 如[1,2,3],最优路径是 2 -> 1 -> 3,返回为6
        // [[-10,9,20,null,null,15,7]],最优路径是 15 -> 20 -> 7 ，路径和为 15 + 20 + 7 = 42
        // 解法：递归计算左右子树的最大路径和，计算当前节点的路径和（左子树 + 右子树 + 当前节点）
        //  ,返回当前节点的最大路径和（只能选择左子树或右子树中的一条路径）
        // TreeNode rootTree1 = new TreeNode(-10);
        // rootTree1.left = new TreeNode(9);
        // rootTree1.right = new TreeNode(20);
        // rootTree1.right.left = new TreeNode(15);
        // rootTree1.right.right = new TreeNode(7);
        // int max = maxPathSum(rootTree1);
        // System.out.println(max);

        // 104.二叉树的最大深度
        // 给定一个二叉树 root ，返回其最大深度。
        // 解法：递归遍历
        // TreeNode rootTree1 = new TreeNode(3);
        // rootTree1.left = new TreeNode(9);
        // rootTree1.right = new TreeNode(20);
        // rootTree1.right.left = new TreeNode(15);
        // rootTree1.right.right = new TreeNode(7);
        // System.out.println(maxDepth(rootTree1));
        // TreeNode rootTree2 = new TreeNode(1);
        // rootTree2.right = new TreeNode(2);
        // System.out.println(maxDepth(rootTree2));
        // TreeNode rootTree3 = new TreeNode(1);
        // System.out.println(maxDepth(rootTree3));

        // 102.二叉树的层序遍历
        // 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
        // 解法：DFS或者BFS，DFS是用list的get方法获取每层的节点情况，BFS是逐层处理完将下一层所有节点压入队列中。
        // TreeNode rootTree1 = new TreeNode(3);
        // rootTree1.left = new TreeNode(9);
        // rootTree1.right = new TreeNode(20);
        // rootTree1.left.left = new TreeNode(11);
        // rootTree1.left.right = new TreeNode(12);
        // rootTree1.right.left = new TreeNode(15);
        // rootTree1.right.right = new TreeNode(7);
        // TreeNode rootTree3 = new TreeNode(1);
        // List<List<Integer>> re = levelOrder(rootTree1);
        // List<List<Integer>> re3 = levelOrder(rootTree3);
        // for(List<Integer> rel : re){
        //     for(int i : rel){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // 108.将有序数组转换为二叉搜索树
        // 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 平衡 二叉搜索树。
        // 解法：递归，二分，计算中间数
        // TreeNode t = sortedArrayToBST(new int[]{-10,-3,0,5,9});
        // System.out.println(t.val);

        // 98.验证二叉搜索树
        // 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。（树左节点《树中节点《树右节点）
        // 解法：递归，传递允许范围
        // TreeNode rootTree1 = new TreeNode(5);
        // rootTree1.left = new TreeNode(1);
        // rootTree1.right = new TreeNode(7);
        // rootTree1.right.left = new TreeNode(6);
        // rootTree1.right.right = new TreeNode(8);
        // System.out.println(isValidBST(rootTree1));

        // 226.翻转二叉树
        // 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
        // 解法：递归，交换左右子树
        // TreeNode rootTree1 = new TreeNode(4);
        // rootTree1.left = new TreeNode(2);
        // rootTree1.right = new TreeNode(7);
        // rootTree1.left.left = new TreeNode(1);
        // rootTree1.left.right = new TreeNode(3);
        // rootTree1.right.left = new TreeNode(9);
        // rootTree1.right.right = new TreeNode(9);
        // System.out.println(invertTree(rootTree1).left.val);

        // 101.对称二叉树
        // 给你一个二叉树的根节点 root ， 检查它是否轴对称。
        // 解法：递归
        // TreeNode rootTree1 = new TreeNode(1);
        // rootTree1.left = new TreeNode(2);
        // rootTree1.right = new TreeNode(2);
        // rootTree1.left.left = new TreeNode(3);
        // rootTree1.left.right = new TreeNode(4);
        // rootTree1.right.left = new TreeNode(4);
        // rootTree1.right.right = new TreeNode(3);
        // System.out.println(isSymmetric(rootTree1));
        // TreeNode rootTree2 = new TreeNode(1);
        // rootTree2.left = new TreeNode(2);
        // rootTree2.right = new TreeNode(2);
        // rootTree2.left.right = new TreeNode(3);
        // rootTree2.right.right = new TreeNode(3);
        // System.out.println(isSymmetric(rootTree2));

        // 543.二叉树的直径
        // 给你一棵二叉树的根节点，返回该树的 直径 。
        // 二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
        // 解法：递归，对于每个节点，其直径 = 左子树深度 + 右子树深度。
        // TreeNode rootTree1 = new TreeNode(1);
        // rootTree1.left = new TreeNode(2);
        // rootTree1.right = new TreeNode(3);
        // rootTree1.left.left = new TreeNode(4);
        // rootTree1.left.right = new TreeNode(5);
        // System.out.println(diameterOfBinaryTree(rootTree1));

        // 230.二叉树中第k小的元素
        // 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
        // 解法：递归+队列
        TreeNode rootTree1 = new TreeNode(3);
        rootTree1.left = new TreeNode(1);
        rootTree1.right = new TreeNode(4);
        rootTree1.left.right = new TreeNode(2);
        System.out.println(kthSmallest(rootTree1,1));
        TreeNode rootTree2 = new TreeNode(5);
        rootTree2.left = new TreeNode(3);
        rootTree2.right = new TreeNode(6);
        rootTree2.left.left = new TreeNode(2);
        rootTree2.left.right = new TreeNode(4);
        rootTree2.left.left.left = new TreeNode(1);
        System.out.println(kthSmallest(rootTree2,3));


    }


    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
     * @param root [3,1,4,null,2]
     * @param k 1
     * @return 1
     */
    static public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
        return -1;

    }


    static private int maxDiameter = 0; // 全局变量记录最大直径

    static public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    // 计算子树深度并更新直径
    static private int maxDepth(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = maxDepth(node.left);  // 左子树深度
        int rightDepth = maxDepth(node.right); // 右子树深度
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth); // 更新直径
        return Math.max(leftDepth, rightDepth) + 1; // 返回当前子树深度
    }

    /**
     * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
     * @param root [1,2,2,3,4,4,3]
     * @return true
     */
    static public boolean isSymmetric(TreeNode root) {
        boolean isSym = isSym(root.left,root.right);
        return isSym;
    }

    private static boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false; // 显式处理单侧为空
        if (left.val != right.val) return false; // 显式处理值不等
        return isSym(left.left, right.right) && isSym(left.right, right.left); // 直接返回递归结果
    }


    /**
     * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
     * @param root [4,2,7,1,3,6,9]
     * @return [4,7,2,9,6,3,1]
     */
    static public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 交换左右子树
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    /**
     *给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
     * @param root [5,1,4,null,null,3,6]
     * @return false
     */
    static public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static private boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) return true;
        if (node.val <= lower || node.val >= upper) return false;
        return isValidBST(node.left, lower, node.val)
                && isValidBST(node.right, node.val, upper);
    }

    /**
     * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 平衡 二叉搜索树。
     * @param nums {-10,-3,0,5,9}
     * @return [0,-3,9,-10,null,5]
     */
    static public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    static private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;
        // 计算中间索引（防止整数溢出）
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }


    /**
     * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 BFS解法
     * @param root [3,9,20,null,null,15,7]
     * @return [[3],[9,20],[15,7]]
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }

    /**
     * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 DFS解法
     * @param root [3,9,20,null,null,15,7]
     * @return [[3],[9,20],[15,7]]
     */
    static public List<List<Integer>> levelOrderByDfS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root, 0, result);
        return result;
    }

    static private void dfs(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);

        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);
    }

    /**
     * 给定一个二叉树 root ，返回其最大深度。
     * @param root [3,9,20,null,null,15,7]
     * @return 3
     */
    // static public int maxDepth(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int leftDepth = maxDepth(root.left);
    //     int rightDepth = maxDepth(root.right);
    //     return Math.max(leftDepth, rightDepth) + 1;
    // }

    /**
     * 算法124.二叉树中的最大路径和
     * @param root [-10,9,20,null,null,15,7]
     * @return 15 + 20 + 7 = 42
     */
    static public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    static private int maxSum = Integer.MIN_VALUE;

    static private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // 递归计算左右子树的最大路径和
        int leftSum = Math.max(dfs(node.left), 0); // 如果子树路径和为负，则不取
        int rightSum = Math.max(dfs(node.right), 0); // 如果子树路径和为负，则不取

        // 计算当前节点的路径和（左子树 + 右子树 + 当前节点）
        int currentPathSum = node.val + leftSum + rightSum;

        // 更新全局最大路径和
        maxSum = Math.max(maxSum, currentPathSum);

        // 返回当前节点的最大路径和（只能选择左子树或右子树中的一条路径）
        return node.val + Math.max(leftSum, rightSum);
    }
    /**
     * 算法124.二叉树中的最大路径和
     * @param root [-10,9,20,null,null,15,7]
     * @return 15 + 20 + 7 = 42
     */
    static public int maxPathSumByMyself(TreeNode root) {
        int total = root.val;
        TreeNode curNode = root;
        while(curNode.left!=null || curNode.right!=null){

            int curV = curNode.val;
            int leftV = 0;
            if(curNode.left!=null){
                leftV = curNode.left.val;
            }
            int rightV = 0;
            if(curNode.right!=null){
                rightV = curNode.right.val;
            }
            if(leftV > rightV){
                curNode = curNode.left;
            }else{
                curNode = curNode.right;
            }
            int totalLR = leftV + rightV + curV;
            total = Math.max(total,totalLR);
        }

        return total;
    }

    /**
     *
     * @param root [3,5,1,6,2,0,8,null,null,7,4]
     * @param p 5
     * @param q 1
     * @return 3
     */
    static public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode resNode = new TreeNode();
        // 先找到p的所有祖先
        List<TreeNode> tl = new ArrayList<>();
        hasChildNode(tl,root,p);
        for(TreeNode t : tl){
            List<TreeNode> tl2 = new ArrayList<>();
            // 最先加入tl的就是距离p最近的
            if(hasChildNode(tl2,t,q)){
                resNode = t;
                break;
            }
        }
        return resNode;
    }

    public static boolean hasChildNode(List<TreeNode> tl, TreeNode root, TreeNode p) {
        boolean hasThisChild = false;
        if(root==null){
            return false;
        }
        if(root.val == p.val){
            tl.add(root);
            return true;
        }
        hasThisChild = hasChildNode(tl,root.left,p);
        if(!hasThisChild){
            hasThisChild = hasChildNode(tl,root.right,p);
        }
        if(hasThisChild){
            tl.add(root);
        }
        return hasThisChild;
    }

    /**
     * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
     * 中序遍历：先输出左节点、再输出根节点、再输出右节点
     * @param rootTree 层序遍历 [1,null,2,3]
     * @return 中序遍历 [1,3,2]
     */
    private static List<Integer> inOrderTraversal(TreeNode rootTree) {
        if(rootTree==null ){
            return null;
        }
        List<Integer> reList = new ArrayList<>();
        inOrder(reList,rootTree);

        return reList;
    }

    private static void inOrder(List<Integer> reList, TreeNode rootTree) {
        if(rootTree ==null){
            return;
        }
        // 递归左子树
        inOrder(reList,rootTree.left);
        // 添加节点
        reList.add(rootTree.val);
        // 递归右子树
        inOrder(reList,rootTree.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
        }
    }


}
