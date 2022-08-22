//public class Validate_Binary_Searc_Tree {
//
//    private Integer prevVal = null;
//
//    public boolean isValidBST(TreeNode root) {
//        if(root == null)
//            return true;
//
//        if(!isValidBST(root.left))
//            return false;
//        if(prevVal == null)
//            prevVal = root.val;
//        else if(prevVal >= root.val)
//            return false;
//        prevVal = root.val;
//        return isValidBST(root.right);
//    }
//
//}
