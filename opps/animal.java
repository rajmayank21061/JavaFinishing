public abstract class pashu{
    pashu(){
        System.out.println("The pashu pakshi constructor.");
    }
    public abstract void sound();
}
class dog extends pashu{
    dog(){
        super();
    
    }
    public void sound(){
            System.out.println("Bhau Bhau");
    }
}
public class animal {
public static void main(String[] args) {
    dog d  = new dog();
    d.sound();
}
    
}