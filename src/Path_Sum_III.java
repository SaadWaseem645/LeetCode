
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Path_Sum_III {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(11, node1, node2);
        TreeNode node4 = new TreeNode(4, node3,null);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(4, node5, node6);
        TreeNode node9 = new TreeNode(13);
        TreeNode node8 = new TreeNode(8, node9, node7);
        TreeNode node10 = new TreeNode(5, node4, node8);


        System.out.println(pathSum(node10, 22));
    }


    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;
        Stack<Integer> stack = new Stack<>();
        findPath(root, targetSum, list, stack);
        return list;
    }

    public static void findPath(TreeNode root, int targetSum, List<List<Integer>> list, Stack<Integer> stack){


        if(root.left == null && root.right == null){

            targetSum -= root.val;
            if(targetSum == 0){
                stack.add(root.val);
                list.add(new ArrayList<>(stack));
                stack.pop();
            }
            return;
        }

        stack.add(root.val);
        int sum = targetSum - root.val;
        if(root.left != null)
            findPath(root.left, sum, list, stack);
        if(root.right != null)
            findPath(root.right,sum, list, stack);
        stack.pop();

    }

}
