package Leetcode.NeetCode.Graphs;

import java.util.*;

public class CourseSchedule {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int completed = 0;
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            graph.get(prerequisite).add(course);
            indegree[course]++;
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for(int course = 0; course < numCourses; course++){
            if(indegree[course]==0){
                queue.push(course);
            }
        }
        while (!queue.isEmpty()){
            int number = queue.removeFirst();
            completed++;
            for (int next : graph.get(number)) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.addLast(next);
                }
            }
        }
        return completed == numCourses;
    }
}
