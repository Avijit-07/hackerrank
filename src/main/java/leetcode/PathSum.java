package leetcode;

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        int totalSum = 0;
        boolean result = false;

        if(root == null)
            return false;

        traverse(root, totalSum, targetSum, result); // 5

        return result;

    }

    public static void traverse(TreeNode node, int sum, int targetSum, boolean result) {
        sum = sum + node.val;

        if (node.left == null && node.right == null) {
            if (sum == targetSum) {
                result = true;
                return;
            }
            else
                sum = sum - node.val;
            return;
        }

        if (node.left != null) // 7
            traverse(node.left, sum, targetSum, result); // 7, 20



        if (node.right != null)
            traverse(node.right, sum, targetSum, result);

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
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
