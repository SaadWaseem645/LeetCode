import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course_Schedule {
    public static class Node{
        public List<Node> nodes = new ArrayList<Node>();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,0}};
        System.out.println(canFinish(2, arr));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Node[] courses = new Node[numCourses];

        for(int i = 0; i < numCourses; ++i) courses[i] = new Node();
        for(int[] pre: prerequisites) courses[pre[0]].nodes.add(courses[pre[1]]);
        for(Node course: courses){
            if(!findPath(course, numCourses, 0))
                return false;
        }

        return true;
    }

    public static boolean findPath(Node node, int size, int ind){

        if(node.nodes.size() == 0) return true;
        if(ind > size) return false;

        for(Node n: node.nodes){
            if(!findPath(n, size, ind + 1))
                return false;
        }

        return true;

    }
}
