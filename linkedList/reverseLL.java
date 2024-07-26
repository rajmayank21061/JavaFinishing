// Java program for reversing the linked list

public class reverseLL {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

public void reverseIterator(){
if(head == null || head.next == null){
    return;
}
Node preNode = head;
Node curNode = head.next;
while (curNode != null) {
    Node nextNode = curNode.next;
    curNode.next = preNode;
    //modify
    preNode = curNode;
    curNode = nextNode;
}
head.next = null; 
head = preNode;
}
public Node reverseRecursive(Node head){
    if(head == null || head.next == null){
        return head;
    }
    Node newHead = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;
}
    void printList()
    {
        Node newNode = head;
        while ( newNode != null) {
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.println("null");
    }

    // Driver Code
    public static void main(String[] args)
    {
        reverseLL list = new reverseLL();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        //list.reverseIterator();
        list.head = list.reverseRecursive(list.head);
        list.printList();
        

       
    }
}
