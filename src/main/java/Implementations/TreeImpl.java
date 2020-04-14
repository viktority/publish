package Implementations;

import Models.TreeNode;

public class TreeImpl {

    public static void main(String args[]) {
        TreeNode leftRightLeft = new TreeNode(9);
        TreeNode leftLeft = new TreeNode(5);
        TreeNode leftRight = new TreeNode(7);
        leftRight.setRight(leftRightLeft);
        leftRightLeft.setParent(leftRight);
        TreeNode left = new TreeNode(1);

        left.setLeft(leftLeft);
        left.setRight(leftRight);
        leftLeft.setParent(left);
        leftRight.setParent(left);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(0);
        root.setLeft(left);
        root.setRight(right);
        left.setParent(root);
        right.setParent(root);
        TreeOperationsImplementations imp = new TreeOperationsImplementations();
        System.out.println("\n::::::::PreOrder::::::::");
        imp.preOrderTraversal(root);

        System.out.println("\n::::::::PostOrder::::::::");
        imp.postOrderTraversal(root);

        System.out.println("\n::::::::InOrder::::::::");
        imp.inOrderTraversal(root);

        System.out.println("\n::::::::Level Order::::::::");
        imp.levelOrderTraversal(root);

        System.out.println("\n::::::::Search::::::::");
        TreeNode searchResult = imp.search(0, root);

        System.out.println(searchResult.getValue());

        System.out.println("\n::::::::height::::::::");
        System.out.println(imp.height(root));

        System.out.println("\n::::::::dept::::::::");
        System.out.println(imp.depth(leftRightLeft));
    }
}

