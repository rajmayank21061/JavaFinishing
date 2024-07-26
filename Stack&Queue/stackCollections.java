import java.util.Stack;

public class stackCollections {
     public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(11);
            st.push(22);
            st.push(33);
            st.push(44);
            st.push(55);
            
            while (!st.isEmpty()) {
                System.out.println(st.peek());
                st.pop();
            }
}
}