class Modifiers {
    String name; //Default Modifiers
    public String nickName; //Public Modifiers
    protected String email;
    private int age;
    
    //How to access in outside of class
    //Using get and set ;
    public int getage() {
        return this.age;
    }
    public void setage(int newAge){
        this.age = newAge;
    }

    
}
public class AccessModifiers {
    public static void main(String[] args) {
        Modifiers type1 = new Modifiers();
        type1.setage(15);
        System.out.println(type1.getage()); 
    }
}
