package cww405;

import java.util.Stack;

public class Node {
    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void preOrder(TreeNode root){      //非递归前序遍历
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack <>();  //建立一个栈
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode top =stack.pop();//取出栈顶元素
            System.out.println(top.val + " ");   //打印这个元素值
            if(top.right!=null){
                stack.push(top.right);
            }
            if(top.left!=null){
                stack.push(top.left);
            }
        }
    }
    public  static  TreeNode build(){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        d.left=g;
        return a;
    }
    public static void inOrder(TreeNode root){        //非递归中序排序
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack <>();      //建立一个栈
        TreeNode cur =  root;
        while (true){
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top = stack.pop();//取栈顶元素
            System.out.println(top + " ");
            cur = top.right;
        }

    }
    public  static void posOrder(TreeNode root){     //非递归后续排序
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack <>();  //建立一个栈
        stack.push(root);
    }

    public static void main(String[] args) {
//        System.out.println(preOrder(TreeNode(root)));
        TreeNode root = build();
        System.out.println(root);
    }
}
