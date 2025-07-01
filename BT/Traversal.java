package BT;

import java.util.ArrayList;
import java.util.Stack;

public class Traversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            
        }
    }
    public static class Pair{
        TreeNode node;
        int state;
        Pair(TreeNode node, int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void preInPostTraversal(TreeNode root){
        if (root == null) {
            return;
        }
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        while(!st.isEmpty()){
            Pair p = st.pop();
            if(p.state == 1){
                pre.add(p.node.val);
                p.state++;
                st.push(p);
                if (p.node.left != null) {
                    st.push(new Pair(p.node.left, 1));
                }
            }else if(p.state == 2){
                in.add(p.node.val);
                p.state++;
                st.push(p);
                if (p.node.right != null) {
                    st.push(new Pair(p.node.right, 1));
                }
            }else{
                post.add(p.node.val);
            }

        }
         System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);

    }
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
         preInPostTraversal(t);
    }
}
