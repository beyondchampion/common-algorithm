package com.algorithm.reconstructbinarytree;

/**
 * /**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/23
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 * Description: 链表的节点
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
