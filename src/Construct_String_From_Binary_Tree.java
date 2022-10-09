//public class Construct_String_From_Binary_Tree {
//
//    public String tree2str(TreeNode root) {
//        StringBuilder builder = new StringBuilder();
//        traverse(root, builder);
//        return builder.toString();
//    }
//
//    public void traverse(TreeNode root, StringBuilder str){
//
//        str = str.append(root.val);
//        if(root.left == null && root.right == null) return;
//
//
//        if(root.left != null){
//            str.append("(");
//            traverse(root.left, str);
//            str.append(")");
//        }
//        else str.append("()");
//
//        if(root.right != null){
//            str.append("(");
//            traverse(root.right, str);
//            str.append(")");
//        }
//
//
//    }
//
//}
