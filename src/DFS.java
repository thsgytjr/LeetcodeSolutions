import javax.swing.tree.TreeNode;
import java.util.Stack;

public class DFS {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    TreeNode returnTreeNode(){
        TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(6);
        TreeNode forth = new TreeNode(7);
        TreeNode fifth = new TreeNode(2);
        TreeNode sixth = new TreeNode(4);

        first.left = second;
        first.right = third;

        second.left = forth;
        second.right = fifth;

        third.right = sixth;

        return first;
    }

    void preOrderTraversal(TreeNode node){
        // root > left > right
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null)stack.push(temp.right);
            if(temp.left!=null)stack.push(temp.left);
        }

    }

    void inOrderTraversal(TreeNode node){
        //left > root > right
        Stack<TreeNode> stack = new Stack<>();
//        TreeNode current = node;
        while (node!=null||!stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.println(node.data);

            node = node.right;
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        TreeNode root = dfs.returnTreeNode();
        dfs.inOrderTraversal(root);
    }
}
