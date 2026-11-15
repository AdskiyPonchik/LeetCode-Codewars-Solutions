package Leetcode.NeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root){
        return dfs(root, new ArrayList<>(), new StringBuilder());
    }

    private List<String> dfs(TreeNode node, List<String> result, StringBuilder current){
        int previousLength = current.length();
        if (previousLength > 0) {
            current.append("->");
        }
        current.append(node.val);
        if(node.left==null && node.right == null){
            result.add(current.toString());
        }
        if(node.left!=null){
            dfs(node.left, result, current);
        }
        if(node.right!=null){
            dfs(node.right, result, current);
        }
        current.setLength(previousLength);
        return result;
    }
}
