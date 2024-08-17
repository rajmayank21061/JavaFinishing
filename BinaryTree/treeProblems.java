
public class treeProblems {
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
        //Insert a data
       public static Node insertData(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }
            if(root.data > val){
                root.left = insertData(root.left , val);
            }
            if(root.data < val){
                root.right = insertData(root.right, val);
            }
            return root;
        }

        //Q1 Count no of Nodes
        public static int countNodes(Node root){
            if (root == null) {
                return 0;
            }
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);

            return leftNodes + rightNodes + 1;
            
        }
        //Q2 Sum of Nodes(data)
        public static int sumOfNodes(Node root){
            if( root == null){
                return 0;
            }
            int sumOfLeft = sumOfNodes(root.left);
            int sumOfRight = sumOfNodes(root.right);

            return sumOfLeft + sumOfRight + root.data;
        }
        //Q3 calculate height means level
        public static int calHeight(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = calHeight(root.left);
            int rightHeight = calHeight(root.right);

            if(leftHeight > rightHeight){
                return leftHeight + 1;
            } 
            else{
                return rightHeight + 1;
            }
        }
        //Q4  calculate Diameter approach 1 TC = O(N^2)
        public static int calDiameter(Node root){
            if(root == null){
                return 0;
            }
            int dia1 = calDiameter(root.left);
            int dia2 = calDiameter(root.right);

            int dia3 = calHeight(root.left) + calHeight(root.right) + 1;
            
            return Math.max(Math.max(dia1, dia2),dia3);
        }
        //calculate diameter approach 2 TC = O(N)
    static class treeInfo{
        int ht;
        int diam;
        treeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static treeInfo calDiameter2(Node root){
        if (root == null) {
            return new treeInfo(0, 0);
        }
        treeInfo left = calDiameter2(root.left);
        treeInfo right = calDiameter2(root.right);
        
        int myHeight = Math.max(left.ht,right.ht) + 1;
        
        int dia1 =left.diam;
        int dia2 = right.diam;
        int dia3 = left.ht + right.ht +1;
        //int dia3 = calHeight(root.left) + calHeight(root.right) + 1;


        int myDiameter = Math.max(Math.max(dia1, dia2), dia3);
        treeInfo myInfo = new treeInfo(myHeight, myDiameter);
        return myInfo;
    }
    //print in Inorder
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(tree.countNodes(root));
        //System.out.println(tree.sumOfNodes(root));
        //System.out.println( tree.calHeight(root) );
        //System.out.println(tree.calDiameter(root));
        //System.out.println(BinaryTree.calDiameter2(root).diam);
        for(int i = 0; i<nodes.length; i++){
        root = tree.insertData(root, nodes[i]);
        }

        tree.inOrder(root);
    }
}
