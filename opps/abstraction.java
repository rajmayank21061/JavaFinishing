abstract class animal {
    animal (){
        System.out.println("All are animals.....!");
    }
    public abstract void sound();  
} 
class dog extends animal {
     dog(){
        super();
     }
    public void sound() {
        System.out.println("Dog is barking");
    }
}
class lion extends animal {
    //same as you call 
    lion(){
        super();
    }
    public void sound(){
        System.out.println("Lion is roaring.");
    }
}
/**
 * Inneranimal
 */
public class abstraction{
public static void main(String args[]){
    dog dg = new dog();
    lion ln = new lion();
    dg.sound();
    ln.sound();
}
}