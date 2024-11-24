public class IdenticalBT {
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
    static class Tree{
        static int idx = -1;
        public static Node create(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = create(nodes);
            newNode.right = create(nodes);
            return newNode;
        }
        public static boolean isIdentical(Node root, Node subRoot){
            if (root == null && subRoot == null) {
                return true;
            }
            if(root == null || subRoot == null){
                return false;
            }
            if (root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }
        public static boolean isSubtree(Node root, Node subRoot){
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (isIdentical(root, subRoot)) {
                return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }
    public static void main(String[] args) {
        int nodes[] = new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    }
}
