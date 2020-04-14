package Interfaces;

import Models.TreeNode;

public interface MyTree {
    public void levelOrderTraversal(TreeNode root);
    public void preOrderTraversal(TreeNode root);
    public void inOrderTraversal(TreeNode root);
    public void postOrderTraversal(TreeNode root);
    public TreeNode search(Object value, TreeNode root);
    public int height(TreeNode node);
    public int depth(TreeNode node);
    boolean contains(TreeNode node, Object val);
}

