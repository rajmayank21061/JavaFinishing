import java.util.LinkedList;

import java.util.Queue;

public class createTree {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int dataValue) {
            this.data = dataValue;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrdered(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrdered(root.left);
            preOrdered(root.right);
        }
        public static void inOrdered(Node root){
            if(root == null){
                return;
            }
            inOrdered(root.left);
            System.out.print(root.data + " ");
            inOrdered(root.right);
        }
        public static void postOrdered(Node root){
            if(root== null){
                return;
            }
            postOrdered(root.left);
            postOrdered(root.right);
            System.out.print(root.data + " ");
        }
        public static void leverOrdered(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
             } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //tree.preOrdered(root);
        //tree.inOrdered(root);
        //tree.postOrdered(root);
        //tree.leverOrdered(root);
        int tn = tree.countNodes(root);
        System.out.print(tn);
    }
}
 