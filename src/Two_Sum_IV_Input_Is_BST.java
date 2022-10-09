public class Two_Sum_IV_Input_Is_BST {

    public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(0);
        TreeNode root2 = new TreeNode(-2);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4 = new TreeNode(3);

        root.left = root1;
        root1.left = root2;
        root.right = root3;
        root3.left = root4;

        System.out.println(findTarget(root, 7));
    }

    public static boolean findTarget(TreeNode root, int k) {
        return traverseTree(root, root, k);
    }

    public static boolean traverseTree(TreeNode root, TreeNode headNode, int k){

        if(root == null) return false;

        if(findNext(headNode, root, k - root.val)) return true;
        if(traverseTree(root.left, headNode, k)) return true;
        if(traverseTree(root.right, headNode, k)) return true;

        return false;
    }

    public static boolean findNext(TreeNode root, TreeNode curr, int k){

        if(root == null) return false;
        if(root.val == k && curr != root) return true;

        if(k < root.val)
            if(findNext(root.left, curr, k)) return true;
            else
            if(findNext(root.right, curr, k)) return true;

        return false;

    }


}
