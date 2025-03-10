package com.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形结构的算法类
 */
public class AlgorithmAboutTree {

    public static void main(String[] args) {

        // 算法94.二叉树的中序遍历
        // 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
        // root节点为层序遍历：即从上到下、从左到右的遍历方式
        // 中序遍历：先输出左节点、再输出根节点、再输出右节点
        TreeNode rootTree1 = new TreeNode(1);
        TreeNode cur = rootTree1;
        rootTree1.right = new TreeNode(2);
        cur = rootTree1.right;
        cur.left = new TreeNode(3);

        TreeNode rootTree2 = new TreeNode(1);

        List<Integer> orderList = inOrderTraversal(rootTree1);
        for(int i:orderList){
            System.out.println(i);
        }



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
