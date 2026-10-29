package Leetcode.NeetCode.AdvancedGraphs;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> graph = new HashMap<>();
        boolean endWordPresence = false;
        for (String word : wordList) {
            graph.put(word, new ArrayList<>());
            if (word.equals(endWord)) {
                endWordPresence = true;
            }
        }
        if (!endWordPresence) {
            return 0;
        }
        graph.putIfAbsent(beginWord, new ArrayList<>());
        for (String word : graph.keySet()) {
            char[] letters = word.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                char original = letters[i];
                for (int j = 0; j < 26; j++) {
                    char replacement = (char) ('a' + j);
                    if (replacement == original) {
                        continue;
                    }
                    letters[i] = replacement;
                    String candidate = new String(letters);
                    if (graph.containsKey(candidate)) {
                        graph.get(word).add(candidate);
                    }
                }
                letters[i] = original;
            }
        }
        return bfs(graph, beginWord, endWord);
    }

    public int bfs(Map<String, List<String>> graph, String beginWord, String endWord) {
        Deque<String> deque = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        int steps = 1;
        deque.add(beginWord);
        visited.add(beginWord);
        while (!deque.isEmpty()) {
            int layerSize = deque.size();
            for (int i = 0; i < layerSize; i++) {
                String word = deque.removeFirst();
                if (word.equals(endWord)) {
                    return steps;
                }
                for (String smallWord : graph.get(word)) {
                    if (!visited.contains(smallWord)) {
                        deque.add(smallWord);
                        visited.add(smallWord);
                    }
                }
            }
            steps++;
        }
        return 0;
    }
}
