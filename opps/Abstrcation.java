abstract class creatureHIM{
    abstract void fly();

    creatureHIM(){
        System.out.println("The base constructor call first.");
    }
    public void bodyColor(){
        System.out.println("This creature body color is black.");
    }
}
class horse extends creatureHIM {
    horse(){
        System.out.println("The Derieved constructor call .");
    }

    public void fly(){
        System.out.println("Horse is not fly.");
    }
}
class birds extends creatureHIM {
    public void fly(){
        System.out.println("birds is fly.");
    }
}
public class Abstrcation {
    public static void main(String[] args) {
        horse h  = new horse();
    }
}
