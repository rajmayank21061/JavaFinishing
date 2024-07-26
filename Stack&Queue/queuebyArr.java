public class queuebyArr {
        static class Queue {
            static int arr[];
            static int size;
            static int rear = -1;
            static int front = -1;
            Queue(int n) {
                this.size = n;
                arr = new int[n];
            }
    
            public static boolean isEmpty() {
                return rear == -1 && front == -1;
            }
    
            public static boolean isFull() {
                return  (rear + 1)%size == front;
                //return rear == size - 1;
            }
    
            public static void add(int data) {
                if (isFull()) {
                    System.out.println("Queue is Full!");
                    return;
                }
                rear++;
                arr[rear] = data;
            }
    
            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                int front = arr[0];
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
                return front;
            }
    
            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return arr[0];
            }
        }
    
        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(9);
    
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    
}
