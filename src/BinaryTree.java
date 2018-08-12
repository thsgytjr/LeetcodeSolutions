import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }

    }

    public TreeNode createBinaryTree(){
        TreeNode first = new TreeNode(3);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(5);
        TreeNode forth = new TreeNode(1);
        TreeNode fifth = new TreeNode(4);
        TreeNode sixth = new TreeNode(7);


        root = first;
        first.left = second;
        first.right = third;

        second.left = forth;
        third.left = fifth;
        third.right = sixth;

        return root;

    }

    public void BFS(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode current = queue.remove();
            System.out.println(current.data);
            if (current.left!=null){
                queue.add(current.left);
            }
            if (current.right!=null){
                queue.add(current.right);
            }
        }
    }



    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.BFS(bt.createBinaryTree());

    }
}
