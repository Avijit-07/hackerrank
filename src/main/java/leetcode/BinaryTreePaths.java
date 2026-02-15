package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> results = new ArrayList<>();

        if (root == null)
            return results;

        traverse(root, "", results);

        return results;
    }

    public static void traverse(TreeNode node, String path, List<String> results) {
        path = path + node.val;
        if (node.left == null && node.right == null) {
            results.add(path);
            return;
        }
        if (node.left != null)
            traverse(node.left, path + "->", results);
        if (node.right != null)
            traverse(node.right, path + "->", results);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;
        TreeNode right2 = new TreeNode(5);
        left.right = right2;

        System.out.println(binaryTreePaths(root));
    }
}

 class TreeNode {
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

