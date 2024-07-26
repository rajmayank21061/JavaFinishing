class polyphism {
    String name;
    int age;
    public void printer(String name){
        System.out.println(name);
    }
    public void printer(int age){
        System.out.println(age);
    }
    public void printer(String name, int age){
        System.out.println("Name: "+ name + "  "+ age);
    }
}
public class Polymorphism {
public static void main(String[] args) {
        
polyphism st1 = new polyphism();
st1.name = "Bablu";
st1.age = 24;
st1.printer(st1.name,st1.age);

}    
}