import java.util.*;


public class Binary_Tree_Level_Order_Traversal {

    //  Definition for a binary tree node.
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


    public static List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        traverse(root, 0, map, list);
        return list;
    }

    public static void traverse(TreeNode root, Integer level, Map<Integer, List<Integer>> map, List<List<Integer>> list){

        if(root != null){
            if(!map.containsKey(level)){
                List<Integer> newList = new ArrayList<>();
                map.put(level, newList);
                list.add(newList);
            }

            map.get(level).add(root.val);
            traverse(root.left, level+1, map, list);
            traverse(root.right, level+1, map, list);
        }

    }

    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        putVal(map);
//        for(Integer i: map.keySet()){
//            System.out.println("Integer " + map.get(i));
//        }

        TreeNode node = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);


        node.left = node1;
        node.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(levelOrder(node));
    }

    public static void putVal(Map<Integer, Integer> map){
        map.put(1,1);
        map.put(2,3);
    }

}
