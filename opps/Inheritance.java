class Company {
    String owner;
    int budget;
}
class Service1 extends Company {
    Service1(){
        System.out.println("Electronics products produce.");
    }
}
class Service2 extends Company{ //Heirical Inheritance
    Service2(){
        System.out.println("Mechanical products produce.");
    }
}
class Service3 extends Service2 { // Multi Inheritace
    Service3(){
        System.out.println("Mechanical products produce.");
    }
} 
public class Inheritance {
    public static void main(String[] args) {
        Service3 s3 = new Service3();
    }
}
