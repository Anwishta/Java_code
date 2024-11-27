import java.util.*;

import javax.swing.tree.TreeNode;

public class TreeB {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht, int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }
    static class BuildTree{
        static int idx = -1;
        public static Node create(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = create(nodes);
            newNode.right = create(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }

                }else{
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                        
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                        
                    }
                }
            }
        }
        public static int height(Node root){
            if(root == null) return 0;
            
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
        public static int countNode(Node root){
            if (root == null) {
                return 0;
            }
            int leftCount = countNode(root.left);
            int rightCount = countNode(root.right);
            return leftCount + rightCount + 1;
        }
        public static int sum(Node root){
            if (root == null) {
                return 0;
            }
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum + rightSum + root.data;
        }
        public static int diameter(Node root){
            if (root == null) {
                return 0;
            }
            int leftdia = diameter(root.left);
            int rightdia = diameter(root.right);
            int rootdia = height(root.left) + height(root.right) + 1;
            return Math.max(Math.max(rightdia, leftdia), rootdia);
        }
        public static TreeInfo dia2(Node root){
            if (root == null) {
                return new TreeInfo(0, 0);
            }
            TreeInfo left = dia2(root.left);
            TreeInfo right = dia2(root.right);
            int height = Math.max(left.ht, right.ht)+1;
            int dia1 = left.dia;
            int dia2 = right.dia;
            int dia3 = left.ht + right.ht +1;
            int diameter = Math.max(Math.max(dia1, dia2), dia3);
            return new TreeInfo(height, diameter);
        }
        public static List<List<Integer>> levelOrderBottom(Node root){
            List<List<Integer>> list = new LinkedList<>();
            if (root == null) {
                return list;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int levelSize = q.size();
                List<Integer> res = new ArrayList<>();
                for(int i=0; i<levelSize; i++){
                    Node curr = q.poll();
                    res.add(curr.data);
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                list.add(0, res);
            }
            return list;
        }

    }
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> list = new LinkedList<>();
    //     if(root == null){
    //         return list;
    //     }
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.add(root);
    //     while(!q.isEmpty()){
    //         int levelSize = q.size();
    //         List<Integer> res = new ArrayList<>();
    //         for(int i=0; i<levelSize; i++){
    //             TreeNode curr = q.poll();
    //             res.add(curr.val);
    //             if(curr.left != null){
    //                 q.add(curr.left);
    //             }
    //             if(curr.right != null){
    //                 q.add(curr.right);
    //             }          
    //         }
    //         list.add(res);
    //     }
    //     return list;
    // }

    public static void main(String[] args) {
        int []nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree tree = new BuildTree();
        Node root = tree.create(nodes);
        // System.out.println("Preorder traversal of the tree");
        // tree.preOrder(root);
        // System.out.println();
        // // System.out.println(root.data);
        // System.out.println("Inorder traversal of the tree :" );
        // tree.inOrder(root);
        // System.out.println();
        // System.out.println("Postorder traversal of the tree");
        // tree.postOrder(root);
        // System.out.println("Levelorder traversal of the tree");
        // tree.levelOrder(root);
        System.out.println("LevelorderBottom traversal of the tree");
        List<List<Integer>> res = tree.levelOrderBottom(root);
        for(int i = 0; i<res.size(); i++){
        }
        // System.out.println(tree.height(root));
        // System.out.println(tree.countNode(root));
        // System.out.println(tree.sum(root));
        // System.out.println(tree.diameter(root));
        System.out.println(tree.dia2(root).ht);
    }
}
