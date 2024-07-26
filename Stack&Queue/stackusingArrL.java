import java.util.ArrayList;

public class stackusingArrL {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void push (int data){
           if(isEmpty()){
            System.out.println("Stack is empty.");
           }
           list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() -1);
            return top; 
        }
        //peak
        public static int peak(){
            int p = list.get(list.size()-1);
            return p;
        }
    }
        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(11);
            st.push(22);
            st.push(33);
            st.push(44);
            st.push(55);
            
            while (!st.isEmpty()) {
                System.out.println(st.peak());
                st.pop();
            }
    }
}
