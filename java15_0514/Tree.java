package java15_0514;


public class Tree {
   static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
