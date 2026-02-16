package leetcode;

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        return traverse(root, targetSum);
    }

    public static boolean traverse(TreeNode node, int targetSum) {
        if (node == null)
            return false;

        if (node.left == null && node.right == null) {
            if (node.val == targetSum)
                return true;
        }

        return traverse(node.left, targetSum - node.val) ||
                traverse(node.right, targetSum - node.val);

    }


//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        TreeNode left = new TreeNode(2);
//        root.left = left;
//        TreeNode right = new TreeNode(3);
//        root.right = right;
//        TreeNode right2 = new TreeNode(5);
//        left.right = right2;
//        TreeNode left2 = new TreeNode(4);
//        left.left = left2;
//
//
//        System.out.println(hasPathSum(root, 8));
//    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
