interface Animal {
    int eyes = 2;
    void walk();// In auto its abstrack and public.
}
class donky implements Animal {
    static String age;
    public void walk(){
        System.out.println("It's walk on four legs.");
    }
    public void eyes(){
        System.out.println("It's eyes only two. ");
    }
}
public class Interface {
    public static void main(String[] args) {
         donky d = new donky();
         d.walk();
         d.eyes();
         donky.age = 19;

    }
    
}
