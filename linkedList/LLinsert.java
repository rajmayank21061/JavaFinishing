public class LLinsert {
    Node head;
    private int size;
    LLinsert(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
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
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if(head.next == null){ //when only one LL
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
      
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void printSize(){
        System.out.println(size);
    }

    public static void main(String[] args) {
        LLinsert list = new LLinsert();
        list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.addFirst("-a");
        list.printList();
        list.deleteLast();
        list.printList();
        list.printSize();
    }
}
