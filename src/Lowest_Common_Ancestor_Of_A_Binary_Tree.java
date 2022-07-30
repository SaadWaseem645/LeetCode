public class Lowest_Common_Ancestor_Of_A_Binary_Tree {

     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public TreeNode ancestor = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ancestor = null;
        findNode(root,p,q);
         return ancestor;
    }

    public boolean findNode(TreeNode root, TreeNode p, TreeNode q){

         if(root == null)
             return false;
         else if(ancestor != null)
             return false;

         boolean left = findNode(root.left, p, q);
         boolean right = findNode(root.right, p , q);

         boolean totalMatch = root == p || root == q, oneMatch = left || right;
         if(oneMatch) {
             if (!left)
                 left = totalMatch;
             if (!right)
                 right =  totalMatch;
         }

         if(left && right)
             ancestor = root;

        return oneMatch || totalMatch;
    }

}
