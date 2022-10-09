public class Path_Sum {
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//
//        if(root == null) return false;
//        else if(root.left == null && root.right == null)
//            if(root.val == targetSum) return true;
//            else return false;
//
//        int newTarget = targetSum-root.val;
//
//        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
//    }
}
