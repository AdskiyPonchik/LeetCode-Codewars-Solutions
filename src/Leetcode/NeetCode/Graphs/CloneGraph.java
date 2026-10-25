package Leetcode.NeetCode.Graphs;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> copies = new HashMap<>();
        Deque<Node> queue = new ArrayDeque<>();
        copies.put(node, new Node(node.val));
        queue.addLast(node);
        while (!queue.isEmpty()) {
            Node curNode = queue.removeFirst();
            for (Node smallNode : curNode.neighbors) {
                if (!copies.containsKey(smallNode)) {
                    copies.put(smallNode, new Node(smallNode.val));
                    queue.addLast(smallNode);
                }
                Node currentCopy = copies.get(curNode);
                Node neighborCopy = copies.get(smallNode);
                currentCopy.neighbors.add(neighborCopy);
            }
        }
        return copies.get(node);
    }
}
