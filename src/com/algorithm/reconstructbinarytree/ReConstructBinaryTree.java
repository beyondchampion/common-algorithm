package com.algorithm.reconstructbinarytree;


/**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/28
 * Time: 14:09
 * To change this template use File | Settings | File Templates.
 * Description:重建二叉树
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

        if (startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++)
            if (in[i] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }

        return root;

    }

    public static void main(String[] args) {

        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        ReConstructBinaryTree fa = new ReConstructBinaryTree();

        try {

            long startTime = System.currentTimeMillis();    //获取开始时间

            TreeNode treeNode = fa.reConstructBinaryTree(pre, in);
            System.out.println(treeNode);

            long endTime = System.currentTimeMillis();    //获取结束时间
            System.out.println("-----------------------------");
            System.out.println("程序总运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
            float seconds = (endTime - startTime) / 1000F;
            System.out.println(Float.toString(seconds) + " seconds.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
