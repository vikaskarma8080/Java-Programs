package org.example.programs;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class KthSmallestInBST {
    private int count = 0; // Counter for the number of nodes visited
    private int result = -1; // To store the result
    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return result;
    }
    private void inOrderTraversal(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inOrderTraversal(node.right, k);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        KthSmallestInBST finder = new KthSmallestInBST();
        int k = 3; // Change k to test different values
        int kthSmallest = finder.kthSmallest(root, k);
        System.out.println("The " + k + "rd smallest element in the BST is: " + kthSmallest);
    }
}