import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueByCollection {
    public static void main(String[] args) {
            //Queue q = new LinkedList<>();
            Queue q = new ArrayDeque<>();
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
