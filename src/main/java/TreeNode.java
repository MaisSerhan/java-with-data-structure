
public class TreeNode {
TreeNode left;
TreeNode right;
Integer data;

    public TreeNode() {
    }

    public TreeNode(Integer data) {
        this.data = data;
    }

    public TreeNode(TreeNode left, TreeNode right, Integer data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
  
    
}
