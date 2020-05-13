package java15_0514;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的完全性检验

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
         if(root==null){
             return true;
         }
         Queue<TreeNode>  queue=new LinkedList<>();
         queue.offer(root);
         boolean isLast =false;
         while (!queue.isEmpty()){
             TreeNode cur=queue.poll();
             if(isLast){
                 //先判断是否是最后一层
                 if(cur.left!=null||cur.right!=null){
                     return false;
                 }
             }else if(cur.left!=null&&cur.right!=null){
                 //是否除了倒数第二层外的其它层
                 queue.offer(cur.left);
                 queue.offer(cur.right);
             }else if(cur.left!=null){
                 queue.offer(cur.left);
                 isLast=true;
             }else if(cur.right!=null){
                 return false;
             }else {
                 isLast=true;
             }
         }
         return true;
    }
}
