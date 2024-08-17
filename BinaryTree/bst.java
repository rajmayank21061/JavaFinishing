import java.util.ArrayList;
import java.util.List;

public class bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean searchBST(Node root, int k) {
        if (root == null) {
            return false;
        }
        if (root.data == k) {
            return true;
        }
        if (root.data > k) {
            return searchBST(root.left, k);
        } else {
            return searchBST(root.right, k);
        }
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            Node iS = inOrderSuccessor(root.right);
            root.data = iS.data;
            root.right = delete(root.right, iS.data);
        }
        return root;
    }
   //left most node of right subtree
    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void printRange(Node root, int X , int Y){
        if(root == null){
            return;
        }
        if(root.data>= X && root.data <= Y){
            printRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printRange(root.left, X, Y);
        }
        else{
            printRange(root.right, X, Y);
        }
    }
    public static void printPath(List<Integer> list){
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void allBranch(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        if (root.left == null && root.right == null) {
           printPath(list);
        }
        else{
        allBranch(root.left,list);
        allBranch(root.right,list);
        }
        list.remove(list.size() - 1);
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inOrder(root);
        System.out.println();

        if (searchBST(root, 8)) {
            System.out.println("Found.");
        } else {
            System.out.println("Not Found.");
        }

        root = delete(root, 6);
        System.out.println();
        printRange(root, 5, 10);
        System.out.println();
        //inOrder(root);
        List<Integer> list = new ArrayList<>();
        allBranch(root, list);

    }
}
