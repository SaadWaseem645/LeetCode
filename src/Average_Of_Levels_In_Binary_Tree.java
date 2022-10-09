//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Average_Of_Levels_In_Binary_Tree {
//    public List<Double> averageOfLevels(TreeNode root) {
//
//    Map<Integer, Double[]> map = new HashMap<>();
//    traverse(root, map, 0);
//
//    List<Double> list = new ArrayList<>();
//    for(Integer val: map.keySet()){
//        Double[] arr = map.get(val);
//        list.add(arr[0]/arr[1]);
//    }
//
//    return list;
//    }
//
//    public void traverse(TreeNode root, Map<Integer, Double[]> map, int level){
//
//        if(root == null)
//            return;
//
//        if(map.containsKey(level)){
//            Double[] vals = map.get(level);
//            vals[0] += root.val;
//            ++vals[1];
//        }else{
//            map.put(level, new int[]{root.val, 1});
//        }
//
//        traverse(root.left, map, level+1);
//        traverse(root.right, map, level+1);
//
//        return;
//
//    }
//
//
//}
