import java.util.ArrayList;

public class BST {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = right = null;
        }
    }
    static class BSTMethods{
        public static Node createBST(Node root, int val){
            if (root == null) {
                root = new Node(val);
                return root;
            }
            
            if (root.val>val) {
                root.left = createBST(root.left, val);
            }
            else{
                root.right = createBST(root.right, val);
            }
            return root;
        }
        public static void inOrderTraversal(Node root){
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.val+" ");
            inOrderTraversal(root.right);
        }
        public static boolean isPresent(Node root, int key){
            if (root == null) {
                return false;
            }
            if (root.val>key) {
                return isPresent(root.left, key);
            }
            else if (root.val == key) {
                return true;
            }else{
                return isPresent(root.right, key);
            }
        }
        public static Node delete(Node root, int key){
            if (root == null) {
                return null;
            }
            if (key<root.val) {
                root.left = delete(root.left, key);
            }
            else if (key> root.val) {
                root.right = delete(root.right, key);
            }
            else{

                //case 1: root has 0 child or leaf node
                if(root.left == null && root.right ==null){
                    return null;
                }
                // case 2: root has either left child or right child
                else if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }
                //case 3: root has 2 children
                else{
                    Node IS = inorderSuccessor(root.right);
                    root.val = IS.val;
                    root.right = delete(root.right, IS.val);
                }
            }
            return root;
        }
        public static Node inorderSuccessor(Node root){
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
        public static void printRootToLeaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }
            path.add(root.val);

            if (root.left == null && root.right == null) {
                printPath(path);

            }
            else{
                printRootToLeaf(root.left, path);
                printRootToLeaf(root.right, path);
            }
            path.remove(path.size()-1);

        }
        public static void printPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
        public static void printRange(Node root, int x, int y){
            if (root == null) {
                return;
            }
            if (root.val>=x && root.val<=y) {
                printRange(root.left, x, y);
                System.out.print(root.val+" ");
                printRange(root.right, x, y);
            }
            else if (root.val>y) {
                printRange(root.left, x, y);
            }else{
                printRange(root.right, x, y);
            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 6, 4, 3, 2, 8};
        Node root = null;
        BSTMethods tree = new BSTMethods();
        for(int i=0; i<nodes.length; i++){
            root = tree.createBST(root, nodes[i]);
        }
        tree.inOrderTraversal(root);
        System.out.println();
        tree.delete(root, 4);
        tree.inOrderTraversal(root);
        tree.printRootToLeaf(root, new ArrayList<>());
        // boolean res = tree.isPresent(root, 30);
        // System.out.println();
        // if (res) {
        //     System.out.println("Value found in tree");
        // }else{
        //     System.out.println("value not found");
        // }
        System.out.println();
        tree.printRange(root, 2, 6);

    }
}
