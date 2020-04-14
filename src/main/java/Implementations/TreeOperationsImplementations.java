package Implementations;

import Interfaces.MyTree;
import Models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeOperationsImplementations implements MyTree {


    @Override
    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode tempNode;
        while (!queue.isEmpty()) {
            tempNode = queue.poll();

            if (tempNode.getLeft() != null)
                queue.add(tempNode.getLeft());
            if (tempNode.getRight() != null)
                queue.add(tempNode.getRight());

            System.out.print(tempNode.getValue() + " ");
        }

    }

    @Override
    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {

            preOrderTraversal(root.getLeft());
            System.out.print(root.getValue() + " ");
            preOrderTraversal(root.getRight());
        }
    }

    @Override
    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getValue() + " ");
            inOrderTraversal(root.getLeft());
            inOrderTraversal(root.getRight());
        }
    }

    @Override
    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {

            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    @Override
    public TreeNode search(Object value, TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode tempNode;
        while (!queue.isEmpty()) {
            tempNode = queue.poll();
            if (tempNode.getValue() == value) {
                return tempNode;
            } else {

                if (tempNode.getLeft() != null)
                    queue.add(tempNode.getLeft());
                if (tempNode.getRight() != null)
                    queue.add(tempNode.getRight());
            }
        }
        return null;
    }

    @Override
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftDept = height(node.getLeft());
            int rightDept = height(node.getRight());
            return Math.max(leftDept, rightDept) + 1;
        }
    }

    @Override
    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            if (node.getParent() == null) {
                return 0;
            } else {
                return depth(node.getParent()) + 1;
            }

        }
    }

    @Override
    public boolean contains(TreeNode node, Object val) {
        if (node == null) {
            return false;
        } else {
            if (node.getValue() == val)
                return true;
            else {
                return contains(node.getLeft(), val) || contains(node.getRight(), val);
            }

        }
    }
}