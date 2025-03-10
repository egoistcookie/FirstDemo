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
        TreeNode rootTree1 = new TreeNode(3);
        TreeNode cur = rootTree1;
        rootTree1.left = new TreeNode(5);
        rootTree1.right = new TreeNode(1);
        rootTree1.left.left = new TreeNode(6);
        rootTree1.left.right = new TreeNode(2);
        rootTree1.right.left = new TreeNode(0);
        rootTree1.right.right = new TreeNode(8);
        rootTree1.left.right.left = new TreeNode(7);
        rootTree1.left.right.right = new TreeNode(4);
        rootTree1 = lowestCommonAncestor(rootTree1,new TreeNode(6),new TreeNode(5));
        System.out.println(rootTree1.val);


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
