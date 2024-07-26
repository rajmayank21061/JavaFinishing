public class stackusingLL {
    public static Node head;
    static class Node{
        int data;
        Node next;
    public Node(int data){
            this.data = data;
            this.next = null;
        }
     }
     public static boolean isEmpty(){
        return head == null;
     }
     public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode; 
     }
     public static int pop(){
        if(head == null){ //if Stack is empty.
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
     }
     public static int peak(){
        if( isEmpty()){
            System.out.println("Stack is empty.");
        }
        return head.data;
        
     }

   public static void main(String[] args) {
    stackusingLL stack = new stackusingLL();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    while (!stack.isEmpty()) {
        System.out.println(stack.peak());
        stack.pop();
    }
   }
}
