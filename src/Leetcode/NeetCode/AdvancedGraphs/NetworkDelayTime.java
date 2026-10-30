package Leetcode.NeetCode.AdvancedGraphs;

import java.util.*;

public class NetworkDelayTime {

    record Edge(int to, int weight) {
    }

    record State(int node, int time) {
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<Edge>> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < times.length; i++) {
            int source = times[i][0];
            int target = times[i][1];
            int weight = times[i][2];
            map.get(source).add(new Edge(target, weight));
        }

        PriorityQueue<State> priorityQueue = new PriorityQueue<>(Comparator.comparing(State::time));
        priorityQueue.add(new State(k, 0));
        boolean[] visited = new boolean[n + 1];
        int count = 0;
        int maxTime = 0;
        while(!priorityQueue.isEmpty()){
            State candidate = priorityQueue.poll();

            if (visited[candidate.node()]) continue;
            visited[candidate.node()] = true;
            count++;
            maxTime = Math.max(maxTime, candidate.time());
            for(Edge e: map.get(candidate.node())){
                priorityQueue.add(new State(e.to(), candidate.time() + e.weight()));
            }
        }

        return count == n ? maxTime : -1;
    }
}
