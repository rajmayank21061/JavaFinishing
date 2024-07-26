public class queuebyLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
        static class Queue {
            static Node head = null;
            static Node tail = null;
    
            public static boolean isEmpty() {
                return head == null && tail == null;
            }

            public static void add(int data) {
                Node newNode = new Node(data);
                if(tail == null){
                    tail = head = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }
    
            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                int front = head.data;
                if(head.next == null){
                    tail = null;
                }
                head = head.next;
                return front;
            }
    
            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return head.data;
            }
        }
    
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.remove();
            q.add(88);
            q.remove();
            q.add(99);
    
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
}
